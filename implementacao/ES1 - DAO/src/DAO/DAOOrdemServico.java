package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Etapa;
import Model.OrdemServico;
import Model.Peca;
import Model.Servico;

public class DAOOrdemServico {
	
	
	/*public static void main(String[] args) throws Exception{
		DAOOrdemServico dao = new DAOOrdemServico();
		ArrayList<OrdemServico> os = dao.consultarPorPlaca("AMM-1234");
		
		System.out.println("a");
	}*/
	
	public ArrayList <OrdemServico> consultarPorPlaca(String placa) throws Exception {
		ArrayList <OrdemServico> list = new ArrayList <OrdemServico> ();
		SQLConnector connector = new SQLConnector();
		String query = "SELECT * FROM Veiculo INNER JOIN OrdemServico ON idVeiculo = Veiculo_idVeiculo WHERE placa = '"+placa+"';";
		ResultSet result = connector.executeQuery(query);
		while (result.next()) {
			OrdemServico ordemServico = new OrdemServico();
			Etapa etapa = new Etapa();
			ArrayList <Peca> pecas = new ArrayList <Peca> ();
			ArrayList <Servico> servicos = new ArrayList <Servico> ();
			
			etapa = consultarEtapa(result.getInt("Etapa_idEtapa"));
			pecas = consultarPeca(result.getInt("idOrdemServico"));
			servicos = consultarServico(result.getInt("idOrdemServico"));
			ordemServico.setData(result.getString("data"));
			ordemServico.setEtapa(etapa);
			ordemServico.setIdOrdemServico(result.getInt("idOrdemServico"));
			ordemServico.setPeca(pecas.toArray(new Peca[pecas.size()]));
			ordemServico.setServico(servicos.toArray(new Servico[servicos.size()]));
			
			float preco = 0;
			for(Peca peca : pecas) {
				preco+=peca.getPreco();
			}
			
			float horasServicos = 0;
			for(Servico servico : servicos) {
				horasServicos+=servico.getHoras();
				preco+=servico.getPreco();
			}
			
			
			ordemServico.setPreco(preco);
			ordemServico.setHoras(horasServicos);
			
			list.add(ordemServico);
		}
		connector.close();
		return list;
	}
	
	public Etapa consultarEtapa(int idEtapa) throws Exception{
		Etapa etapa = new Etapa();
		
		SQLConnector connector = new SQLConnector();
		String query = "SELECT * FROM Etapa WHERE idEtapa = "+idEtapa+";";
		ResultSet result = connector.executeQuery(query);
		result.next();
		etapa.setEtapa(result.getString("etapa"));
		etapa.setIdEtapa(result.getInt("idEtapa"));
		
		connector.close();
		return etapa;
	}
	
	public ArrayList<Peca> consultarPeca(int idOrdemServico) throws Exception{
		ArrayList<Peca> peca = new ArrayList<Peca>();
		
		SQLConnector connector = new SQLConnector();
		String query = "SELECT * FROM PecaOrdemServico INNER JOIN Peca ON Peca_idPeca = idPeca WHERE OrdemServico_idOrdemServico = "+idOrdemServico+";";
		ResultSet result = connector.executeQuery(query);
		
		while (result.next()) {
			Peca p = new Peca();
			p.setIdPeca(result.getInt("idPeca"));
			p.setMarca(result.getString("marca"));
			p.setNome(result.getString("nome"));
			p.setPreco(result.getFloat("preco"));
			
			peca.add(p);
		}
		
		connector.close();
		return peca;
	}
	
	public ArrayList<Servico> consultarServico(int idOrdemServico) throws Exception{
		ArrayList<Servico> servico = new ArrayList<Servico>();
		
		SQLConnector connector = new SQLConnector();
		String query = "SELECT * FROM ServicoOrdemServico INNER JOIN Servico ON Servico_idServico = idServico WHERE OrdemServico_idOrdemServico = "+idOrdemServico+";";
		ResultSet result = connector.executeQuery(query);
		
		while (result.next()) {
			Servico s = new Servico();
			s.setHoras(result.getFloat("horas"));
			s.setIdServico(result.getInt("idServico"));
			s.setNome(result.getString("nome"));
			s.setPreco(result.getFloat("preco"));
			
			servico.add(s);
		}
		
		connector.close();
		return servico;
	}
	
}

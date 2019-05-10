package Model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdemServico {

	private int idOrdemServico;

	private float horas;

	private float preco;

	private Date data;

	private Servico[] servico;

	private Peca[] peca;

	private Etapa etapa;

	public int getIdOrdemServico() {
		return idOrdemServico;
	}

	public void setIdOrdemServico(int idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}

	public float getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public String getSQLData() {
		if (data == null)
			return "null";
		SimpleDateFormat stringify = new SimpleDateFormat("yyyy-MM-dd");
		return "'" + stringify.format(data) + "'";
	}
	public String getStringData() {
		SimpleDateFormat stringify = new SimpleDateFormat("dd/MM/yyyy");
		return stringify.format(data);
	}
	public boolean setData(String data) {
		String format = "dd/MM/yyyy";
		if (data.indexOf("-") != -1) {
			format = "yyyy-MM-dd";
		}
		SimpleDateFormat parser = new SimpleDateFormat(format);
		try {
			this.data = parser.parse(data);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	public Servico[] getServico() {
		return servico;
	}

	public void setServico(Servico[] servico) {
		this.servico = servico;
	}

	public Peca[] getPeca() {
		return peca;
	}

	public void setPeca(Peca[] peca) {
		this.peca = peca;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	

}

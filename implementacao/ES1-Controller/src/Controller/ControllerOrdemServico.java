package Controller;
import DAO.DAOOrdemServico;
import Model.OrdemServico;


public class ControllerOrdemServico {
		DAOOrdemServico dao = new DAOOrdemServico();
		
		public boolean isPlacaValida(String placa) throws Exception{
			
			if(Character.isLetter(placa.charAt(0)) && Character.isLetter(placa.charAt(1)) && Character.isLetter(placa.charAt(2)) && 
					placa.charAt(3) == '-' && Character.isDigit(placa.charAt(4)) && Character.isDigit(placa.charAt(5)) && 
					Character.isDigit(placa.charAt(6)) && Character.isDigit(placa.charAt(7))) {
				return true;
			}
			return false;
		}
		
		public OrdemServico consultarPorPlaca(String placa) throws Exception{
			
			if(!isPlacaValida(placa)) {
				throw new Exception();
			}	
			
			return dao.consultarPorPlaca(placa).get(0);
		}
		
	
}

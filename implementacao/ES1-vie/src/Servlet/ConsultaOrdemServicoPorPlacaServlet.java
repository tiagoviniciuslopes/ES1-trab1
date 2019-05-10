package Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.ControllerOrdemServico;
import Model.OrdemServico;

@WebServlet("/consultas/consultaOrdemServico")
public class ConsultaOrdemServicoPorPlacaServlet extends HttpServlet{
		ControllerOrdemServico controller = new ControllerOrdemServico();

		protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
			try {
				OrdemServico os =  controller.consultarPorPlaca(request.getParameter("placa"));
				
				PrintWriter out = response.getWriter();
				
				out.print(os.getEtapa().getEtapa());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			
			//return service(request, response);
			
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			
			//return service(request, response);
			
		}
		
	
}

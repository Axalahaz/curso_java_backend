package educacionit.javawebapi.controller;

import java.io.IOException;

import educacionit.repository.dtos.ProductoDTO;
import educacionit.service.ProductoService;
import educacionit.service.impl.ProductoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/api/producto")
public class ProductoController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// ...busca un producto en la BBDD por su id
		String id = req.getParameter("id");
		Long idL = Long.parseLong(id);
		
		// ahora instancio el servicio
		ProductoService service = new ProductoServiceImpl();
		// obtengo el prodcuto usando el servicio
		ProductoDTO productoDTO = service.getById(idL);
		// propio de los Servlet, para escribir en el response directamente
		//resp.getWriter().print(productoDTO.toString());
		
		// guarda en la sesion el objeto como object
		req.getSession().setAttribute("PRODUCTO", productoDTO);
		
		//redirect
		getServletContext().getRequestDispatcher("/datos.jsp").forward(req, resp);
		
	}
}

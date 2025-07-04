<%@page import="educacionit.repository.dtos.ProductoDTO" %>
<html>
<header></header>
<body>

	<%
		//obtiene o baja el dato de sesion (el objeto session existe de manera implicita en las jsp)
		//se debe caster de object mi objeto: ProductoDTO
		ProductoDTO producto = (ProductoDTO)session.getAttribute("PRODUCTO");
	%>

	<div>
		<label>ID:</label> <%=producto.getId() %>
		<label>Precio:</label> <%=producto.getPrecio() %>
		<label>Titulo:</label> <%=producto.getTitulo() %>
		<label></label>
		<label></label>
		<label></label>
	</div>
</body>
</html>
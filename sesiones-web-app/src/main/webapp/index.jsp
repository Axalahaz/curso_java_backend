<html>
<header>
	<title>java-web-api</title>
</header>
<body>

<h2>Producto:</h2>
<form method="get" action="<%=request.getContextPath()%>/api/producto">
<input type="hidden" name="id" value="1"/>
<button>Consultar</button>

</form>

</body>
</html>
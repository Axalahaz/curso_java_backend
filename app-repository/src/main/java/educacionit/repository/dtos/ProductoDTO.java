package educacionit.repository.dtos;

public class ProductoDTO {
	private Long id;
	private String titulo;
	private Double precio;
	
	public ProductoDTO(Long id,String titulo,Double precio){
		setId(id); // forma correcta
		this.titulo = titulo; // forma incorrecta
		this.precio = precio;
	}
	
	//! validacion id (setter)
	private void setId(Long id) {
		if(id==null || id < 0) {
			throw new IllegalArgumentException("Id no puede ser nulo ni < 0"); // error runtime
		}
		// .. si al final todo ok:
		this.id = id;
	}
	
	//! Getter
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "ProductoDTO {id=" + id + ", titulo=" + titulo + ", precio=" + precio + "}";
	}
	
}//fin class



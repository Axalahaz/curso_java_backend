package educacionit.repository.repository;

import educacionit.repository.dtos.ProductoDTO;

public interface ProductoRepository {
	// creacion CRUD
	public void save(ProductoDTO entity);
	public ProductoDTO getById(Long id);
	public ProductoDTO update(ProductoDTO entity);
	public ProductoDTO delete(Long id);
}

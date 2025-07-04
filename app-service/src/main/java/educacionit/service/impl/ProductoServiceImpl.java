package educacionit.service.impl;

import educacionit.service.ProductoService;
import educacionit.repository.dtos.ProductoDTO;
import educacionit.repository.repository.ProductoRepository;
import educacionit.repository.repository.impl.ProductoRepositoryMySQLImpl;

public class ProductoServiceImpl implements ProductoService{
	// intyecto dependencia
	private ProductoRepository repository;
	
	public ProductoServiceImpl() {
		inyectarClases();
	}
	
	private void inyectarClases() {
		this.repository = new ProductoRepositoryMySQLImpl();
	}
	
	@Override
	public ProductoDTO getById(Long id) {
		return this.repository.getById(id);
	}
}

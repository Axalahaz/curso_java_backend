package educacionit.service;

import educacionit.repository.dtos.ProductoDTO;

public interface ProductoService {
	public ProductoDTO getById(Long id);
}

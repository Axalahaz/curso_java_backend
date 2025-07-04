package educacionit.repository.repository.impl;

import educacionit.repository.dtos.ProductoDTO;
import educacionit.repository.repository.ProductoRepository;

public class ProductoRepositoryMySQLImpl implements ProductoRepository{

	@Override
	public void save(ProductoDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoDTO getById(Long id) {
		// hardcore 
		String sql = "SELECT * from producto where id=" + id;
		System.out.println(sql);
		
		// simulacion salida
		Long _id = id;
		String titulo = "producto simulado desde app-repository";
		Double precio = 1000.10d;
		
		// instancio
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public ProductoDTO update(ProductoDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

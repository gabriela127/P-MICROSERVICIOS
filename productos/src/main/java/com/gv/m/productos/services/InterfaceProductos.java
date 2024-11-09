package com.gv.m.productos.services;

import java.util.List;
import java.util.Optional;

import com.gv.m.productos.entity.ProductosClase;

public interface InterfaceProductos {
	
	List<ProductosClase> findAll();
	Optional<ProductosClase> findById(Integer id_Producto);
	ProductosClase save(ProductosClase productos);
	ProductosClase update(Integer id_Productos, ProductosClase productos);
	Integer deleteById(Integer id);

}

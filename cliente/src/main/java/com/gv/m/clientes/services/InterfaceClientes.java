package com.gv.m.clientes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.gv.m.clientes.entity.Clientes;

@Service
public interface InterfaceClientes {
	
	List<Clientes> findAll();
	Optional<Clientes> findById(Integer id);
	Clientes save(Clientes clientes);
	Clientes update(Integer id, Clientes clientes);
	Integer deleteById(Integer id);
}

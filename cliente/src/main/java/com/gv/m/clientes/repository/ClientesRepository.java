package com.gv.m.clientes.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gv.m.clientes.entity.Clientes;

public interface ClientesRepository extends CrudRepository<Clientes, Integer> {
	Optional<Clientes> findByNit(String nit);
   
}

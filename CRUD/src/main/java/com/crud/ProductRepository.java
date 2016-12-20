/**
 * 
 */
package com.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.crud.Product;


@Transactional
	public interface ProductRepository extends CrudRepository<Product, Integer>{
// Integer es la clase helper asociada a int		
	}


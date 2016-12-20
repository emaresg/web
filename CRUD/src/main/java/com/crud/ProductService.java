/**
 * 
 */
package com.crud;

import com.crud.*;

public interface ProductService {
	Iterable<Product> listAllProducts();
	Product getProductById(Integer id);
	Product saveProduct(Product product);
	void deleteProduct(Integer id);

}

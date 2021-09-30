package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
		DataResult<List<Product>> getAll();
		Result add(Product product);
		DataResult<Product> getByProductName(String productName);
		DataResult<Product> getByProductNameAndCategoryId(String productName,int categoryId);
		DataResult<List<Product>> getByCategoryId(int categories);
}

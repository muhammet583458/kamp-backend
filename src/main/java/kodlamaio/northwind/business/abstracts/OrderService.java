package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Order;

public interface OrderService {
	DataResult<List<Order>> getAll();
	Result add(Order order);
	DataResult<Order> getLast();
}

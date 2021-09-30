package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.OrderDetail;


public interface OrderDetailService {
	DataResult<List<OrderDetail>> getAll();
	Result add(OrderDetail orderDetail);
	Result delete(OrderDetail orderDetail);
	Result deleteById(int id);
}

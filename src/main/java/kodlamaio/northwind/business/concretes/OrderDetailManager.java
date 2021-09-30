package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.OrderDetailService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.OrderDetailDao;

import kodlamaio.northwind.entities.concretes.OrderDetail;

@Service
public class OrderDetailManager implements OrderDetailService{

		private OrderDetailDao orderDetailDao;
			
			@Autowired
			public OrderDetailManager(OrderDetailDao orderDetailDao) {
				// TODO Auto-generated constructor stub
			
				super();
				this.orderDetailDao = orderDetailDao;
			}
			@Override
			public DataResult<List<OrderDetail>> getAll() {
				
				return new SuccessDataResult<List<OrderDetail>>(this.orderDetailDao.findAll(),"Siparişler listelendi");
			}
			@Override
			public Result add(OrderDetail orderDetail) {
				this.orderDetailDao.save(orderDetail);
				return new SuccessResult("Sipariş Eklendi");
			}
			@Override
			public Result delete(OrderDetail orderDetail) {
				this.orderDetailDao.delete(orderDetail);
				return new SuccessResult("Sipariş Silindi");
			}
			@Override
			public Result deleteById(int id) {
				this.orderDetailDao.deleteById(id);

				return new SuccessResult("Sipariş Silindi");
			}
			
}

package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.OrderDetailService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.OrderDetail;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/orderdetails")
public class OrderDetailsController {

		private OrderDetailService orderDetailService;
		@Autowired
		public OrderDetailsController(OrderDetailService orderDetailService) {
			super();
			this.orderDetailService = orderDetailService;
		}
	
		@GetMapping("/getall")
		public DataResult<List<OrderDetail>> getAll(){
			return this.orderDetailService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody OrderDetail order) {
			return this.orderDetailService.add(order);
		}
		@PostMapping("/delete")
		public Result delete(@RequestBody OrderDetail order) {
			return this.orderDetailService.delete(order);
		}
		@PostMapping("/delete/{id}")
		public Result deleteById(@PathVariable int id) {
			return this.orderDetailService.deleteById(id);
		}
}

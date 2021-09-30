package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.OrderService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Order;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
	
		private OrderService orderService;
		@Autowired
		public OrdersController(OrderService orderService) {
			super();
			this.orderService = orderService;
		}
	
		@GetMapping("/getall")
		public DataResult<List<Order>> getAll(){
			return this.orderService.getAll();
		}
		@GetMapping("/getlast")
		public DataResult<Order> getLast(){
			return this.orderService.getLast();
		}
		@PostMapping("/add")
		public Result add(@RequestBody Order order) {
			return this.orderService.add(order);
		}
}
//KAYDETMİYOR
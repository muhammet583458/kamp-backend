package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer>{

}

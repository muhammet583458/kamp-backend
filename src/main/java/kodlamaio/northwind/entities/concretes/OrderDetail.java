package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_detail_id")
	private int id;
	
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="quantity")
	private short quantity;

	public OrderDetail() {
		super();
	}

	public OrderDetail(int id, int orderId, int productId, double unitPrice, short quantity) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getQuantity() {
		return quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}
	
	
}

package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
		@Id
		@Column(name="category_id")
		private int id;
		
		@Column(name="category_name")
		private String categoryName;
		
		@OneToMany(mappedBy = "category")
		private List<Product> products;
		
		public Category() {
			
		}
		public Category(int id, String categoryName) {
			super();
			this.id = id;
			this.categoryName = categoryName;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		
}

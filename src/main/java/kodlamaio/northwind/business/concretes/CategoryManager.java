package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.CategoryService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.CategoryDao;
import kodlamaio.northwind.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;
	
	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}
	@Override
	public DataResult<List<Category>> getAll() {
		
		return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(),"Kategoriler listelendi");
	}
	@Override
	public Result add(Category category) {
		this.categoryDao.save(category);
		return new SuccessResult("Ürün Eklendi");
		
	}

}

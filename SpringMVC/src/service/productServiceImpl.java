package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.productMapper;

import pojo.product;
@Service("hss")
public class productServiceImpl implements productService{
	@Autowired	
	productMapper hm;
	
	
	
	
	public productMapper getHm() {
		return hm;
	}

	public void setHm(productMapper hm) {
		this.hm = hm;
	}



	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return hm.insert();
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return hm.delete(id);
	}

	@Override
	public List<product> pagefeng(int begin, int size) {
		// TODO Auto-generated method stub
		return hm.pagefeng(begin, size);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return hm.count();
	}

}

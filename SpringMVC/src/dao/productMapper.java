package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.product;

public interface productMapper {
	public List<product> pagefeng(@Param("b")int begin,@Param("s")int size);
	 public int insert();
	 public int delete(int id);
	 public int count();
}

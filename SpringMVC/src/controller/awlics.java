package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.product;



import service.productService;

@Controller
public class awlics {
	@Autowired
	 productService hs;

	public productService getHs() {
		return hs;
	}

	public void setHs(productService hs) {
		this.hs = hs;
	}
	  

	@RequestMapping("ssg")
	public String Select(@RequestParam(defaultValue="1") int pageindex,HttpServletRequest request){
		int countpage;
		if(pageindex<1){
			return "index.jsp";
		}else{
			int begin  = (pageindex-1)*3;
			List<product> list = hs.pagefeng(begin, 3);
			System.out.println(list);
			request.getSession().setAttribute("list", list);
			
			request.getSession().setAttribute("pageindex", pageindex);
			int count = hs.count();
			
			if(count%3==0){
				countpage = count/3;
			}else{
				countpage = count/3+1;
			
		}
			request.getSession().setAttribute("countpage", countpage);
		
		}
		
		
		return "index.jsp";
		
	}
	@RequestMapping("del")
	public String delete(HttpServletRequest request,HttpServletResponse response){
		
		int num =  Integer.parseInt(request.getParameter("id"));
			int a= hs.delete(num);
			if(a>0){
				System.out.println("É¾³ý³É¹¦");
				
			}

		return Select(1, request);
		
	}
}

package com.sds.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	/**
	 * 
		 *    描述：处理查询图书
			 * 
			 * 
			 * @param 
			 * @return
	 */
	@RequestMapping(value = "/book/{bid}",method = RequestMethod.GET)
	public String getBook(@PathVariable("bid")String bid) {
		System.out.println("查询到了"+bid);
		return "success";
	}
	@RequestMapping(value = "/book/{bid}",method = RequestMethod.DELETE)
	public String deleteBook(@PathVariable("bid") String bid) {
		
		System.out.println("删除了"+bid);
		return  "success";
			
		}
	@RequestMapping(value = "/book/{bid}",method = RequestMethod.PUT)
	public String updateBook(@PathVariable("bid") String bid) {
		
		System.out.println("更新了"+bid);
		return  "success";
			
		}
	@RequestMapping(value = "/book/{bid}",method = RequestMethod.POST)
	public String postBook(@PathVariable("bid") String bid) {
		
		System.out.println("添加了了"+bid);
		return  "success";
			
		}
}

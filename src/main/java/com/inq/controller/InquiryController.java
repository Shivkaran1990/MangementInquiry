package com.inq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inq.dao.InquiryService;

@RestController
@RequestMapping("/inquiry")	
public class InquiryController {

	@Autowired
	InquiryService inquiryService;
	
	@RequestMapping("/getDetails/{id}")
	public List<Inquiry> getAllProducts(@PathVariable("id") String id)
	{
		System.out.print("we are here");
		System.out.print("we are here");
		System.out.print("we are here");
		
		List<Inquiry> list=inquiryService.getInqData(id);
		System.out.print("we are here");
		return list;       
	}

/*	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id) {
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.print("");	
		return productDAO.listActiveProductsByCategory(id);
				
	}*/
	
}

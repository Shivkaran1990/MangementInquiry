package com.inq.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.inq.controller.Inquiry;



@Component
public interface InquiryDao {
	
	void save(Inquiry inquiry);
	Inquiry getDataBasedOnID(String id);
	
	List<Inquiry> getInqData(String id);
	
	void updateInquiry(Inquiry inquiry);

}

package com.inq.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.inq.controller.Inquiry;
	

@Component
public interface InquiryService {
	void saveInquiryDetials(Inquiry inquiry);
	List<Inquiry> getInqData(String id);
	Inquiry getDataBasedOnID(String id);
	void updateInquiry(Inquiry inquiry);
}

package com.inq.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inq.controller.Inquiry;

	

@Transactional
@Component
public class InquiryServiceImpl implements InquiryService{
	@Autowired
    InquiryDao dao;
	@Override
	public void saveInquiryDetials(Inquiry inquiry) {
		
		dao.save(inquiry);
	}
	@Override
	public List<Inquiry> getInqData(String id) {
		
		return dao.getInqData(id);
	}
	@Override
	public Inquiry getDataBasedOnID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateInquiry(Inquiry inquiry) {
	dao.updateInquiry(inquiry);
		
	}

}

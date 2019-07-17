package com.inq.controller;

import org.apache.poi.ss.usermodel.Row;


public class ExelToBussinessObjectMapping {
	
   public static Inquiry mapInquiry(Row currentRow)
	{
		Inquiry inq=new Inquiry();
		if(currentRow.getCell(0)!=null)
		inq.setLastname(currentRow.getCell(0).toString());
		if(currentRow.getCell(1)!=null)
		inq.setFirstname(currentRow.getCell(1).toString());
		if(currentRow.getCell(2)!=null)
		inq.setDob(currentRow.getCell(2).toString());
		if(currentRow.getCell(3)!=null)
		inq.setInq_ids(currentRow.getCell(3).toString());
		if(currentRow.getCell(4)!=null)
		inq.setStreet(currentRow.getCell(4).toString());
		if(currentRow.getCell(5)!=null)
		inq.setCity(currentRow.getCell(5).toString());
		if(currentRow.getCell(6)!=null)
		inq.setState(currentRow.getCell(6).toString());
		if(currentRow.getCell(7)!=null)
		inq.setZip(currentRow.getCell(7).toString());
		if(currentRow.getCell(8)!=null)
		inq.setAcct(currentRow.getCell(8).toString());
		if(currentRow.getCell(9)!=null)
		inq.setLast_phy(currentRow.getCell(9).toString());
		if(currentRow.getCell(10)!=null)
		inq.setZ_code_visit(currentRow.getCell(10).toString());
		if(currentRow.getCell(11)!=null)
		inq.setSex(currentRow.getCell(11).toString());
		if(currentRow.getCell(12)!=null)
		inq.setAge_year(currentRow.getCell(12).toString());
		if(currentRow.getCell(13)!=null)
		inq.setAge_month(currentRow.getCell(13).toString());
		if(currentRow.getCell(14)!=null)
		inq.setPhy1(currentRow.getCell(14).toString());
		if(currentRow.getCell(15)!=null)
		inq.setPhy2(currentRow.getCell(15).toString());
		if(currentRow.getCell(16)!=null)
		inq.setPast_duedate(currentRow.getCell(16).toString());
		//inq.setUpcoming_day(currentRow.getCell(17).toString());
		if(currentRow.getCell(17)!=null)
		inq.setNlp(currentRow.getCell(17).toString());
		if(currentRow.getCell(18)!=null)
		inq.setNext_phydate(currentRow.getCell(18).toString());
		if(currentRow.getCell(19)!=null)
		inq.setAppt_setdate(currentRow.getCell(19).toString());
		if(currentRow.getCell(20)!=null)
		inq.setApptBy(currentRow.getCell(20).toString());
		if(currentRow.getCell(21)!=null)
		inq.setNewph1(currentRow.getCell(21).toString());
		if(currentRow.getCell(22)!=null)
		inq.setNewph2(currentRow.getCell(22).toString());
		if(currentRow.getCell(23)!=null)
		inq.setNewph3(currentRow.getCell(23).toString());
		if(currentRow.getCell(24)!=null)
		inq.setComment1(currentRow.getCell(24).toString());
		if(currentRow.getCell(25)!=null)
		inq.setComment2(currentRow.getCell(25).toString());	
		return inq;
	}

}

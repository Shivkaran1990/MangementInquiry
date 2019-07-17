package com.inq.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Inquiry")
public class Inquiry {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	int id;
	
	 @Column(name = "firstname")
	String firstname ;
	 @Column(name = "lastname")
	String    lastname ;
	 @Column(name = "dob")
	String dob ;
	 @Column(name = "inq_ids")
	String    inq_ids ;
	 @Column(name = "street")
	String street ;
	 @Column(name = "city")
	String    city ;
	 @Column(name = "zip")
	String zip ;
	 @Column(name = "acct")
	String    acct ;
	 @Column(name = "state")
	String state ;
	 @Column(name = "last_phy")
	String    last_phy ;
	 @Column(name = "z_code_visit")
	String z_code_visit ;
	 @Column(name = "sex")
	String    sex ;
	 @Column(name = "age_year")
	String age_year ;
	 @Column(name = "age_month")
	String    age_month ;
	 @Column(name = "phy1")
	String    phy1 ;
	 @Column(name = "phy2")
	String    phy2 ;
	 @Column(name = "nlp")
	String    nlp ;
	 @Column(name = "next_phydate")
	String next_phydate ;
	 @Column(name = "appt_setdate")
	String    appt_setdate ;
	 @Column(name = "apptBy")
	String apptBy ;
	 @Column(name = "newPh")
	String    newPh ;
	 @Column(name = "newph1")
	String    newph1 ;
	 @Column(name = "newph2")
	String    newph2 ;
	 @Column(name = "newph3")
	String    newph3 ;
	 @Column(name = "past_duedate")
	String    past_duedate ;
	 @Column(name = "upcoming_day")
	String    upcoming_day ;
	 @Column(name = "comment1")
	String    comment1 ;
	 @Column(name = "comment2")
	String    comment2 ;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getInq_ids() {
		return inq_ids;
	}
	public void setInq_ids(String inq_ids) {
		this.inq_ids = inq_ids;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAcct() {
		return acct;
	}
	public void setAcct(String acct) {
		this.acct = acct;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLast_phy() {
		return last_phy;
	}
	public void setLast_phy(String last_phy) {
		this.last_phy = last_phy;
	}
	public String getZ_code_visit() {
		return z_code_visit;
	}
	public void setZ_code_visit(String z_code_visit) {
		this.z_code_visit = z_code_visit;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge_year() {
		return age_year;
	}
	public void setAge_year(String age_year) {
		this.age_year = age_year;
	}
	public String getAge_month() {
		return age_month;
	}
	public void setAge_month(String age_month) {
		this.age_month = age_month;
	}
	public String getPhy1() {
		return phy1;
	}
	public void setPhy1(String phy1) {
		this.phy1 = phy1;
	}
	public String getPhy2() {
		return phy2;
	}
	public void setPhy2(String phy2) {
		this.phy2 = phy2;
	}
	public String getNlp() {
		return nlp;
	}
	public void setNlp(String nlp) {
		this.nlp = nlp;
	}
	public String getNext_phydate() {
		return next_phydate;
	}
	public void setNext_phydate(String next_phydate) {
		this.next_phydate = next_phydate;
	}
	public String getAppt_setdate() {
		return appt_setdate;
	}
	public void setAppt_setdate(String appt_setdate) {
		this.appt_setdate = appt_setdate;
	}
	public String getApptBy() {
		return apptBy;
	}
	public void setApptBy(String apptBy) {
		this.apptBy = apptBy;
	}
	public String getNewPh() {
		return newPh;
	}
	public void setNewPh(String newPh) {
		this.newPh = newPh;
	}
	public String getNewph1() {
		return newph1;
	}
	public void setNewph1(String newph1) {
		this.newph1 = newph1;
	}
	public String getNewph2() {
		return newph2;
	}
	public void setNewph2(String newph2) {
		this.newph2 = newph2;
	}
	public String getNewph3() {
		return newph3;
	}
	public void setNewph3(String newph3) {
		this.newph3 = newph3;
	}
	public String getPast_duedate() {
		return past_duedate;
	}
	public void setPast_duedate(String past_duedate) {
		this.past_duedate = past_duedate;
	}
	public String getUpcoming_day() {
		return upcoming_day;
	}
	public void setUpcoming_day(String upcoming_day) {
		this.upcoming_day = upcoming_day;
	}
	public String getComment1() {
		return comment1;
	}
	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}
	public String getComment2() {
		return comment2;
	}
	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

}

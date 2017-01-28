package com.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.domain.EmpDetails;
import com.struts.service.EmpDetailsDAOImpl;
import com.struts.service.EmpRegisterDAO;

public class EmpDetailsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EmpDetails  empdet = new EmpDetails();
	private EmpRegisterDAO  empdetdao = new EmpDetailsDAOImpl();
	private List<EmpDetails> list=new ArrayList<EmpDetails>();
	
	String message = "Hi!, Welcome from Struts2";
	
	
	private String fullname;
	private String city;
	private String geder;
	private String telnum;
	private String dep;
	private String uname;
	private String password;
	
	
	public EmpDetailsAction(){
		
	}
	
	
	public String execute(){
		
		setMessage(message);
		
		return SUCCESS;
	}
	
	public String saveDetails(){
		
		
		empdet.setFullname(getFullname());
		empdet.setCity(getCity());
		empdet.setGender(getGeder());
		empdet.setDep(getDep());
		empdet.setTelnum(getTelnum());
		empdet.setUname(getUname());
		empdet.setPword(getPassword());
		
		
		empdetdao.saveEmpDet(empdet);
		
		
		return SUCCESS;
	}
	public String getDetailsList(){
		list=empdetdao.getDetails();
		return SUCCESS;
	}

	public List<EmpDetails> getList() {
		return list;
	}


	public void setList(List<EmpDetails> list) {
		this.list = list;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGeder() {
		return geder;
	}


	public void setGeder(String geder) {
		this.geder = geder;
	}


	public String getTelnum() {
		return telnum;
	}


	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}


	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

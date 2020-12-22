package com.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dao.EmployeeDAO;
import com.entity.Employee;

public class SpringJPAClient {


	public static void main(String[] args) {
		  	Resource  res = new ClassPathResource("applicationContext.xml"); 
		    BeanFactory  factory = new   XmlBeanFactory(res);
			EmployeeDAO empDAO=(EmployeeDAO)factory.getBean("empDAO");
			
			Employee empObj=new Employee();
			
			empObj.setEmpId(105);
			empObj.setFirstName("Keanu");
			empObj.setLastName("Reeves");
			empObj.setEmail("keanu@abc.com");
			boolean saved=empDAO.createEmployee(empObj);
			
			if(saved) {
				System.out.println("Employee Record Saved Successfully!!! ");
			}else {
				System.out.println("Error Saving Employee Record!!! ");
			}


	}

}

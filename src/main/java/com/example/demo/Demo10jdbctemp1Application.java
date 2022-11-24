package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDao;

@SpringBootApplication
public class Demo10jdbctemp1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Demo10jdbctemp1Application.class, args);
		
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
		    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
		    int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
		    System.out.println(status);  
		          
		    /* int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
		    System.out.println(status); */
		      
		          
		    /*Employee e=new Employee(); 
		    e.setId(102); 
		    int status=dao.deleteEmployee(e); 
		    System.out.println(status); */ 
	}

}

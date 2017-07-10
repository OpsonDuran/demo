package com.beeva.jpa.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.jpa.demo.dao.UserDAO;
import com.beeva.jpa.demo.daoImple.UserDAOImpl;
import com.beeva.jpa.demo.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
    	User usr= new User();
    	UserDAO userDAO=(UserDAO) context.getBean(UserDAOImpl.class);
    	usr.setNombre("Santiago");
    	usr.setDireccion("6 norte");
    	
    	int id=userDAO.saveUser(usr).getId();
    	System.out.println("id: "+id);
    	
    	
    }
}

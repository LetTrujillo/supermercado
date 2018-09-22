package ar.edu.unlp.info.dssd.supermercado.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlp.info.dssd.supermercado.entities.Employee;



@Repository
public class EmpleadoRepository {

	  @Autowired
	  private SessionFactory sessionFactory;
	  
	  @Transactional
	  public Employee getEmployeeByEmail(String email){
		 Session session = sessionFactory.getCurrentSession();
		 return (Employee) session.createQuery(
		 	      "SELECT u FROM Employee u WHERE u.email = :email").setParameter("email", email).getSingleResult();	
	  }
	  
	  @Transactional
	  public void saveEmployee(Employee e) {
		  Session session= sessionFactory.getCurrentSession();
		  session.persist(e); 
	  }
}

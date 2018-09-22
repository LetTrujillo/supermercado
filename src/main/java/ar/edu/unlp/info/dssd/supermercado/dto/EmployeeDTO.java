package ar.edu.unlp.info.dssd.supermercado.dto;
import javax.xml.bind.annotation.XmlElement;

import ar.edu.unlp.info.dssd.supermercado.entities.Employee;

public class EmployeeDTO {
	
	@XmlElement
	private String firstname;
	@XmlElement
	private String surname;
	@XmlElement
	private String email;
	@XmlElement
	private String password;

	public EmployeeDTO(Employee employee) {
		super();
		this.email = employee.getEmail();
		this.surname = employee.getSurname();
		this.firstname = employee.getFirstname();
		this.password = employee.getPassword();
	}

	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

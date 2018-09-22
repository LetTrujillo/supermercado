package ar.edu.unlp.info.dssd.supermercado.services;

import ar.edu.unlp.info.dssd.supermercado.dto.EmployeeDTO;
import ar.edu.unlp.info.dssd.supermercado.entities.Employee;


public interface EmpleadoService {
	
	public Employee getEmployeeByEmail(String email) throws Exception;
	public boolean save(EmployeeDTO employee) throws Exception;

}

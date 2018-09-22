package ar.edu.unlp.info.dssd.supermercado.services.impl;

import ar.edu.unlp.info.dssd.supermercado.dto.EmployeeDTO;
import ar.edu.unlp.info.dssd.supermercado.entities.Employee;
import ar.edu.unlp.info.dssd.supermercado.repositories.EmpleadoRepository;
import ar.edu.unlp.info.dssd.supermercado.services.EmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private transient EmpleadoRepository empleadoRepository;

	public Employee getEmployeeByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return empleadoRepository.getEmployeeByEmail(email);
	}
	
	public boolean save(EmployeeDTO employeeDTO) throws Exception {
		try {
			Employee employee = new Employee(employeeDTO.getFirstname(), employeeDTO.getSurname(),
					employeeDTO.getEmail(), employeeDTO.getPassword());
			empleadoRepository.saveEmployee(employee);
			return true;
		}catch(Exception e){
			e.getMessage();
			return false;
		}
		
	}

	public EmpleadoRepository getEmpleadoRepository() {
		return empleadoRepository;
	}

	public void setEmpleadoRepository(EmpleadoRepository empleadoRepository) {
		this.empleadoRepository = empleadoRepository;
	}




}

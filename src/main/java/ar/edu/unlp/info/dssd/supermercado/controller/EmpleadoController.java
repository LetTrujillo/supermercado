package ar.edu.unlp.info.dssd.supermercado.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.unlp.info.dssd.supermercado.services.EmpleadoService;
import ar.edu.unlp.info.dssd.supermercado.dto.EmployeeDTO;

@Controller
@RequestMapping(value = "/api/empleado")
public class EmpleadoController {
	
	@Autowired
	private transient EmpleadoService empleadoService;
	
	@RequestMapping(value = "/{email}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON)
	public @ResponseBody EmployeeDTO getByEmail(@PathVariable("email") String email) throws Exception {
		try {
			return new EmployeeDTO(empleadoService.getEmployeeByEmail(email));
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public @ResponseBody boolean save(@RequestParam(value = "file") EmployeeDTO employee) throws Exception {
		try{
			return empleadoService.save(employee);
		}catch (Exception e) {
			return false;
		}
	}

	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	
}

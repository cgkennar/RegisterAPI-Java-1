package edu.uark.controllers;

<<<<<<< HEAD
//import org.springframework.util.DigestUtils;
=======
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import edu.uark.commands.employees.EmployeeLogin;
import edu.uark.models.api.Employee;
@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeRestController {
	
@ResponseBody
=======
import edu.uark.commands.employees.ActiveEmployeeCountsQuery;
import edu.uark.commands.employees.EmployeeCreateCommand;
import edu.uark.commands.employees.EmployeeDeleteCommand;
import edu.uark.commands.employees.EmployeeLoginCommand;
import edu.uark.commands.employees.EmployeeQuery;
import edu.uark.commands.employees.EmployeeUpdateCommand;
import edu.uark.models.api.ActiveEmployeeCounts;
import edu.uark.models.api.Employee;
import edu.uark.models.api.EmployeeLogin;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeRestController {
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable UUID employeeId) {
		return (new EmployeeQuery()).
			setEmployeeId(employeeId).
			execute();
	}
	
	@RequestMapping(value = "/activecounts/{classification}", method = RequestMethod.GET)
	public ActiveEmployeeCounts getActiveEmployeeCounts(@PathVariable int classification) {
		return (new ActiveEmployeeCountsQuery()).
				setEmployeeClassification(classification)
				.execute();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		return (new EmployeeCreateCommand()).
			setApiEmployee(employee).
			execute();
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable UUID employeeId, @RequestBody Employee employee) {
		return (new EmployeeUpdateCommand()).
			setEmployeeId(employeeId).
			setApiEmployee(employee).
			execute();
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable UUID employeeId) {
		(new EmployeeDeleteCommand()).
			setEmployeeId(employeeId).
			execute();
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Employee employeeLogin(@RequestBody EmployeeLogin employeeLogin) {
		return (new EmployeeLoginCommand()).
			setEmployeeLogin(employeeLogin).
			execute();
	}

	@ResponseBody
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Successful test. (EmployeeRestController)";
	}
<<<<<<< HEAD

@RequestMapping(value = "/login", method = RequestMethod.POST)
public Employee createEmployeeLogin(@RequestBody EmployeeLogin employee) {	
	return (new EmployeeLogin()).
		setEmployeeID(employee.getEmployeeID()).
		setPassword((employee.getPassword())). //byteArrayToHexString needs to be implemented
		execute();
	}
=======
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
}

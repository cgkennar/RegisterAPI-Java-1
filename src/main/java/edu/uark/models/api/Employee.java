package edu.uark.models.api;

import java.time.LocalDateTime;
import java.util.UUID;

<<<<<<< HEAD
import edu.uark.models.entities.EmployeeEntity;

public class Employee {
	
	public Employee() { // Constructor
		this.id = new UUID(0, 0);
		this.EmployeeID = 0; 
		this.password = "";
		this.status = "";
		this.createdOn = LocalDateTime.now();
		this.firstname = "";
		this.lastname = "";
		this.manager = "";
		this.role = "";
	}
	
	public Employee(EmployeeEntity employeeEntity) {
		this.id = employeeEntity.getId();
		this.EmployeeID = employeeEntity.getEmployeeID();
		this.password = employeeEntity.getPassword();
		this.status = employeeEntity.getStatus();
		this.createdOn = employeeEntity.getCreatedOn();
		this.firstname = employeeEntity.getFirstName();
		this.lastname = employeeEntity.getLastName();
		this.manager = employeeEntity.getManager();
		this.role = employeeEntity.getRole();
	}
	
=======
import org.apache.commons.lang3.StringUtils;

import edu.uark.models.entities.EmployeeEntity;
import edu.uark.models.enums.EmployeeClassification;

public class Employee {
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
	private UUID id;
	public UUID getId() {
		return this.id;
	}
	public Employee setId(UUID id) {
		this.id = id;
		return this;
	}
	
<<<<<<< HEAD
	private String password;
	public String getPassword() {
		return this.password;
	}
	public Employee setPassword(String password) {
		this.password = password;
		return this;
	}
	
	private String status;
	public String getStatus() {
		return this.status;
	}
	public Employee setStatus(String status) {
		this.status = status;
		return this;
	}
	
	private LocalDateTime createdOn;
	public LocalDateTime getCreatedOn() {
		return this.createdOn;
	}
	public Employee setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
		return this;
	}
	
	///////////////////////////////
	
	private int EmployeeID;
	public int getEmployeeID() {
		return this.EmployeeID;
	}
	public Employee setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
		return this;
	}
	
	private String firstname;
	public String getFirstName() {
		return this.firstname;
	}
	public Employee setFirstName(String firstname) {
		this.firstname = firstname;
		return this;
	}
	
	private String lastname;
	public String getLastName() {
		return this.lastname;
	}
	public Employee setLastName(String lastname) {
		this.lastname = lastname;
		return this;
	}
	
	private String manager;
	public String getManager() {
		return this.manager;
	}
	public Employee setManager(String manager) {
		this.manager = manager;
		return this;
	}
	
	private String role;
	public String getRole() {
		return this.role;
	}
	public Employee setRole(String role) {
		this.role = role;
		return this;
	}
	
	///////////////////////////////
	
	// Input: employee ID and password
	// Output: employee ID, password, status
=======
	private String employeeId;
	public String getEmployeeId() {
		return this.employeeId;
	}
	public Employee setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
		return this;
	}

	private String firstName;
	public String getFirstName() {
		return this.firstName;
	}
	public Employee setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	private String lastName;
	public String getLastName() {
		return this.lastName;
	}
	public Employee setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	private String password;
	public String getPassword() {
		return this.password;
	}
	public Employee setPassword(String password) {
		this.password = password;
		return this;
	}

	private boolean active;
	public boolean getActive() {
		return this.active;
	}
	public Employee setActive(boolean active) {
		this.active = active;
		return this;
	}

	private int classification;
	public int getClassification() {
		return this.classification;
	}
	public Employee setClassification(int classification) {
		this.classification = classification;
		return this;
	}

	private UUID managerId;
	public UUID getManagerId() {
		return this.managerId;
	}
	public Employee setManagerId(UUID managerId) {
		this.managerId = managerId;
		return this;
	}
	
	private LocalDateTime createdOn;
	public LocalDateTime getCreatedOn() {
		return this.createdOn;
	}
	public Employee setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
		return this;
	}
	
	public Employee() {
		this.active = false;
		this.id = new UUID(0, 0);
		this.managerId = new UUID(0, 0);
		this.lastName = StringUtils.EMPTY;
		this.password = StringUtils.EMPTY;
		this.firstName = StringUtils.EMPTY;
		this.employeeId = StringUtils.EMPTY;
		this.createdOn = LocalDateTime.now();
		this.classification = EmployeeClassification.NOT_DEFINED.getValue();
	}
	
	public Employee(EmployeeEntity employeeEntity) {
		this.id = employeeEntity.getId();
		this.password = StringUtils.EMPTY;
		this.active = employeeEntity.getActive();
		this.lastName = employeeEntity.getLastName();
		this.createdOn = employeeEntity.getCreatedOn();
		this.firstName = employeeEntity.getFirstName();
		this.managerId = employeeEntity.getManagerId();
		this.employeeId = employeeEntity.getEmployeeId();
		this.classification = employeeEntity.getClassification().getValue();
	}
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
}

package edu.uark.models.entities;
#Modified 

#commit 
<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
=======
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67

import org.apache.commons.lang3.StringUtils;

import edu.uark.dataaccess.entities.BaseEntity;
import edu.uark.dataaccess.repository.DatabaseTable;
import edu.uark.models.api.Employee;
<<<<<<< HEAD
import edu.uark.models.api.Product;
import edu.uark.models.entities.fieldnames.ProductFieldNames;
=======
import edu.uark.models.entities.fieldnames.EmployeeFieldNames;
import edu.uark.models.enums.EmployeeClassification;
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67

public class EmployeeEntity extends BaseEntity<EmployeeEntity> {
	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException {
<<<<<<< HEAD
		this.password = rs.getString(ProductFieldNames.PASSWORD);
		this.status = rs.getString(ProductFieldNames.STATUS);
		this.EmployeeID = rs.getInt(ProductFieldNames.EMPLOYEEID);
		this.FirstName = rs.getString(ProductFieldNames.FIRSTNAME);
		this.LastName =  rs.getString(ProductFieldNames.LASTNAME);
		this.manager = rs.getString(ProductFieldNames.MANAGER);
		this.role = rs.getString(ProductFieldNames.ROLE);
=======
		this.active = rs.getBoolean(EmployeeFieldNames.ACTIVE);
		this.password = rs.getString(EmployeeFieldNames.PASSWORD);
		this.lastName = rs.getString(EmployeeFieldNames.LAST_NAME);
		this.firstName = rs.getString(EmployeeFieldNames.FIRST_NAME);
		this.employeeId = rs.getString(EmployeeFieldNames.EMPLOYEE_ID);
		this.managerId = ((UUID) rs.getObject(EmployeeFieldNames.MANAGER_ID));
		this.classification = EmployeeClassification.map(rs.getInt(EmployeeFieldNames.CLASSIFICATION));
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
	}

	@Override
	protected Map<String, Object> fillRecord(Map<String, Object> record) {
<<<<<<< HEAD
		record.put(ProductFieldNames.PASSWORD, this.password);
		record.put(ProductFieldNames.STATUS, this.status);
		record.put(ProductFieldNames.EMPLOYEEID, this.EmployeeID);
		record.put(ProductFieldNames.FIRSTNAME, this.FirstName);
		record.put(ProductFieldNames.LASTNAME, this.LastName);
		record.put(ProductFieldNames.MANAGER, this.manager);
		record.put(ProductFieldNames.ROLE, this.role);
		return record;
	}

	private String password;
	public String getPassword() {
		return this.password;
	}
	
	public EmployeeEntity setPassword(String password) {
		if(!StringUtils.equals(this.password, password)) {
			this.password = password;
			this.propertyChanged(ProductFieldNames.PASSWORD);
		}
		return this;
	}
	
	private String status;
	public String getStatus() {
		return this.status;
	}
	public EmployeeEntity setStatus(String status) {
		if(!StringUtils.equals(this.status, status)) {
			this.status = status;
			this.propertyChanged(ProductFieldNames.STATUS);
		}
		return this;
	}
	private String FirstName;
	public String getFirstName() {
		return this.FirstName;
	}
	public EmployeeEntity setFirstName(String FirstName) {
		if(!StringUtils.equals(this.FirstName, FirstName)) {
			this.FirstName = FirstName;
			this.propertyChanged(ProductFieldNames.FIRSTNAME);
		}
		return this;
	}
	private String LastName;
	public String getLastName() {
		return this.LastName;
	}
	public EmployeeEntity setLastName(String LastName) {
		if(!StringUtils.equals(this.LastName, LastName)) {
			this.LastName = LastName;
			this.propertyChanged(ProductFieldNames.LASTNAME);
		}
		return this;
	}
	private int EmployeeID;// CHECK
	public int getEmployeeID() {
		return this.EmployeeID;
	}
	public EmployeeEntity setEmployeeID(int EmployeeID) {
		if(this.EmployeeID != EmployeeID) {
			this.EmployeeID = EmployeeID;
			this.propertyChanged(ProductFieldNames.EMPLOYEEID);
		}
		return this;
	}
	private String role;
	public String getRole() {
		return this.role;
	}
	public EmployeeEntity setRole(String role) {
		if(!StringUtils.equals(this.role, role)) {
			this.role = role;
			this.propertyChanged(ProductFieldNames.ROLE);
		}
		return this;
	}
	
	private String manager;
	public String getManager() {
		return this.manager;
	}
	public EmployeeEntity setManager(String manager) {
		if(!StringUtils.equals(this.manager, manager)) {
			this.manager = manager;
			this.propertyChanged(ProductFieldNames.MANAGER);
		}
		return this;
	}
	
	
	/*public Employee synchronize(Employee apiEmployee) {
		//this.setCount(apiProduct.getCount());
		//this.setLookupCode(apiProduct.getLookupCode());
		this.setPassword(apiEmployee.getPassword());
		this.setStatus(apiEmployee.getStatus());
		apiEmployee.setId(this.getId());
		//apiProduct.setCreatedOn(this.getCreatedOn());
		
<<<<<<< HEAD
		return apiProduct;// Replace for employee
	}
=======
		return apiEmployee;
	}*/
	
	public EmployeeEntity() {
		super(DatabaseTable.EMPLOYEE);
		this.password = StringUtils.EMPTY;
		this.status = StringUtils.EMPTY;
		this.EmployeeID = -1;
		this.FirstName = StringUtils.EMPTY;
		this.LastName = StringUtils.EMPTY;
		this.manager = StringUtils.EMPTY;
		this.role = StringUtils.EMPTY;
	}
	
	
	public EmployeeEntity(Employee apiEmployee) {
		super(DatabaseTable.EMPLOYEE);
		this.status = apiEmployee.getStatus();
		this.password = apiEmployee.getPassword();
		this.FirstName = apiEmployee.getFirstName();
		this.LastName = apiEmployee.getLastName();
		this.manager = apiEmployee.getManager();
		this.EmployeeID = apiEmployee.getEmployeeID();
		this.role = apiEmployee.getRole();

=======
		record.put(EmployeeFieldNames.ACTIVE, this.active);
		record.put(EmployeeFieldNames.PASSWORD, this.password);
		record.put(EmployeeFieldNames.LAST_NAME, this.lastName);
		record.put(EmployeeFieldNames.FIRST_NAME, this.firstName);
		record.put(EmployeeFieldNames.MANAGER_ID, this.managerId);
		record.put(EmployeeFieldNames.EMPLOYEE_ID, this.employeeId);
		record.put(EmployeeFieldNames.CLASSIFICATION, this.classification.getValue());

		return record;
	}

	private String employeeId;
	public String getEmployeeId() {
		return this.employeeId;
	}
	public EmployeeEntity setEmployeeId(String employeeId) {
		if (!StringUtils.equals(this.employeeId, employeeId)) {
			this.employeeId = employeeId;
			this.propertyChanged(EmployeeFieldNames.EMPLOYEE_ID);
		}
		
		return this;
	}

	private String firstName;
	public String getFirstName() {
		return this.firstName;
	}
	public EmployeeEntity setFirstName(String firstName) {
		if (!StringUtils.equals(this.firstName, firstName)) {
			this.firstName = firstName;
			this.propertyChanged(EmployeeFieldNames.FIRST_NAME);
		}
		
		return this;
	}

	private String lastName;
	public String getLastName() {
		return this.lastName;
	}
	public EmployeeEntity setLastName(String lastName) {
		if (!StringUtils.equals(this.lastName, lastName)) {
			this.lastName = lastName;
			this.propertyChanged(EmployeeFieldNames.LAST_NAME);
		}
		
		return this;
	}

	private String password;
	public String getPassword() {
		return this.password;
	}
	public EmployeeEntity setPassword(String password) {
		if (!StringUtils.equals(this.password, password)) {
			this.password = password;
			this.propertyChanged(EmployeeFieldNames.PASSWORD);
		}
		
		return this;
	}

	private boolean active;
	public boolean getActive() {
		return this.active;
	}
	public EmployeeEntity setActive(boolean active) {
		if (this.active != active) {
			this.active = active;
			this.propertyChanged(EmployeeFieldNames.ACTIVE);
		}
		
		return this;
	}

	private EmployeeClassification classification;
	public EmployeeClassification getClassification() {
		return this.classification;
	}
	public EmployeeEntity setClassification(EmployeeClassification classification) {
		if (this.classification != classification) {
			this.classification = classification;
			this.propertyChanged(EmployeeFieldNames.CLASSIFICATION);
		}
		
		return this;
	}

	private UUID managerId;
	public UUID getManagerId() {
		return this.managerId;
	}
	public EmployeeEntity setManagerId(UUID managerId) {
		if (!this.managerId.equals(managerId)) {
			this.managerId = managerId;
			this.propertyChanged(EmployeeFieldNames.MANAGER_ID);
		}
		
		return this;
	}
	
	public Employee synchronize(Employee apiEmployee) {
		this.setActive(apiEmployee.getActive());
		this.setLastName(apiEmployee.getLastName());
		this.setFirstName(apiEmployee.getFirstName());
		this.setManagerId(apiEmployee.getManagerId());
		this.setClassification(EmployeeClassification.map(apiEmployee.getClassification()));
		if (!StringUtils.isBlank(apiEmployee.getPassword())) {
			this.setPassword(
				EmployeeEntity.hashPassword(
					apiEmployee.getPassword()));
		}
		
		apiEmployee.setId(this.getId());
		apiEmployee.setPassword(StringUtils.EMPTY); //Only send the password over the network when modifying the database.
		apiEmployee.setEmployeeId(this.employeeId); //The employee ID may not be changed from a client.
		apiEmployee.setCreatedOn(this.getCreatedOn());
		
		return apiEmployee;
	}
	
	public static String hashPassword(String password) {
		String hashedPassword;

		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(password.getBytes());
			hashedPassword = new String(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			hashedPassword = StringUtils.EMPTY;
		}
		
		return hashedPassword;
	}
	
	public EmployeeEntity() {
		super(DatabaseTable.EMPLOYEE);
		
		this.active = false;
		this.managerId = new UUID(0, 0);
		this.lastName = StringUtils.EMPTY;
		this.password = StringUtils.EMPTY;
		this.firstName = StringUtils.EMPTY;
		this.employeeId = StringUtils.EMPTY;
		this.classification = EmployeeClassification.NOT_DEFINED;
	}

	public EmployeeEntity(Employee apiEmployee) {
		super(DatabaseTable.EMPLOYEE);
		
		this.active = apiEmployee.getActive();
		this.lastName = apiEmployee.getLastName();
		this.firstName = apiEmployee.getFirstName();
		this.managerId = apiEmployee.getManagerId();
		this.employeeId = apiEmployee.getEmployeeId();
		this.classification = EmployeeClassification.map(apiEmployee.getClassification());
		this.password = EmployeeEntity.hashPassword(
			apiEmployee.getPassword());
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
	}
}

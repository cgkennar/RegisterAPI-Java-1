package edu.uark.models.repositories.interfaces;

import edu.uark.dataaccess.repository.BaseRepositoryInterface;
import edu.uark.models.entities.EmployeeEntity;
<<<<<<< HEAD

public interface EmployeeRepositoryInterface extends BaseRepositoryInterface<EmployeeEntity> {
	EmployeeEntity byEmployeeID(int EmployeeID);
}
=======
import edu.uark.models.enums.EmployeeClassification;

public interface EmployeeRepositoryInterface extends BaseRepositoryInterface<EmployeeEntity> {
	boolean employeeIdExists(String employeeId);
	EmployeeEntity byEmployeeId(String employeeId);
	int activeCountByClassification(EmployeeClassification employeeClassification);
}
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67

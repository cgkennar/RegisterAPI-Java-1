package edu.uark.dataaccess.repository;

public enum DatabaseTable {
	NONE(""),
<<<<<<< HEAD
	PRODUCT("product"), 
=======
	PRODUCT("product"),
>>>>>>> dbac4282484eeb203aee2ea6d5c48dc55e9f8d67
	EMPLOYEE("employee");
	
	public String getLabel() {
		return label;
	}
	
	private final String label;
	
	private DatabaseTable(String label) {
		this.label = label;
	}
}

package com.sunRays.beans;

public class EmployeeBean
{
    private String fullName;
    private DepartmentBean departmentBean;
    
    public EmployeeBean(DepartmentBean departmentBean){
    	this.departmentBean =departmentBean;
    }
    
    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }
  
 
    public String getFullName() {
        return fullName;
    }
  
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

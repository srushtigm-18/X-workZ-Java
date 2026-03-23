class Employee {
    private String name;
    
    Employee() {
        System.out.println("Employee created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getEmployeeInfo() {
        return name;
    }
}


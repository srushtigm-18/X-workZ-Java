class AccountYahoo{
	private String fullName;
	private String email;
	private String password;
	private long mobileNumber;
	private String dateOfBirth;
	private String gender;
	
	public void getFullName(String fullName){
		this.fullName= fullName;
	}
	public String setFullName(){
		return this.fullName;
	}
	
	public void getEmail(String email){
		this.email= email;
	}
	public String setEmail(){
	return this.email;
	}
	public void getPassword(String password){
		this.password= password;
	}
	public String setPassword(){
	return this.password;
	}
	public void getMobileNo(long mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public long setMobileNo(){
		return this.mobileNumber;
	}
	public void getDateOfBirth(String dateOfBirth){
		this.dateOfBirth= dateOfBirth;
	}
	public String setdateOfBirth(){
		return this.dateOfBirth;
	}
	public void getGender(String gender){
		this.gender = gender;
	}
	public String setGender(){
	return this.gender;
	}
}


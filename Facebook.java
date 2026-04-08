class Facebook{
UserAccount userAccounts[] = new UserAccount[3];
int index;

public boolean createUserAccount(UserAccount userAccount){
boolean isUserAccountCreated = false;
boolean isUserIdValid = false;
boolean isUserNameValid = false;
boolean isEmailValid = false;
boolean isPhoneValid = false;
boolean isPasswordValid = false;
boolean isCreatedOnValid = false;


int uId = userAccount.getUserId();
if(uId > 0){
isUserIdValid = true;
}

String uName = userAccount.getUserName();
if(uName != null && !uName.isEmpty()){
isUserNameValid = true;
}

String uEmail = userAccount.getEmail();
if(uEmail !=null && !uEmail.isEmpty()){
isEmailValid = true;
}

String phone = userAccount.getPhone();
if (phone != null && phone.length() == 10) {
isPhoneValid = true;
}

String password = userAccount.getPassword();
if (password != null && password.length() >= 6 && !password.isEmpty()) {
isPasswordValid = true;
}

String createdOn = userAccount.getCreatedOn();
if (createdOn != null && !createdOn.isEmpty()) {
isCreatedOnValid = true;
}

if(isEmailValid && isUserIdValid && isCreatedOnValid && isPasswordValid && isUserNameValid && isPhoneValid){
this.userAccounts[index++] = userAccounts;
isUserAccountCreated = true ;
}return isUserAccountCreated;
}

public void getUserDetails(){
	System.out.println("List of users");
	for(UserAccount userAccount : userAccounts){
		System.out.println("------------------");
System.out.println("user account created");
System.out.println("User id : "+userAccount.getUserId());
System.out.println("User name : "+userAccount.getUserName());
System.out.println("User email : "+userAccount.getEmail());
System.out.println("User phone number : "+userAccount.getPhone());
System.out.println("User password : "+userAccount.getPassword());
System.out.println("User created on : "+userAccount.getCreatedOn());
		System.out.println("------------------");

}

}
}


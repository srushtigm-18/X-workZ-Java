class Instagram {
AccountUser accountUser;

public boolean createaccountUser(AccountUser accountUser) {
boolean isAccountUserCreated = false;
boolean isUserIdValid = false;
boolean isUserNameValid = false;
boolean isEmailValid = false;
boolean isPhoneValid = false;
boolean isPasswordValid = false;
boolean isCreatedOnValid = false;

int uId = accountUser.getUserId();
if (uId > 0) {
isUserIdValid = true;
}

String userName = accountUser.getUserName();
if (userName != null && !userName.isEmpty()) {
isUserNameValid = true;
}

String uEmail = accountUser.getEmail();
if (uEmail != null && !uEmail.isEmpty()) {
isEmailValid = true;
}

String phone = accountUser.getPhone();
if (phone != null && phone.length() == 10) {
isPhoneValid = true;
}

String password = accountUser.getPassword();
if (password != null && password.length() >= 6 && !password.isEmpty()) {
isPasswordValid = true;
}

String createdOn = accountUser.getCreatedOn();
if (createdOn != null && !createdOn.isEmpty()) {
isCreatedOnValid = true;
}

if (isEmailValid && isUserIdValid && isCreatedOnValid && isPasswordValid && isUserNameValid && isPhoneValid) {
this.AccountUser = accountUser;
isAccountUserCreated = true;
}
return isAccountUserCreated;
    }

public void getUserDetails() {
System.out.println("User account created");
System.out.println("User id : " + AccountUser.getUserId());
System.out.println("User name : " + AccountUser.getUserName());
System.out.println("User email : " + AccountUser.getEmail());
System.out.println("User phone number : " + AccountUser.getPhone());
System.out.println("User password : " + AccountUser.getPassword());
System.out.println("User created on : " + AccountUser.getCreatedOn());
        }
    }
}
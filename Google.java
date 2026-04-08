class Google {
    UserAccount3 userAccount[] = new UserAccount3[19];
	int index;

    public boolean createUserAccount(UserAccount3 userAccount) {
        boolean isUserAccountCreated = false;
        boolean isNameValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;

        String name = userAccount.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String userName = userAccount.getUserName();
        if (userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }

        String email = userAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = userAccount.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = userAccount.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        }

        if (isNameValid && isUserNameValid && isEmailValid && isPasswordValid && isMobileNumberValid) {
            this.userAccount[index++] = userAccount;
            isUserAccountCreated = true;
        }
        return isUserAccountCreated;
    }

    public void getUserDetails() {
		for(UserAccount3 userAccount : userAccount){
			System.out.println("__________________________________");
        if (userAccount != null) {
            System.out.println("User account created on Google");
            System.out.println("Name : " + userAccount.getName());
            System.out.println("User name : " + userAccount.getUserName());
            System.out.println("Email : " + userAccount.getEmail());
            System.out.println("Password : " + userAccount.getPassword());
            System.out.println("Mobile number : " + userAccount.getMobileNumber());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
class Flipkart {
    UserAccount1 userAccount[] = new UserAccount1[19];
	int index;

    public boolean createUserAccount(UserAccount1 userAccount) {
        boolean isUserAccountCreated = false;
        boolean isUserIdValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isCreatedOnValid = false;

        int uId = userAccount.getUserId();
        if (uId > 0) {
            isUserIdValid = true;
        }

        String uName = userAccount.getUserName();
        if (uName != null && !uName.isEmpty()) {
            isUserNameValid = true;
        }

        String uEmail = userAccount.getEmail();
        if (uEmail != null && !uEmail.isEmpty()) {
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

        if (isEmailValid && isUserIdValid && isCreatedOnValid && isPasswordValid && isUserNameValid && isPhoneValid) {
            this.userAccount[index++] = userAccount;
            isUserAccountCreated = true;
        }
        return isUserAccountCreated;
    }

    public void getUserDetails() {
		for(UserAccount1 userAccount:userAccount){
			System.out.println("---------------------------------");
        if (userAccount != null) {
            System.out.println("User account created on Flipkart");
            System.out.println("User id : " + userAccount.getUserId());
            System.out.println("User name : " + userAccount.getUserName());
            System.out.println("User email : " + userAccount.getEmail());
            System.out.println("User phone number : " + userAccount.getPhone());
            System.out.println("User password : " + userAccount.getPassword());
            System.out.println("User created on : " + userAccount.getCreatedOn());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
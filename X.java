class X {
    UserAccount5 userAccount[] = new UserAccount5[19];
	int index;

    public boolean createUserAccount(UserAccount5 userAccount) {
        boolean isUserAccountCreated = false;
        boolean isNameValid = false;
        boolean isIdValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCreatedOnValid = false;
        boolean isEmailValid = false;
        boolean isPhoneNumberValid = false;

        String name = userAccount.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        int id = userAccount.getId();
        if (id > 0) {
            isIdValid = true;
        }

        String dateOfBirth = userAccount.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String createdOn = userAccount.getCreatedOn();
        if (createdOn != null && !createdOn.isEmpty()) {
            isCreatedOnValid = true;
        }

        String email = userAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String phoneNumber = userAccount.getPhoneNumber();
        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        }

        if (isNameValid && isIdValid && isDateOfBirthValid
                && isCreatedOnValid && isEmailValid && isPhoneNumberValid) {
            this.userAccount[index++] = userAccount;
            isUserAccountCreated = true;
        }
        return isUserAccountCreated;
    }

    public void getUserDetails() {
		for(UserAccount5 userAccount : userAccount){
			System.out.println("--------------------");
        if (userAccount != null) {
            System.out.println("User account created on X");
            System.out.println("Name : " + userAccount.getName());
            System.out.println("Id : " + userAccount.getId());
            System.out.println("Date of birth : " + userAccount.getDateOfBirth());
            System.out.println("Created on : " + userAccount.getCreatedOn());
            System.out.println("Email : " + userAccount.getEmail());
            System.out.println("Phone number : " + userAccount.getPhoneNumber());
        } else {
            System.out.println("No user account exists.");
        }
		}
    }
}
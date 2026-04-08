class Amazon {
    UserAccount4 userAccount[] = new UserAccount4[19];
	int index;

    public boolean createUserAccount(UserAccount4 userAccount) {
        boolean isUserAccountCreated = false;
        boolean isNameValid = false;
        boolean isDateOfBirthValid = false;
        boolean isAddressValid = false;
        boolean isPhoneNoValid = false;
        boolean isEmailValid = false;
        boolean isGenderValid = false;

        String name = userAccount.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String dateOfBirth = userAccount.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String address = userAccount.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        }

        String phoneNo = userAccount.getPhoneNo();
        if (phoneNo != null && phoneNo.length() == 10) {
            isPhoneNoValid = true;
        }

        String email = userAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String gender = userAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")
                    || gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                isGenderValid = true;
            }
        }

        if (isNameValid && isDateOfBirthValid && isAddressValid
                && isPhoneNoValid && isEmailValid && isGenderValid) {
            this.userAccount[index++] = userAccount;
            isUserAccountCreated = true;
        }
        return isUserAccountCreated;
    }

    public void getUserDetails() {
		for(UserAccount4 userAccount : userAccount){
			System.out.println("----------------------");
        if (userAccount != null) {
            System.out.println("User account created on Amazon");
            System.out.println("Name : " + userAccount.getName());
            System.out.println("Date of birth : " + userAccount.getDateOfBirth());
            System.out.println("Address : " + userAccount.getAddress());
            System.out.println("Phone no : " + userAccount.getPhoneNo());
            System.out.println("Email : " + userAccount.getEmail());
            System.out.println("Gender : " + userAccount.getGender());
        } else {
            System.out.println("No user account exists.");
        }
		}
    }
}
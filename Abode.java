class Abode {
    AbodeAccount accounts[] = new AbodeAccount[19];
    int index = 0;
	
    public boolean createUserAccount(AbodeAccount account) {
        boolean isAccountCreated = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isFullNameValid = false;
        boolean isCountryValid = false;
        boolean isDateOfBirthValid = false;
        boolean isPhoneNumberValid = false;

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String fullName = account.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String country = account.getCountry();
        if (country != null && !country.isEmpty()) {
            isCountryValid = true;
        }

        String dateOfBirth = account.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String phoneNumber = account.getPhoneNumber();
        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        }

        if (isEmailValid && isPasswordValid && isFullNameValid
                && isCountryValid && isDateOfBirthValid && isPhoneNumberValid) {
            this.accounts[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
        System.out.println("List of users");
        for(AbodeAccount userAccount : accounts){
            System.out.println("------------------");
            if (userAccount != null) { 
                System.out.println("User account created on Abode");
                System.out.println("Email : " + userAccount.getEmail());
                System.out.println("Password : " + userAccount.getPassword());
                System.out.println("Full name : " + userAccount.getFullName());
                System.out.println("Country : " + userAccount.getCountry());
                System.out.println("Date of birth : " + userAccount.getDateOfBirth());
                System.out.println("Phone number : " + userAccount.getPhoneNumber());
            } else {
                System.out.println("No user account exists.");
            }
        }
    }
}

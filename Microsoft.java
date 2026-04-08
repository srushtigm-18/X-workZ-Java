class Microsoft {
    UserAccount6 userAccount[] = new UserAccount6[19];
	int index;

    public boolean createUserAccount(UserAccount6 userAccount) {
        boolean isUserAccountCreated = false;
        boolean isIdValid = false;
        boolean isEmailValid = false;
        boolean isNameValid = false;
        boolean isCountryValid = false;
        boolean isDobValid = false;
        boolean isPhoneValid = false;
        boolean isOtpValid = false;

        int id = userAccount.getId();
        if (id > 0) {
            isIdValid = true;
        }

        String email = userAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String name = userAccount.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String country = userAccount.getCountry();
        if (country != null && !country.isEmpty()) {
            isCountryValid = true;
        }

        String dob = userAccount.getDob();
        if (dob != null && !dob.isEmpty()) {
            isDobValid = true;
        }

        String phone = userAccount.getPhone();
        if (phone != null && phone.length() == 10) {
            isPhoneValid = true;
        }

        String otp = userAccount.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        if (isIdValid && isEmailValid && isNameValid
                && isCountryValid && isDobValid && isPhoneValid && isOtpValid) {
            this.userAccount[index++] = userAccount;
            isUserAccountCreated = true;
        }
        return isUserAccountCreated;
    }

    public void getUserDetails() {
		for(UserAccount6 userAccount : userAccount){
		System.out.println("------------------");
        if (userAccount != null) {
            System.out.println("User account created on Microsoft");
            System.out.println("Id : " + userAccount.getId());
            System.out.println("Email : " + userAccount.getEmail());
            System.out.println("Name : " + userAccount.getName());
            System.out.println("Country : " + userAccount.getCountry());
            System.out.println("Date of birth : " + userAccount.getDob());
            System.out.println("Phone : " + userAccount.getPhone());
            System.out.println("Otp : " + userAccount.getOtp());
        } else {
            System.out.println("No user account exists.");
        }
		}
    }
}
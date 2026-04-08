class Zoom {

    ZoomAccount account[] = new ZoomAccount[19];
	int index;

    public boolean createUserAccount(ZoomAccount account) {
        boolean isAccountCreated = false;
        boolean isGmailValid = false;
        boolean isPasswordValid = false;
        boolean isNameValid = false;
        boolean isDateOfBirthValid = false;
        boolean isOtpValid = false;
        boolean isOrganizationValid = false;

        String gmail = account.getGmail();
        if (gmail != null && !gmail.isEmpty()) {
            isGmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String dob = account.getDateOfBirth();
        if (dob != null && !dob.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String organization = account.getOrganization();
        if (organization != null && !organization.isEmpty()) {
            isOrganizationValid = true;
        }

        if (isGmailValid && isPasswordValid && isNameValid
                && isDateOfBirthValid && isOtpValid && isOrganizationValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
     for(ZoomAccount userAccount : account) {
        System.out.println("------------------");
        if (userAccount != null) {
            System.out.println("User account created on Zoom");
            System.out.println("Gmail : " + userAccount.getGmail());
            System.out.println("Password : " + userAccount.getPassword());
            System.out.println("Name : " + userAccount.getName());
            System.out.println("Date of birth : " + userAccount.getDateOfBirth());
            System.out.println("Otp : " + userAccount.getOtp());
            System.out.println("Organization : " + userAccount.getOrganization());
        }
    }
	}
}
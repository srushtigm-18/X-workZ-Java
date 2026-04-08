class Quora {

    QuoraAccount account[] = new QuoraAccount[19];
	int index;

    public boolean createUserAccount(QuoraAccount account) {
        boolean isAccountCreated = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isInterestValid = false;
        boolean isOtpValid = false;
        boolean isLocationValid = false;

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String interest = account.getInterest();
        if (interest != null && !interest.isEmpty()) {
            isInterestValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String location = account.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

        if (isNameValid && isEmailValid && isPasswordValid
                && isInterestValid && isOtpValid && isLocationValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(QuoraAccount account:account){
			System.out.println("----------------------------------");
        if (account != null) {
            System.out.println("User account created on Quora");
            System.out.println("Name : " + account.getName());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Interest : " + account.getInterest());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Location : " + account.getLocation());
        } else {
            System.out.println("No user account exists.");
        }
    }
}
}
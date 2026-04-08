class Uber {

    UberAccount account[] = new UberAccount[19];
	int index;

    public boolean createUserAccount(UberAccount account) {
        boolean isAccountCreated = false;
        boolean isMobileNumberValid = false;
        boolean isOtpValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPaymentModeValid = false;
        boolean isLocationValid = false;

        String mobileNumber = account.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

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

        String paymentMode = account.getPaymentMode();
        if (paymentMode != null && !paymentMode.isEmpty()) {
            isPaymentModeValid = true;
        }

        String location = account.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

        if (isMobileNumberValid && isOtpValid && isNameValid
                && isEmailValid && isPasswordValid
                && isPaymentModeValid && isLocationValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(UberAccount account:account){
        if (account != null) {
            System.out.println("User account created on Uber");
            System.out.println("Mobile number : " + account.getMobileNumber());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Name : " + account.getName());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Payment mode : " + account.getPaymentMode());
            System.out.println("Location : " + account.getLocation());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
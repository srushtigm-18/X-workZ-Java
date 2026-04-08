class Udemy {

    UdemyAccount account[] = new UdemyAccount[19];
	int index;

    public boolean createUserAccount(UdemyAccount account) {
        boolean isAccountCreated = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isCoursePreferenceValid = false;
        boolean isOtpValid = false;
        boolean isPaymentDetailsValid = false;

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

        String coursePreference = account.getCoursePreference();
        if (coursePreference != null && !coursePreference.isEmpty()) {
            isCoursePreferenceValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String paymentDetails = account.getPaymentDetails();
        if (paymentDetails != null && !paymentDetails.isEmpty()) {
            isPaymentDetailsValid = true;
        }

        if (isNameValid && isEmailValid && isPasswordValid
                && isCoursePreferenceValid && isOtpValid && isPaymentDetailsValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(UdemyAccount account : account){
			System.out.println("-------------");
            System.out.println("User account created on Udemy");
            System.out.println("Name : " + account.getName());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Course preference : " + account.getCoursePreference());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Payment details : " + account.getPaymentDetails());
    }
	}
}
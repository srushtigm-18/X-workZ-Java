class Swiggy {

    SwiggyAccount account[] = new SwiggyAccount[5] ;
	int index;

    public boolean createUserAccount(SwiggyAccount account) {
        boolean isAccountCreated = false;
        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isOtpValid = false;
        boolean isEmailValid = false;
        boolean isAddressValid = false;

        String id = account.getId();
        if (id != null && !id.isEmpty()) {
            isIdValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String mobileNumber = account.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String address = account.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        }

        if (isIdValid && isNameValid && isMobileNumberValid
                && isOtpValid && isEmailValid && isAddressValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(SwiggyAccount account:account){
			System.out.println("-----------------");
        if (account != null) {
            System.out.println("User account created on Swiggy");
            System.out.println("Id : " + account.getId());
            System.out.println("Name : " + account.getName());
            System.out.println("Mobile number : " + account.getMobileNumber());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Address : " + account.getAddress());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
class Meesho {

    UserAccount2 userAccounts[] = new UserAccount2[19];
	int index;

    public boolean createUserAccount(UserAccount2 userAccount) {
        boolean isUserAccountCreated = false;
        boolean isUserIdValid = false;
        boolean isUserNameValid = false;
        boolean isUserEmailValid = false;
        boolean isUserOtpValid = false;
        boolean isUserPhoneNoValid = false;
        boolean isUserLocationValid = false;

        int uId = userAccount.getUserId();
        if (uId > 0) {
            isUserIdValid = true;
        }

        String uName = userAccount.getUserName();
        if (uName != null && !uName.isEmpty()) {
            isUserNameValid = true;
        }

        String uEmail = userAccount.getUserEmail();
        if (uEmail != null && !uEmail.isEmpty()) {
            isUserEmailValid = true;
        }

        String otp = userAccount.getUserOtp();
        if (otp != null && otp.length() == 6) {
            isUserOtpValid = true;
        }

        String phone = userAccount.getUserPhoneNo();
        if (phone != null && phone.length() == 10) {
            isUserPhoneNoValid = true;
        }

        String location = userAccount.getUserLocation();
        if (location != null && !location.isEmpty()) {
            isUserLocationValid = true;
        }

        if (isUserIdValid && isUserNameValid && isUserEmailValid
                && isUserOtpValid && isUserPhoneNoValid && isUserLocationValid) {
            this.userAccounts[index++] = userAccount;
            isUserAccountCreated = true;
        }
        return isUserAccountCreated;
    }

    public void getUserDetails() {
		for(UserAccount2 userAccount : userAccounts){
		System.out.println("------------------");
        if (userAccount != null) {
            System.out.println("User account created on Meesho");
            System.out.println("User id : " + userAccount.getUserId());
            System.out.println("User name : " + userAccount.getUserName());
            System.out.println("User email : " + userAccount.getUserEmail());
            System.out.println("User OTP : " + userAccount.getUserOtp());
            System.out.println("User phone no : " + userAccount.getUserPhoneNo());
            System.out.println("User location : " + userAccount.getUserLocation());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
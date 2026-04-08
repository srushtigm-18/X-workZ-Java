class PhonePe {

    PhonePeAccount account[] = new PhonePeAccount[19];
	int index;

    public boolean createUserAccount(PhonePeAccount account) {
        boolean isAccountCreated = false;
        boolean isMobileNoValid = false;
        boolean isOtpValid = false;
        boolean isBankAccountValid = false;
        boolean isUpiPinValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;

        String mobileNo = account.getMobileNo();
        if (mobileNo != null && mobileNo.length() == 10) {
            isMobileNoValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String bankAccount = account.getBankAccount();
        if (bankAccount != null && !bankAccount.isEmpty()) {
            isBankAccountValid = true;
        }

        String upiPin = account.getUpiPin();
        if (upiPin != null && upiPin.length() == 4) {
            isUpiPinValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        if (isMobileNoValid && isOtpValid && isBankAccountValid
                && isUpiPinValid && isNameValid && isEmailValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(PhonePeAccount account:account){
			System.out.println("---------------------------------------");
        if (account != null) {
            System.out.println("User account created on PhonePe");
            System.out.println("Mobile No : " + account.getMobileNo());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Bank account : " + account.getBankAccount());
            System.out.println("UPI pin : " + account.getUpiPin());
            System.out.println("Name : " + account.getName());
            System.out.println("Email : " + account.getEmail());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
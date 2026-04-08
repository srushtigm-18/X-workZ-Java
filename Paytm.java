class Paytm {

    PaytmAccount account[] = new PaytmAccount[19];
	int index;

    public boolean createUserAccount(PaytmAccount account) {
        boolean isAccountCreated = false;
        boolean isMobileNoValid = false;
        boolean isOtpValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPinValid = false;
        boolean isKycDetailsValid = false;
        boolean isBankLinkingValid = false;

        String mobileNo = account.getMobileNo();
        if (mobileNo != null && mobileNo.length() == 10) {
            isMobileNoValid = true;
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

        String pin = account.getPin();
        if (pin != null && pin.length() == 4) {
            isPinValid = true;
        }

        String kycDetails = account.getKycDetails();
        if (kycDetails != null && !kycDetails.isEmpty()) {
            isKycDetailsValid = true;
        }

        String bankLinking = account.getBankLinking();
        if (bankLinking != null && !bankLinking.isEmpty()) {
            isBankLinkingValid = true;
        }

        if (isMobileNoValid && isOtpValid && isNameValid
                && isEmailValid && isPinValid
                && isKycDetailsValid 
				&& isBankLinkingValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(PaytmAccount account:account){
			System.out.println("--------------------------------------");
        if (account != null) {
            System.out.println("User account created on Paytm");
            System.out.println("Mobile No : " + account.getMobileNo());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Name : " + account.getName());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Pin : " + account.getPin());
            System.out.println("Kyc details : " + account.getKycDetails());
            System.out.println("Bank linking : " + account.getBankLinking());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
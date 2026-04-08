class Canva {
    CanvaAccount account[] = new CanvaAccount[19];
	int index;

    public boolean createUserAccount(CanvaAccount account) {
        boolean isAccountCreated = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isNameValid = false;
        boolean isAccountTypeValid = false;
        boolean isOtpValid = false;
        boolean isPreferencesValid = false;

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String accountType = account.getAccountType();
        if (accountType != null && !accountType.isEmpty()) {
            isAccountTypeValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String preferences = account.getPreferences();
        if (preferences != null && !preferences.isEmpty()) {
            isPreferencesValid = true;
        }

        if (isEmailValid && isPasswordValid && isNameValid
                && isAccountTypeValid && isOtpValid && isPreferencesValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(CanvaAccount account: account){
			System.out.println("------------------------");
        if (account != null) {
            System.out.println("User account created on Canva");
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Name : " + account.getName());
            System.out.println("Account type : " + account.getAccountType());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Preferences : " + account.getPreferences());
        } else {
            System.out.println("No user account exists.");
        }
		
    }
	}
}
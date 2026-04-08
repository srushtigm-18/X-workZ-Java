class GitHub {
	
    GitHubAccount account[] = new GitHubAccount[19];
	int index;

    public boolean createUserAccount(GitHubAccount account) {
        boolean isAccountCreated = false;
        boolean isUsernameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isCountryValid = false;
        boolean isVerifyEmailValid = false;
        boolean isCaptchaValid = false;

        String username = account.getUsername();
        if (username != null && !username.isEmpty()) {
            isUsernameValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String country = account.getCountry();
        if (country != null && !country.isEmpty()) {
            isCountryValid = true;
        }

        boolean verifyEmail = account.getVerifyEmail();
        if (verifyEmail) {
            isVerifyEmailValid = true;
        }

        String captcha = account.getCaptcha();
        if (captcha != null && !captcha.isEmpty()) {
            isCaptchaValid = true;
        }

        if (isUsernameValid && isEmailValid && isPasswordValid && isCountryValid && isVerifyEmailValid && isCaptchaValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(GitHubAccount account : account){
			System.out.println("--------------------------------");
        if (account != null) {
            System.out.println("User account created on GitHub");
            System.out.println("Username : " + account.getUsername());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Country : " + account.getCountry());
            System.out.println("Verify email : " + account.getVerifyEmail());
            System.out.println("Captcha : " + account.getCaptcha());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
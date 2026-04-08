public class Reddit {

    RedditAccount account[] = new RedditAccount[19];
	int index;

    public boolean createUserAccount(RedditAccount account) {
        boolean isAccountCreated = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isAgeValid = false;
        boolean isInterestValid = false;
        boolean isOtpValid = false;

        String userName = account.getUserName();
        if (userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        int age = account.getAge();
        if (age >= 13) { 
            isAgeValid = true;
        }

        String interest = account.getInterest();
        if (interest != null && !interest.isEmpty()) {
            isInterestValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        if (isUserNameValid && isEmailValid && isPasswordValid
                && isAgeValid && isInterestValid 
				&& isOtpValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(RedditAccount account : account){
			System.out.println("------------------------------------");
        if (account != null) {
            System.out.println("User account created on Reddit");
            System.out.println("User name : " + account.getUserName());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Age : " + account.getAge());
            System.out.println("Interest : " + account.getInterest());
            System.out.println("Otp : " + account.getOtp());
        } else {
            System.out.println("No user account exists.");
        }
    }
}
}
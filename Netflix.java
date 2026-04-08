class Netflix {
    NetflixAccount account[] = new NetflixAccount[19];
	int index;

    public boolean createUserAccount(NetflixAccount account) {
        boolean isAccountCreated = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPlanValid = false;
        boolean isPaymentValid = false;
        boolean isNameValid = false;
        boolean isPhoneNumberValid = false;

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String plan = account.getPlan();
        if (plan != null && !plan.isEmpty()) {
            isPlanValid = true;
        }

        String payment = account.getPayment();
        if (payment != null && !payment.isEmpty()) {
            isPaymentValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String phoneNumber = account.getPhoneNumber();
        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        }

        if (isEmailValid && isPasswordValid && isPlanValid && isPaymentValid && isNameValid && isPhoneNumberValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(NetflixAccount account:account){
			System.out.println("--------------------------------");
		System.out.println("User account created on Netflix");
        System.out.println("Email : " + account.getEmail());
        System.out.println("Password : " + account.getPassword());
        System.out.println("Plan : " + account.getPlan());
        System.out.println("Payment : " + account.getPayment());
        System.out.println("Name : " + account.getName());
        System.out.println("Phone number : " + account.getPhoneNumber());
       
    }
}
}
class Pinterest {

    PinterestAccount account[] = new PinterestAccount[19];
	int index;

    public boolean createUserAccount(PinterestAccount account) {
        boolean isAccountCreated = false;
        boolean isIdValid = false;
        boolean isEmailValid = false;
        boolean isNameValid = false;
        boolean isPasswordValid = false;
        boolean isAgeValid = false;
        boolean isGenderValid = false;
        boolean isInterestValid = false;

        String id = account.getId();
        if (id != null && !id.isEmpty()) {
            isIdValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        int age = account.getAge();
        if (age >= 13) { 
            isAgeValid = true;
        }

        String gender = account.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String interest = account.getInterest();
        if (interest != null && !interest.isEmpty()) {
            isInterestValid = true;
        }

        if (isIdValid && isEmailValid && isNameValid && isPasswordValid && isAgeValid
                && isGenderValid 
				&& isInterestValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(PinterestAccount account:account){
			System.out.println("---------------------------------");
        if (account != null) {
            System.out.println("User account created on Pinterest");
            System.out.println("Id : " + account.getId());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Name : " + account.getName());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Age : " + account.getAge());
            System.out.println("Gender : " + account.getGender());
            System.out.println("Interest : " + account.getInterest());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
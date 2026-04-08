class Snapchat {
	
    SnapchatAccount account[] = new SnapchatAccount[19];
	int index;

    public boolean createUserAccount(SnapchatAccount account) {
        boolean isAccountCreated = false;
        boolean isNameValid = false;
        boolean isUsernameValid = false;
        boolean isPasswordValid = false;
        boolean isEmailValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDateOfBirthValid = false;

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String username = account.getUsername();
        if (username != null && !username.isEmpty()) {
            isUsernameValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String phoneNumber = account.getPhoneNumber();
        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        }

        String dateOfBirth = account.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        if (isNameValid && isUsernameValid && isPasswordValid
                && isEmailValid && isPhoneNumberValid && isDateOfBirthValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(SnapchatAccount account:account){
			Syetem.out.println("-----------------------------------------------");
        if (account != null) {
            System.out.println("User account created on Snapchat");
            System.out.println("Name : " + account.getName());
            System.out.println("Username : " + account.getUsername());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Phone number : " + account.getPhoneNumber());
            System.out.println("Date of birth : " + account.getDateOfBirth());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
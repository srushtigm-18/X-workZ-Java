class Spotify {

    SpotifyAccount account[] = new SpotifyAccount[19];
	int index;
	

    public boolean createUserAccount(SpotifyAccount account) {
        boolean isAccountCreated = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isUsernameValid = false;
        boolean isDateOfBirthValid = false;
        boolean isGenderValid = false;
        boolean isCountryValid = false;

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String username = account.getUsername();
        if (username != null && !username.isEmpty()) {
            isUsernameValid = true;
        }

        String dob = account.getDateOfBirth();
        if (dob != null && !dob.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String gender = account.getGender();
        if (gender != null && !gender.isEmpty()) {
            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")
                    || gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                isGenderValid = true;
            }
        }

        String country = account.getCountry();
        if (country != null && !country.isEmpty()) {
            isCountryValid = true;
        }

        if (isEmailValid && isPasswordValid && isUsernameValid
                && isDateOfBirthValid && isGenderValid && isCountryValid) {
            this.account = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(SpotifyAccount account: account){
			Systm.out.println("--------------------------------------------");
            System.out.println("User account created on Spotify");
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Username : " + account.getUsername());
            System.out.println("Date of birth : " + account.getDateOfBirth());
            System.out.println("Gender : " + account.getGender());
            System.out.println("Country : " + account.getCountry());
    }
	}
}
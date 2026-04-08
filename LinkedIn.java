class LinkedIn {
    LinkedInAccount account[] = new LinkedInAccount[19];
	int index;

    public boolean createUserAccount(LinkedInAccount account) {
        boolean isAccountCreated = false;
        boolean isNameValid = false;
        boolean isIdValid = false;
        boolean isJobTitleValid = false;
        boolean isEducationValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isLocationValid = false;

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }


        int id = account.getId();
        if (id > 0) {
            isIdValid = true;
        }
		

        String jobTitle = account.getJobTitle();
        if (jobTitle != null && !jobTitle.isEmpty()) {
            isJobTitleValid = true;
        }
		

        String education = account.getEducation();
        if (education != null && !education.isEmpty()) {
            isEducationValid = true;
        }
		

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }
		

        String location = account.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }
		

        if (isNameValid && isIdValid && isJobTitleValid && isEducationValid && isEmailValid
                && isPasswordValid && isLocationValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(LinkedInAccount account: account){
			System.out.println();

            System.out.println("User account created on LinkedIn");
            System.out.println("Name : " + account.getName());
            System.out.println("Id : " + account.getId());
            System.out.println("Job title : " + account.getJobTitle());
            System.out.println("Education : " + account.getEducation());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Location : " + account.getLocation());
  }
	}
}
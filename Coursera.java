class Coursera {

    CourseraAccount account[] = new CourseraAccount[19];
	int index;

    public boolean createUserAccount(CourseraAccount account) {
        boolean isAccountCreated = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isCourseInterestValid = false;
        boolean isEducationValid = false;
        boolean isIntOtpValid = false;

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = account.getPassword();
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String courseInterest = account.getCourseInterest();
        if (courseInterest != null && !courseInterest.isEmpty()) {
            isCourseInterestValid = true;
        }

        String education = account.getEducation();
        if (education != null && !education.isEmpty()) {
            isEducationValid = true;
        }

        int intOtp = account.getIntOtp();
        if (intOtp > 0) {
            isIntOtpValid = true;
        }

        if (isNameValid && isEmailValid && isPasswordValid
                && isCourseInterestValid && isEducationValid && isIntOtpValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
	for(CourseraAccount account: account){
		System.out.println("-------------------------------");
		
        if (account != null) {
            System.out.println("User account created on Coursera");
            System.out.println("Name : " + account.getName());
            System.out.println("Email : " + account.getEmail());
            System.out.println("Password : " + account.getPassword());
            System.out.println("Course interest : " + account.getCourseInterest());
            System.out.println("Education : " + account.getEducation());
            System.out.println("Int OTP : " + account.getIntOtp());
        } else {
            System.out.println("No user account exists.");
        }
	}
	}
    }
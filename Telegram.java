class Telegram {

    TelegramAccount account[] = new TelegramAccount[5];
    int index;
    public boolean createUserAccount(TelegramAccount account) {
        boolean isAccountCreated = false;
        boolean isMobileValid = false;
        boolean isOtpValid = false;
        boolean isNameValid = false;
        boolean isUsernameValid = false;
        boolean isContactPermissionValid = false;
        boolean isProfilePhotoValid = false;

        String mobile = account.getMobile();
        if (mobile != null && mobile.length() == 10) {
            isMobileValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String username = account.getUsername();
        if (username != null && !username.isEmpty()) {
            isUsernameValid = true;
        }

        boolean contactPermission = account.getContactPermission();
        isContactPermissionValid = true; 

        String profilePhoto = account.getProfilePhoto();
        if (profilePhoto != null && !profilePhoto.isEmpty()) {
            isProfilePhotoValid = true;
        }

        if (isMobileValid && isOtpValid && isNameValid
                && isUsernameValid && isContactPermissionValid && isProfilePhotoValid) {
				this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getUserDetails() {
		for(TelegramAccount account:account){
			System.out.println("------------------------------------");
        if (account != null) {
            System.out.println("User account created on Telegram");
            System.out.println("Mobile : " + account.getMobile());
            System.out.println("Otp : " + account.getOtp());
            System.out.println("Name : " + account.getName());
            System.out.println("Username : " + account.getUsername());
            System.out.println("Contact permission : " + account.getContactPermission());
            System.out.println("Profile photo : " + account.getProfilePhoto());
        } else {
            System.out.println("No user account exists.");
        }
    }
	}
}
class Zomato {

    ZomatoAccount account[] = new ZomatoAccount[19];
	int index;

    public boolean createUserAccount(ZomatoAccount account) {
        boolean isAccountCreated = false;
        boolean isMobileNumberValid = false;
        boolean isOtpValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isAddressValid = false;
        boolean isLocationValid = false;

        String mobileNumber = account.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        }

        String otp = account.getOtp();
        if (otp != null && otp.length() == 6) {
            isOtpValid = true;
        }

        String name = account.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        String email = account.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String address = account.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        }

        String location = account.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

        if (isMobileNumberValid && isOtpValid && isNameValid
                && isEmailValid && isAddressValid && isLocationValid) {
            this.account[index++] = account;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }
public void getUserDetails() {
    System.out.println("List of Zomato Users:");
   for(ZomatoAccount userAccount : account) {
            System.out.println("------------------");
            if (userAccount != null) {  
                System.out.println("User account created on Zomato");
                System.out.println("Mobile number : " + userAccount.getMobileNumber());
                System.out.println("Otp : " + userAccount.getOtp());
                System.out.println("Name : " + userAccount.getName());
                System.out.println("Email : " + userAccount.getEmail());
                System.out.println("Address : " + userAccount.getAddress());
                System.out.println("Location : " + userAccount.getLocation());
            }
        }
}
}
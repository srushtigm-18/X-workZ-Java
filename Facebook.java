class Facebook{
static String firstName;
static String surName;
static String dOB;
static String gmail;
static String phoneNumber;



public static boolean createAccount(String fName, String sName,String dateOfBirth,String Gmail,String pNo){

boolean isAccountCreated=false;

boolean isFNameValid=false;
boolean isDateOfBirthValid=false;
boolean isSNameValid=false;
boolean isGMailValid=false;
boolean isPhoneNumberValid=false;


if(fName != null && !fName.isEmpty()){
firstName= fName;
isFNameValid=true;
}else{
System.out.println("The first name is not valid");
}


if(sName != null && !sName.isEmpty()){
surName= sName;
isSNameValid=true;
}else{
System.out.println("The sur name  is not valid");
}


if(dateOfBirth != null && !dateOfBirth.isEmpty()){
dOB= dateOfBirth;
isDateOfBirthValid=true;
}else{
System.out.println("The date of birth is not valid");
}

if(Gmail != null && !Gmail.isEmpty()){
gmail= Gmail;
isGMailValid=true;
}else{
System.out.println("The gmail is not valid");
}

if(pNo != null && !pNo.isEmpty()){
phoneNumber= pNo;
isPhoneNumberValid=true;
}else{
System.out.println("Thephone number is not valid");
}


if(isFNameValid==true && isSNameValid==true && isDateOfBirthValid==true && isGMailValid==true && isPhoneNumberValid==true){
isAccountCreated=true;
}
return isAccountCreated;
}

public static void getAccount(){
System.out.println("The Accout details are:");
System.out.println("First name: "+firstName);
System.out.println("Sur name:"+surName);
System.out.println("Date of Birth:"+dOB);
System.out.println("Gmail is : "+gmail);
}
}
class Theatre{
public static void main(String[] args){

String name = "PVR";
String owner = "PVR INOX Limited";
int foundedIn = 1997;
String address = "Saket, New Delhi";
String totalBranches="1749 Screens,355 properties";
String theatreType="Multiplex";

String branches[]={"New Delhi(HQ)","Benglore","Chennai","Guwahati","Hydrabad","Mumbai","Sri Lanka"};

String movieTypes[]={"Bollywood","Hollywood","regional(Kannada, Tamil,Telugu,etc.)","dubbed films"};

String ticketsAvailable[]={"silver/gold/platinum","IMAX 4DX","Family packs","Student discounts","Couples"};

System.out.println("The theatre name is: "+name);
System.out.println("The Owner of theatre: "+owner);
System.out.println("Address of the theatre: "+address);

System.out.println("Founded in: "+foundedIn);
System.out.println("Total branches: "+totalBranches);
System.out.println("Type of theatre: "+theatreType);

System.out.println(); 

int size = branches.length;
System.out.println("The number of Branches available are: "+size);
System.out.println("The list of branches:");

for(String branch : branches){
 System.out.println(branch);
 }

System.out.println(); 

int length = movieTypes.length;
System.out.println("The number of catgories available are: "+length);
System.out.println("The list of some catgories are:");

for(String catgorie : movieTypes){
 System.out.println(catgorie);
}

System.out.println(); 

int ln = ticketsAvailable.length;
System.out.println("The number of tickets available are: "+ln);
System.out.println("The list of tickets available are:");

for(String ticket : ticketsAvailable){
 System.out.println(ticket);
}

}
}
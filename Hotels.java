class Hotels{
public static void main(String[] args){
String name = "Taj Hotels";
String owner = "Tata Group";
String address = "Mumbai";
String branches[]={"Benglore","Mumbai","New York","London"};
String manegers[]={"Indrani Gupta", "Manoj", "Praful","Bharath"};

System.out.println(" The Hotel Name is: "+name);
System.out.println(" The Owner of Hotel: "+owner);
System.out.println(" address of the hotel: "+address);

int size = branches.length;
System.out.println("The number of Branches available are: "+size);
System.out.println("The list of branches:");


for(String branch : branches){
 System.out.println(branch);
 }
 System.out.println();
  
System.out.println("The list of manegers:");

for(String maneger : manegers){
 System.out.println(maneger);
}
}
}





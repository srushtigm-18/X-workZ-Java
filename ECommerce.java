class ECommerce{
public static void main(String[] args){

String name = "Flipkart";
String owner = "Walmart(Parent company; founded by Sachin & Binny Bansal)";
String address = "Bengaluru,Karnataka";
String cEO="Kalyan Krishnamurthy";

String branches[]={"Benglore(HQ)","Chennai","Guwahati","Hydrabad","Mumbai"};

String specialFeatures[]={"Cash on Delivery","AR view","Voice search in regional languages","Ekart fastest delivery"};

String catogoriesAvailable[]={"Electronics","Fashion & Apparel","Home & Furniture","Beauty and Grocery","others"};

System.out.println("The India's leading e-commerce company name is: "+name);
System.out.println("The Owner of company: "+owner);
System.out.println("Address of the company: "+address);

System.out.println("CEO of the company: "+cEO);

System.out.println(); 

int size = branches.length;
System.out.println("The number of Branches available are: "+size);
System.out.println("The list of branches:");

for(String branch : branches){
 System.out.println(branch);
 }

System.out.println(); 

int length =catgorie.length;
System.out.println("The number of catgories available are: "+length);
System.out.println("The list of some catgories are:");

for(String catgorie : catogoriesAvailable){
 System.out.println(catgorie);
}

System.out.println(); 

System.out.println("The some special features are:");

for(String feature : specialFeatures){
 System.out.println(feature);
}

}
}
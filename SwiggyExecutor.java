class SwiggyExecutor {

public static void main(String[] ags){
	 String foodName = "Brownie";
	double foodPrice = Swiggy.search(foodName);
	 System.out.println("The food item of "+foodName+ " is : "+foodPrice);
}
}	 

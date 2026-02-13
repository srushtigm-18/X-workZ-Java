class LaptopExecutor{

public static void main(String[] args){
	double price = Laptop.getPrice();
	String brand = Laptop.getBrand();
	String colour = Laptop.getColour();
	String resolution = Laptop.getResolution();
	
	String dimensions = Laptop.getDimension();
	String battery = Laptop.getBatteries();
	String modelNumber = Laptop.getModelNumber();
	
	String processor = Laptop.getProcessorBrand();
	String processorType = Laptop.getProcessorType();
	int processorCount = Laptop.getProcessorCount();
	
	String memory = Laptop.getMemorySupported();
	String hardDrive = Laptop.getHardDrive();
	String graphics = Laptop.getGraphics();
	
	String connectivity = Laptop.getConnectivity();
	String oS = Laptop.getOS();
	double batteryLife = Laptop.getBatteryLife();
	String origin = Laptop.getOrigin();
	String weight = Laptop.getWeight();
	

	System.out.println("Laptop price is: "+price);
	System.out.println("The laptop brand is: "+brand);
	System.out.println("The laptop colour is: "+colour);
	System.out.println("The Screen Resolution is: "+resolution);
	
	System.out.println("The laptop dimensions are: "+dimensions);
	System.out.println("The details of batteries:  "+battery);
	System.out.println("The model number is: "+modelNumber);
	
	System.out.println("The processor is of: "+processor);
	System.out.println("The Processor type is: "+processorType);
    System.out.println("The Number of processor used is: "+processorCount);
	
	System.out.println("The maximum memory supported is: "+memory);
	System.out.println("The hard drive size is: "+hardDrive);
	System.out.println("The graphics coprocessor is: "+graphics);
	
	System.out.println("Connectivity type is: "+connectivity);
	System.out.println("Oprating system is: "+oS);
	System.out.println("Average Battery life (in hours): "+batteryLife);
	System.out.println("Country of origin is: "+origin);
    System.out.println("Laptop weight: "+weight);


	
	
}
}
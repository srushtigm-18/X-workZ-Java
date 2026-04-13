class GardenMethodRefRunner {

    public static void main(String[] hoo) {
       
	   
        Flower flower = new Flower();
        flower.flowerId = 102;
        flower.name = "Jasmine";
        flower.colour = "White";
        flower.price = 15.0;
        flower.fragrance = "Intense";
		
        Garden garden = new Garden(2, flower);
        garden.getDetails();
        
		
    }
}
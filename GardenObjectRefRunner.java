class GardenObjectRefRunner {

    public static void main(String[] hoo) {
        
		
        Flower flower = new Flower();
        Garden garden = new Garden(1, flower);
		
        flower.flowerId = 101;
        flower.name = "Rose";
        flower.colour = "Red";
        flower.price = 25.0;
        flower.fragrance = "Sweet";
		
        garden.getDetails();
       
	   
    }
}
class GardenConstRefRunner {

public static void main(String[] hoov) {


Flower flower = new Flower();
flower.flowerId = 18;
flower.name = "Marigold";
flower.colour = "Yellow";
flower.price = 10.0;
flower.fragrance = "Mild";

Garden garden = new Garden(3, flower);

garden.getDetails();


}
}
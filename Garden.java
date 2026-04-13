class Garden {

int gardenId;
Flower flower;
    
Garden(int gardenId, Flower flower) {

this.gardenId = gardenId;
this.flower = flower;
}
    
public void getDetails() {

System.out.println("Garden id is: " + this.gardenId);
System.out.println("Flower id is: " + this.flower.flowerId);
System.out.println("Flower name is: " + this.flower.name);
System.out.println("Flower colour is: " + this.flower.colour);
System.out.println("Flower price is: " + this.flower.price);
System.out.println("Flower fragrance is: " + this.flower.fragrance);

}
}
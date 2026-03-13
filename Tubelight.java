class Tubelight {
    String shape;        
    String brand;      
    String color;       
    String usage;        
    int length;          
    int price;          
    int wattage;         
    boolean dimmable;    
    double width;        
    double weight;      
    double height;     
    double lumen;        
    
    Tubelight(String shape, String brand, String color, String usage) {
        this.shape = shape;
        this.brand = brand;
        this.color = color;
        this.usage = usage;
    }
    
    Tubelight(int length, int price, int wattage) {
        this.length = length;
        this.price = price;
        this.wattage = wattage;
    }
    
    Tubelight(boolean dimmable) {
        this.dimmable = dimmable;
    }
    
    Tubelight(double width, double height, double weight, double lumen) {
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.lumen = lumen;
    }
}



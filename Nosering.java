class Nosering {
    String style;        
    String material;     
    String color;        
    String brand;        
    int gauge;          
    int price;          
    int length;          
    boolean hypoallergenic; 
    double diameter;    
    double weight;       
    double thickness;    
    double sparkleIndex; 
    
    Nosering(String style, String material, String color, String brand) {
        this.style = style;
        this.material = material;
        this.color = color;
        this.brand = brand;
    }
    
    Nosering(int gauge, int price, int length) {
        this.gauge = gauge;
        this.price = price;
        this.length = length;
    }
    
    Nosering(boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }
    
    Nosering(double diameter, double weight, double thickness, double sparkleIndex) {
        this.diameter = diameter;
        this.weight = weight;
        this.thickness = thickness;
        this.sparkleIndex = sparkleIndex;
    }
}



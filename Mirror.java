class Mirror{
  String shape;
    String frameMaterial;
    double height;
    double width;
    String glassType;
    String brand;
    boolean wallMount;
    double weight;
    String color;
    int price;
    String usage;
    boolean lighted;
	
	Mirror(String shape,String frameMaterial,String glassType, String brand,String color,String usage){
	this.shape = shape;
	this.frameMaterial = frameMaterial;
	this.glassType = glassType;
	this.brand = brand;
	this.color = color;
	this.usage = usage;
	}
	
	Mirror( double height,double width,double weight){
	this.height = height;
	this.width = width;
	this.weight = weight; 
	}
	
	Mirror(boolean wallMount,boolean lighted){
	this.wallMount = wallMount;
	this.lighted = lighted;
	}
	
	Mirror(int price){
	this.price = price;
	}
	}
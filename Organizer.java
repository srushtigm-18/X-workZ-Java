class Organizer {
    int id;
    String name;
    String type;
    boolean rotating;
    String material;
    int compartments;
    boolean nonskid;
    String color;
    int height;
    int width;
    int depth;
    String brand;
    boolean stackable;
    String purpose;
    double price;
    String office;
    boolean adjustable;
    int capacity;
    boolean drawer;
    String finish;
    String hospital;
    String quality;
    
    Organizer(int id, String name, String type, boolean rotating, String material, 
              int compartments, boolean nonskid, String color, int height, 
              int width, int depth, String brand, boolean stackable, String purpose, 
              double price, String office, boolean adjustable, int capacity, 
              boolean drawer, String finish, String hospital, String quality) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.rotating = rotating;
        this.material = material;
        this.compartments = compartments;
        this.nonskid = nonskid;
        this.color = color;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.brand = brand;
        this.stackable = stackable;
        this.purpose = purpose;
        this.price = price;
        this.office = office;
        this.adjustable = adjustable;
        this.capacity = capacity;
        this.drawer = drawer;
        this.finish = finish;
        this.hospital = hospital;
        this.quality = quality;
    }
    
    public void getOrganizerDetails(){
        System.out.println("The organizer id is "+this.id);
        System.out.println("The organizer name is "+this.name);
        System.out.println("The organizer type is "+this.type);
        System.out.println("The organizer is rotating?.."+this.rotating);
        System.out.println("The organizer material is "+this.material);
        System.out.println("The organizer compartments are "+this.compartments);
        System.out.println("The organizer is nonskid?.."+this.nonskid);
        System.out.println("The organizer color is "+this.color);
        System.out.println("The organizer height is "+this.height);
        System.out.println("The organizer width is "+this.width);
        System.out.println("The organizer depth is "+this.depth);
        System.out.println("The organizer brand is "+this.brand);
        System.out.println("The organizer is stackable?.."+this.stackable);
        System.out.println("The organizer purpose is "+this.purpose);
        System.out.println("The organizer price is "+this.price);
        System.out.println("The organizer office is "+this.office);
        System.out.println("The organizer is adjustable?.."+this.adjustable);
        System.out.println("The organizer capacity is "+this.capacity);
        System.out.println("The organizer has drawer?.."+this.drawer);
        System.out.println("The organizer finish is "+this.finish);
        System.out.println("The organizer hospital is "+this.hospital);
        System.out.println("The organizer quality is "+this.quality);
        System.out.println("\n");
    }
}

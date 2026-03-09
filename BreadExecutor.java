class BreadExecutor {
    public static void main(String[] args) {
        // Bread 1
        Bread bread1 = new Bread();
        bread1.type = "Wheat Bread";
        bread1.outletNames = "Bakingo,Modern Bread";
        bread1.ingredients = "Whole wheat flour,yeast,salt";
        bread1.shape = "Rectangle";
        
        System.out.println("Bread Type: " + bread1.type);
        System.out.println("Bread Outlet Names: " + bread1.outletNames);
        System.out.println("Bread Ingredients: " + bread1.ingredients);
        System.out.println("Bread Shape: " + bread1.shape);
        System.out.println("-----------------------------");
        
        // Bread 2
        Bread bread2 = new Bread();
        bread2.type = "White Bread";
        bread2.outletNames = "Harvest Gold,Breadworks";
        bread2.ingredients = "Maida flour,sugar,milk powder";
        bread2.shape = "Loaf";
        
        System.out.println("Bread Type: " + bread2.type);
        System.out.println("Bread Outlet Names: " + bread2.outletNames);
        System.out.println("Bread Ingredients: " + bread2.ingredients);
        System.out.println("Bread Shape: " + bread2.shape);
        System.out.println("-----------------------------");
        
        // Bread 3
        Bread bread3 = new Bread();
        bread3.type = "Multigrain Bread";
        bread3.outletNames = "Theobroma,JustBake";
        bread3.ingredients = "Oats,barley,ragi,wheat germ";
        bread3.shape = "Round";
        
        System.out.println("Bread Type: " + bread3.type);
        System.out.println("Bread Outlet Names: " + bread3.outletNames);
        System.out.println("Bread Ingredients: " + bread3.ingredients);
        System.out.println("Bread Shape: " + bread3.shape);
        System.out.println("-----------------------------");
        
        // Bread 4
        Bread bread4 = new Bread();
        bread4.type = "Milk Bread";
        bread4.outletNames = "Monginis,CoolBreads";
        bread4.ingredients = "Milk powder,butter,sugar";
        bread4.shape = "Square";
        
        System.out.println("Bread Type: " + bread4.type);
        System.out.println("Bread Outlet Names: " + bread4.outletNames);
        System.out.println("Bread Ingredients: " + bread4.ingredients);
        bread4.shape = "Square";
        System.out.println("Bread Shape: " + bread4.shape);
        System.out.println("-----------------------------");
    }
}

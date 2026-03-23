class ApplianceRunner {
    public static void main(String[] args) {
       
        Refrigerator fridge = new Refrigerator();
        fridge.setBrand("Samsung");
        System.out.println(fridge.getApplianceInfo());
    }
}
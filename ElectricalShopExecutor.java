class ElectricalShopExecutor {
    public static void main(String[] args) {
        ElectricalShop electricalShop = new ElectricalShop();

        electricalShop.addAppliance("Refrigerator");
        electricalShop.addAppliance("Washing Machine");
        electricalShop.addAppliance("Air Conditioner");
        electricalShop.addAppliance("Microwave Oven");
        electricalShop.addAppliance("LED TV");
        electricalShop.addAppliance("Electric Cooker");
        electricalShop.addAppliance("Induction Cooktop");
        electricalShop.addAppliance("Water Heater");
        electricalShop.addAppliance("Air Cooler");
        electricalShop.addAppliance("Ceiling Fan");
        electricalShop.addAppliance("Exhaust Fan");
        electricalShop.addAppliance("Electric Kettle");
        electricalShop.addAppliance("Mixer Grinder");
        electricalShop.addAppliance("Toaster");
        electricalShop.addAppliance("Hand Blender");
        electricalShop.addAppliance("Electric Iron");
        electricalShop.addAppliance("Hair Dryer");
        electricalShop.addAppliance("Water Purifier");
        electricalShop.addAppliance("Vacuum Cleaner");
        electricalShop.addAppliance("LED Bulb Pack");

        electricalShop.getAppliances();
        System.out.println();

        int index = 10;
        String appliance = electricalShop.getApplianceByIndex(index);
        System.out.println("The appliance at index " + index + " is: " + appliance);
        System.out.println();

        String applianceName = "Air Conditioner";
        int i = electricalShop.getIndexByApplianceName(applianceName);
        System.out.println("Appliance '" + applianceName + "' is at index: " + i);
        System.out.println();

        String updated = "Air Conditioner (Split Inverter)";
        boolean ref = electricalShop.updateAppliance("Air Conditioner", updated);
        electricalShop.getAppliances();
        System.out.println();

        String deleting = "Vacuum Cleaner";
        boolean reff = electricalShop.deleteAppliance(deleting);
        electricalShop.getAppliances();
    }
}

class KettleExecutor {
    public static void main(String[] args) {
        Kettle kettle = new Kettle();

        kettle.addKettle("Electric Kettle 1.5L");
        kettle.addKettle("Stainless Steel Kettle");
        kettle.addKettle("Copper Tea Kettle");
        kettle.addKettle("Cast Iron Kettle");
        kettle.addKettle("Glass Kettle");
        kettle.addKettle("Whistling Kettle");
        kettle.addKettle("Travel Kettle");
        kettle.addKettle("Induction Kettle");
        kettle.addKettle("Smart Kettle");
        kettle.addKettle("Cordless Kettle");
        kettle.addKettle("Boiler Kettle");

        kettle.getKettles();
        System.out.println();

        int index = 5;
        String k = kettle.getKettleByIndex(index);
        System.out.println("Kettle at index " + index + " is: " + k);
        System.out.println();

        String searchName = "Stainless Steel Kettle";
        int i = kettle.getIndexByKettleName(searchName);
        System.out.println("Kettle '" + searchName + "' is at index: " + i);
        System.out.println();

        String updated = "Stainless Steel Kettle (Auto‑Off)";
        boolean ref = kettle.updateKettle("Stainless Steel Kettle", updated);
        kettle.getKettles();
        System.out.println();

        String deleting = "Boiler Kettle";
        boolean reff = kettle.deleteKettle(deleting);
        kettle.getKettles();
    }
}

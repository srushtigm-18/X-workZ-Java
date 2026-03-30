class PetroleumExecutor {
    public static void main(String[] args) {
        Petroleum petro = new Petroleum();

        petro.addProduct("Petrol");
        petro.addProduct("Diesel");
        petro.addProduct("Kerosene");
        petro.addProduct("LPG");
        petro.addProduct("CNG");
        petro.addProduct("Lubricating Oil");
        petro.addProduct("Aviation Fuel");
        petro.addProduct("Fuel Oil");
        petro.addProduct("Naphtha");
        petro.addProduct("Bitumen");
        petro.addProduct("Paraffin Wax");
        petro.addProduct("Solvent");

        petro.getProducts();
        System.out.println();

        int index = 4;
        String product = petro.getProductByIndex(index);
        System.out.println("Product at index " + index + " is: " + product);
        System.out.println();

        String searchName = "CNG";
        int i = petro.getIndexByProductName(searchName);
        System.out.println("Product " + searchName + " is at index: " + i);
        System.out.println();

        String updated = "CNG (Compressed Natural Gas)";
        boolean ref = petro.updateProduct("CNG", updated);
		petro.getProducts();

        System.out.println();

        String deleting = "Solvent";
        boolean reff = petro.deleteProduct(deleting);
        petro.getProducts();
    }
}

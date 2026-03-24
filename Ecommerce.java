class Ecommerce {

    private String products[] = new String[26];  
    int index;

    public boolean addProduct(String product) {
        boolean isAdded = false;

        if (product != null && !product.isEmpty()) {
                products[index++] = product;
          
                isAdded = true;
           
        } else {
            System.out.println(product + " is invalid");
        }
        return isAdded;
    }

    public void getProducts() {
        for (String prod : products) {
                System.out.println(prod);
            
        }
    }
}

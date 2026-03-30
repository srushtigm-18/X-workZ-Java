class Petroleum {
private String products[] = new String[15]; 
    int index;

    public boolean addProduct(String product) {
        boolean isAdded = false;
        if (product != null && !product.isEmpty()) {
            if (index < products.length) {
                products[index] = product;
                index++;
                isAdded = true;
            } else {
                System.out.println("Petroleum products list is full.");
            }
        } else {
            System.out.println(product + " is invalid.");
        }
        return isAdded;
    }

    public void getProducts() {
        System.out.println("Petroleum products:");
        for (String p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public String getProductByIndex(int idx) {
        String product = null;
        if (idx < products.length && products[idx] != null) {
            product = products[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return product;
    }

    public int getIndexByProductName(String name) {
        for (int i = 0; i < index; i++) {
            if (products[i] != null && products[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Product '" + name + "' not found.");
        return 0;
    }

    public boolean updateProduct(String existingName, String newName) {
        boolean isUpdated = false;
        if (newName == null && newName.isEmpty()) {
            System.out.println(newName + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (products[i] != null && products[i].equals(existingName)) {
                products[i] = newName;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Product " + existingName + " not found ");
        }
        return isUpdated;
    }

    public boolean deleteProduct(String deletingName) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (products[i] != null && products[i].equals(deletingName)) {
                for (int j = i; j < index - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Product '" + deletingName + "' not found");
        }
        return isDeleted;
    }
}

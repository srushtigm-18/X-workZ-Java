class Forever24Executor {
    public static void main(String[] args) {
  
        boolean created = Forever24.createCloth("Forever24", 
                                               "T-Shirt", 
                                               "M", 
                                               "Navy Blue", 
                                               "100% Cotton", 
                                               "Short Sleeve", 
                                               "Round Neck", 
                                               "Regular Fit", 
                                               799.0, 
                                               "Casual", 
                                               "Machine Wash", 
                                               "1 Year");
        
        if (created) {
            System.out.println("Men's T-Shirt created successfully at Forever24!");
            Forever24.getCloth();
        } else {
            System.out.println("T-Shirt creation failed!");
        }
        boolean create = Forever24.createCloth("Forever24", 
                                               "Kurti", 
                                               "L", 
                                               "Maroon", 
                                               "Cotton Blend", 
                                               "3/4 Sleeve", 
                                               "Mandarin Collar", 
                                               "Straight Fit", 
                                               1299.0, 
                                               "Ethnic", 
                                               "Hand Wash", 
                                               "6 Months");
        
        if (create) {
            System.out.println("Women's Kurti created successfully at Forever24!");
            Forever24.getCloth();
        } else {
            System.out.println("Kurti creation failed!");
        }

    }
}

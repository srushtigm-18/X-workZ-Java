class ApexPharmaExecutor {
    public static void main(String[] args) {
        boolean created1 = ApexPharma.createMedicine("Calpol 650", 
                                                   "Paracetamol", 
                                                   "Tablet", 
                                                   "650 mg", 
                                                   "Strip of 15", 
                                                   "Feb 2027", 
                                                   25.50, 
                                                   "Analgesic");
        
        if (created1) {
            System.out.println("Medicine created successfully");
            ApexPharma.getMedicine();
        } else {
            System.out.println("Medicine creation failed");
        }

        boolean created2 = ApexPharma.createMedicine("Aziwin 500", 
                                                   "Azithromycin", 
                                                   "Tablet", 
                                                   "500 mg", 
                                                   "Strip of 6", 
                                                   "Mar 2027", 
                                                   98.00, 
                                                   "Antibiotic");
        
        if (created2) {
            System.out.println("Second medicine created successfully");
            ApexPharma.getMedicine();
        } else {
            System.out.println("Second medicine creation failed");
        }

        System.out.println("All medicine tests completed");
    }
}

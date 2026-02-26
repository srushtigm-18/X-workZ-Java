class PsFiveExecutor {
    public static void main(String[] args) {
       
        boolean created = PsFive.createPsFive("PS5 Standard", 
                                             "8x Zen 2 Cores @ 3.5GHz", 
                                             "Custom RDNA 2, 36 CUs @ 2.23GHz", 
                                             "10.28 TFLOPS",
                                             "16GB GDDR6",
                                             "448 GB/s",
                                             "Custom 825GB SSD",
                                             "5.5GB/s Raw (8-9GB/s Compressed)",
                                             "4K UHD Blu-ray Drive",
                                             "Tempest 3D AudioTech");
        
        if (created) {
            System.out.println("PS5 created successfully!");
            PsFive.getPsFiveDetails();
        } else {
            System.out.println("PS5 creation failed!");
        }


    }
}

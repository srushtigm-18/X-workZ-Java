class CameraExecutor {
    public static void main(String[] args) {
 
        boolean created = Camera.createCamera("Canon", "EOS R5", "Full Frame", 45, "RF 24-70mm",  "5-axis IBIS", "8K", 285000.0, "Black", "2 Years","WiFi+Bluetooth", "LP-E6NH");
        
        if (created) {
            System.out.println("Camera account created successfully!");
            Camera.getCameraDetails();
        } else {
            System.out.println("Camera account creation failed!");
        }


       
        created = Camera.createCamera(null, "Test Model", "CMOS", 12, "Prime", "OIS", "4K", 50000.0, 
                                     "Silver", "1 Year", "USB", "Li-ion");
        if (created) {
            Camera.getCameraDetails();
        } else {
            System.out.println("Camera creation failed as expected due to invalid data.");
        }
    }
}

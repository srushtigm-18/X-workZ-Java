class PenDriveExecutor {
    public static void main(String[] args) {
        PenDrive pendrive1 = new PenDrive();
        pendrive1.brand = "SanDisk";
        pendrive1.capacity = 64;
        pendrive1.price = 800.00;
        pendrive1.color = "Black";
        pendrive1.warranty = true;
        pendrive1.compatibleDevices = new String[]{"Windows", "Mac", "Linux"};
        pendrive1.speeds = new int[]{100, 80, 90};
        pendrive1.formats = new String[]{"FAT32", "NTFS", "exFAT"};
        
        System.out.println("PenDrive Brand: " + pendrive1.brand);
        System.out.println("PenDrive Capacity: " + pendrive1.capacity + "GB");
        System.out.println("PenDrive Price: " + pendrive1.price);
        System.out.println("PenDrive Color: " + pendrive1.color);
        System.out.println("PenDrive Warranty: " + pendrive1.warranty);
        System.out.println("PenDrive Devices: Windows Mac Linux");
        System.out.println("PenDrive Speeds: 100 80 90 MBps");
        System.out.println("PenDrive Formats: FAT32 NTFS exFAT");
        System.out.println("-----------------------------");
        
        PenDrive pendrive2 = new PenDrive();
        pendrive2.brand = "Kingston";
        pendrive2.capacity = 32;
        pendrive2.price = 450.00;
        pendrive2.color = "Blue";
        pendrive2.warranty = true;
        pendrive2.compatibleDevices = new String[]{"Android", "PC", "TV"};
        pendrive2.speeds = new int[]{90, 75, 85};
        pendrive2.formats = new String[]{"FAT32", "exFAT"};
        
        System.out.println("PenDrive Brand: " + pendrive2.brand);
        System.out.println("PenDrive Capacity: " + pendrive2.capacity + "GB");
        System.out.println("PenDrive Price: " + pendrive2.price);
        System.out.println("PenDrive Color: " + pendrive2.color);
        System.out.println("PenDrive Warranty: " + pendrive2.warranty);
        System.out.println("PenDrive Devices: Android PC TV");
        System.out.println("PenDrive Speeds: 90 75 85 MBps");
        System.out.println("PenDrive Formats: FAT32 exFAT");
        System.out.println("-----------------------------");
        
        PenDrive pendrive3 = new PenDrive();
        pendrive3.brand = "HP";
        pendrive3.capacity = 128;
        pendrive3.price = 1500.00;
        pendrive3.color = "Silver";
        pendrive3.warranty = true;
        pendrive3.compatibleDevices = new String[]{"Laptop", "Desktop", "Tablet"};
        pendrive3.speeds = new int[]{120, 110, 115};
        pendrive3.formats = new String[]{"NTFS", "FAT32", "exFAT"};
        
        System.out.println("PenDrive Brand: " + pendrive3.brand);
        System.out.println("PenDrive Capacity: " + pendrive3.capacity + "GB");
        System.out.println("PenDrive Price: " + pendrive3.price);
        System.out.println("PenDrive Color: " + pendrive3.color);
        System.out.println("PenDrive Warranty: " + pendrive3.warranty);
        System.out.println("PenDrive Devices: Laptop Desktop Tablet");
        System.out.println("PenDrive Speeds: 120 110 115 MBps");
        System.out.println("PenDrive Formats: NTFS FAT32 exFAT");
        System.out.println("-----------------------------");
        
        PenDrive pendrive4 = new PenDrive();
        pendrive4.brand = "Sony";
        pendrive4.capacity = 16;
        pendrive4.price = 300.00;
        pendrive4.color = "Red";
        pendrive4.warranty = false;
        pendrive4.compatibleDevices = new String[]{"Windows", "PS4"};
        pendrive4.speeds = new int[]{80, 70};
        pendrive4.formats = new String[]{"FAT32"};
        
        System.out.println("PenDrive Brand: " + pendrive4.brand);
        System.out.println("PenDrive Capacity: " + pendrive4.capacity + "GB");
        System.out.println("PenDrive Price: " + pendrive4.price);
        System.out.println("PenDrive Color: " + pendrive4.color);
        System.out.println("PenDrive Warranty: " + pendrive4.warranty);
        System.out.println("PenDrive Devices: Windows PS4");
        System.out.println("PenDrive Speeds: 80 70 MBps");
        System.out.println("PenDrive Formats: FAT32");
        System.out.println("-----------------------------");
    }
}

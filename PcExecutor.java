class PcExecutor {
    public static void main(String[] args) {
        Hardware h1 = new Hardware(1, "32GB DDR5", "1TB NVMe", "RTX 4090", 2.5);
        Pc pc1 = new Pc(1, "Gaming Pro", "HP", "i9-13900K", h1);
        pc1.getPcDetails();

        Hardware h2 = new Hardware(2, "64GB DDR5", "2TB SSD", "RTX A6000", 3.2);
        Pc pc2 = new Pc(2, "Workstation", "Dell", "Ryzen 9 7950X", h2);
        pc2.getPcDetails();

        Hardware h3 = new Hardware(3, "16GB DDR4", "512GB NVMe", "RTX 4070", 1.8);
        Pc pc3 = new Pc(3, "Creator Edition", "Lenovo", "i7-13700K", h3);
        pc3.getPcDetails();

        Hardware h4 = new Hardware(4, "64GB DDR5", "4TB SSD", "RTX 4090", 3.8);
        Pc pc4 = new Pc(4, "Ultra Gaming", "Asus", "i9-14900K", h4);
        pc4.getPcDetails();

        Hardware h5 = new Hardware(5, "16GB DDR5", "1TB HDD", "GTX 1650", 1.2);
        Pc pc5 = new Pc(5, "Business Pro", "Acer", "Ryzen 7 7700X", h5);
        pc5.getPcDetails();

        Hardware h6 = new Hardware(6, "32GB DDR5", "2TB NVMe", "RTX 4080", 2.8);
        Pc pc6 = new Pc(6, "Content Creator", "MSI", "i7-14700K", h6);
        pc6.getPcDetails();

        Hardware h7 = new Hardware(7, "128GB DDR5", "8TB SSD", "RTX A5000", 4.5);
        Pc pc7 = new Pc(7, "Engineering", "HP", "Ryzen 9 7950X3D", h7);
        pc7.getPcDetails();

        Hardware h8 = new Hardware(8, "16GB DDR4", "512GB SSD", "RTX 3060", 1.4);
        Pc pc8 = new Pc(8, "Daily Driver", "Dell", "i5-13600K", h8);
        pc8.getPcDetails();

        Hardware h9 = new Hardware(9, "64GB DDR5", "2TB NVMe", "RTX 4090", 3.5);
        Pc pc9 = new Pc(9, "Streaming Beast", "Corsair", "i9-13900KS", h9);
        pc9.getPcDetails();

        Hardware h10 = new Hardware(10, "8GB DDR4", "256GB SSD", "Integrated", 0.65);
        Pc pc10 = new Pc(10, "Office Pro", "Lenovo", "i3-13100", h10);
        pc10.getPcDetails();

        Hardware h11 = new Hardware(11, "16GB DDR5", "1TB NVMe", "RTX 4060", 1.5);
        Pc pc11 = new Pc(11, "Gaming Lite", "Acer", "Ryzen 5 7600X", h11);
        pc11.getPcDetails();

        Hardware h12 = new Hardware(12, "48GB Unified", "2TB SSD", "Integrated 40CU", 3.1);
        Pc pc12 = new Pc(12, "Video Editor", "Apple", "M3 Max", h12);
        pc12.getPcDetails();

        Hardware h13 = new Hardware(13, "16GB DDR4", "512GB NVMe", "RTX 3050", 1.0);
        Pc pc13 = new Pc(13, "Budget Gaming", "MSI", "i5-13400F", h13);
        pc13.getPcDetails();

        Hardware h14 = new Hardware(14, "128GB DDR5", "4TB NVMe", "RTX 6000 Ada", 6.2);
        Pc pc14 = new Pc(14, "3D Rendering", "HP", "Threadripper 7960X", h14);
        pc14.getPcDetails();

        Hardware h15 = new Hardware(15, "8GB DDR5", "512GB SSD", "RTX 3050", 0.95);
        Pc pc15 = new Pc(15, "Student Edition", "Dell", "i5-13500", h15);
        pc15.getPcDetails();

        Hardware h16 = new Hardware(16, "256GB DDR5", "16TB SAS", "A100 80GB", 12.5);
        Pc pc16 = new Pc(16, "Pro Workstation", "Lenovo", "Xeon w9-3495X", h16);
        pc16.getPcDetails();

        Hardware h17 = new Hardware(17, "32GB DDR5", "2TB SSD", "RTX 4070 Ti", 2.3);
        Pc pc17 = new Pc(17, "Midrange", "Asus", "Ryzen 7 7800X3D", h17);
        pc17.getPcDetails();

        Hardware h18 = new Hardware(18, "8GB DDR4", "256GB SSD", "GTX 1630", 0.55);
        Pc pc18 = new Pc(18, "Entry Level", "Acer", "i3-12100F", h18);
        pc18.getPcDetails();

        Hardware h19 = new Hardware(19, "32GB DDR5", "1TB NVMe", "RTX 4070", 2.1);
        Pc pc19 = new Pc(19, "Esports Ready", "Corsair", "i7-13700KF", h19);
        pc19.getPcDetails();

        Hardware h20 = new Hardware(20, "128GB DDR5", "8TB NVMe", "RTX 5090", 5.8);
        Pc pc20 = new Pc(20, "Ultimate Rig", "Alienware", "i9-14900KS", h20);
        pc20.getPcDetails();
    }
}

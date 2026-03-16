class PcExecutor {
    public static void main(String[] args) {
        Pc pc1 = new Pc();
        pc1.pcId = 1; pc1.pcModel = "Gaming Pro"; pc1.brand = "HP"; pc1.processor = "i9-13900K";
        Hardware h1 = new Hardware(); h1.configId = 1; h1.ramSize = "32GB DDR5"; h1.storage = "1TB NVMe"; h1.gpuModel = "RTX 4090"; h1.price = 2.5;
        pc1.hardware = h1; pc1.getPcDetails();

        Pc pc2 = new Pc();
        pc2.pcId = 2; pc2.pcModel = "Workstation"; pc2.brand = "Dell"; pc2.processor = "Ryzen 9 7950X";
        Hardware h2 = new Hardware(); h2.configId = 2; h2.ramSize = "64GB DDR5"; h2.storage = "2TB SSD"; h2.gpuModel = "RTX A6000"; h2.price = 3.2;
        pc2.hardware = h2; pc2.getPcDetails();

        Pc pc3 = new Pc();
        pc3.pcId = 3; pc3.pcModel = "Creator Edition"; pc3.brand = "Lenovo"; pc3.processor = "i7-13700K";
        Hardware h3 = new Hardware(); h3.configId = 3; h3.ramSize = "16GB DDR4"; h3.storage = "512GB NVMe"; h3.gpuModel = "RTX 4070"; h3.price = 1.8;
        pc3.hardware = h3; pc3.getPcDetails();

        Pc pc4 = new Pc();
        pc4.pcId = 4; pc4.pcModel = "Ultra Gaming"; pc4.brand = "Asus"; pc4.processor = "i9-14900K";
        Hardware h4 = new Hardware(); h4.configId = 4; h4.ramSize = "64GB DDR5"; h4.storage = "4TB SSD"; h4.gpuModel = "RTX 4090"; h4.price = 3.8;
        pc4.hardware = h4; pc4.getPcDetails();

        Pc pc5 = new Pc();
        pc5.pcId = 5; pc5.pcModel = "Business Pro"; pc5.brand = "Acer"; pc5.processor = "Ryzen 7 7700X";
        Hardware h5 = new Hardware(); h5.configId = 5; h5.ramSize = "16GB DDR5"; h5.storage = "1TB HDD"; h5.gpuModel = "GTX 1650"; h5.price = 1.2;
        pc5.hardware = h5; pc5.getPcDetails();

        Pc pc6 = new Pc();
        pc6.pcId = 6; pc6.pcModel = "Content Creator"; pc6.brand = "MSI"; pc6.processor = "i7-14700K";
        Hardware h6 = new Hardware(); h6.configId = 6; h6.ramSize = "32GB DDR5"; h6.storage = "2TB NVMe"; h6.gpuModel = "RTX 4080"; h6.price = 2.8;
        pc6.hardware = h6; pc6.getPcDetails();

        Pc pc7 = new Pc();
        pc7.pcId = 7; pc7.pcModel = "Engineering"; pc7.brand = "HP"; pc7.processor = "Ryzen 9 7950X3D";
        Hardware h7 = new Hardware(); h7.configId = 7; h7.ramSize = "128GB DDR5"; h7.storage = "8TB SSD"; h7.gpuModel = "RTX A5000"; h7.price = 4.5;
        pc7.hardware = h7; pc7.getPcDetails();

        Pc pc8 = new Pc();
        pc8.pcId = 8; pc8.pcModel = "Daily Driver"; pc8.brand = "Dell"; pc8.processor = "i5-13600K";
        Hardware h8 = new Hardware(); h8.configId = 8; h8.ramSize = "16GB DDR4"; h8.storage = "512GB SSD"; h8.gpuModel = "RTX 3060"; h8.price = 1.4;
        pc8.hardware = h8; pc8.getPcDetails();

        Pc pc9 = new Pc();
        pc9.pcId = 9; pc9.pcModel = "Streaming Beast"; pc9.brand = "Corsair"; pc9.processor = "i9-13900KS";
        Hardware h9 = new Hardware(); h9.configId = 9; h9.ramSize = "64GB DDR5"; h9.storage = "2TB NVMe"; h9.gpuModel = "RTX 4090"; h9.price = 3.5;
        pc9.hardware = h9; pc9.getPcDetails();

        Pc pc10 = new Pc();
        pc10.pcId = 10; pc10.pcModel = "Office Pro"; pc10.brand = "Lenovo"; pc10.processor = "i3-13100";
        Hardware h10 = new Hardware(); h10.configId = 10; h10.ramSize = "8GB DDR4"; h10.storage = "256GB SSD"; h10.gpuModel = "Integrated"; h10.price = 0.65;
        pc10.hardware = h10; pc10.getPcDetails();

        Pc pc11 = new Pc();
        pc11.pcId = 11; pc11.pcModel = "Gaming Lite"; pc11.brand = "Acer"; pc11.processor = "Ryzen 5 7600X";
        Hardware h11 = new Hardware(); h11.configId = 11; h11.ramSize = "16GB DDR5"; h11.storage = "1TB NVMe"; h11.gpuModel = "RTX 4060"; h11.price = 1.5;
        pc11.hardware = h11; pc11.getPcDetails();

        Pc pc12 = new Pc();
        pc12.pcId = 12; pc12.pcModel = "Video Editor"; pc12.brand = "Apple"; pc12.processor = "M3 Max";
        Hardware h12 = new Hardware(); h12.configId = 12; h12.ramSize = "48GB Unified"; h12.storage = "2TB SSD"; h12.gpuModel = "Integrated 40CU"; h12.price = 3.1;
        pc12.hardware = h12; pc12.getPcDetails();

        Pc pc13 = new Pc();
        pc13.pcId = 13; pc13.pcModel = "Budget Gaming"; pc13.brand = "MSI"; pc13.processor = "i5-13400F";
        Hardware h13 = new Hardware(); h13.configId = 13; h13.ramSize = "16GB DDR4"; h13.storage = "512GB NVMe"; h13.gpuModel = "RTX 3050"; h13.price = 1.0;
        pc13.hardware = h13; pc13.getPcDetails();

        Pc pc14 = new Pc();
        pc14.pcId = 14; pc14.pcModel = "3D Rendering"; pc14.brand = "HP"; pc14.processor = "Threadripper 7960X";
        Hardware h14 = new Hardware(); h14.configId = 14; h14.ramSize = "128GB DDR5"; h14.storage = "4TB NVMe"; h14.gpuModel = "RTX 6000 Ada"; h14.price = 6.2;
        pc14.hardware = h14; pc14.getPcDetails();

        Pc pc15 = new Pc();
        pc15.pcId = 15; pc15.pcModel = "Student Edition"; pc15.brand = "Dell"; pc15.processor = "i5-13500";
        Hardware h15 = new Hardware(); h15.configId = 15; h15.ramSize = "8GB DDR5"; h15.storage = "512GB SSD"; h15.gpuModel = "RTX 3050"; h15.price = 0.95;
        pc15.hardware = h15; pc15.getPcDetails();

        Pc pc16 = new Pc();
        pc16.pcId = 16; pc16.pcModel = "Pro Workstation"; pc16.brand = "Lenovo"; pc16.processor = "Xeon w9-3495X";
        Hardware h16 = new Hardware(); h16.configId = 16; h16.ramSize = "256GB DDR5"; h16.storage = "16TB SAS"; h16.gpuModel = "A100 80GB"; h16.price = 12.5;
        pc16.hardware = h16; pc16.getPcDetails();

        Pc pc17 = new Pc();
        pc17.pcId = 17; pc17.pcModel = "Midrange"; pc17.brand = "Asus"; pc17.processor = "Ryzen 7 7800X3D";
        Hardware h17 = new Hardware(); h17.configId = 17; h17.ramSize = "32GB DDR5"; h17.storage = "2TB SSD"; h17.gpuModel = "RTX 4070 Ti"; h17.price = 2.3;
        pc17.hardware = h17; pc17.getPcDetails();

        Pc pc18 = new Pc();
        pc18.pcId = 18; pc18.pcModel = "Entry Level"; pc18.brand = "Acer"; pc18.processor = "i3-12100F";
        Hardware h18 = new Hardware(); h18.configId = 18; h18.ramSize = "8GB DDR4"; h18.storage = "256GB SSD"; h18.gpuModel = "GTX 1630"; h18.price = 0.55;
        pc18.hardware = h18; pc18.getPcDetails();

        Pc pc19 = new Pc();
        pc19.pcId = 19; pc19.pcModel = "Esports Ready"; pc19.brand = "Corsair"; pc19.processor = "i7-13700KF";
        Hardware h19 = new Hardware(); h19.configId = 19; h19.ramSize = "32GB DDR5"; h19.storage = "1TB NVMe"; h19.gpuModel = "RTX 4070"; h19.price = 2.1;
        pc19.hardware = h19; pc19.getPcDetails();

        Pc pc20 = new Pc();
        pc20.pcId = 20; pc20.pcModel = "Ultimate Rig"; pc20.brand = "Alienware"; pc20.processor = "i9-14900KS";
        Hardware h20 = new Hardware(); h20.configId = 20; h20.ramSize = "128GB DDR5"; h20.storage = "8TB NVMe"; h20.gpuModel = "RTX 5090"; h20.price = 5.8;
        pc20.hardware = h20; pc20.getPcDetails();
    }
}

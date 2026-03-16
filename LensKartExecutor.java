class LensKartExecutor {
    public static void main(String[] args) {
        LensKart lk1 = new LensKart();
        lk1.storeId = 1; lk1.storeName = "LensKart Whitefield"; lk1.city = "Bengaluru"; lk1.manager = "Priya S";
        Frame f1 = new Frame(); f1.frameId = 101; f1.frameType = "Full Rim"; f1.size = "Medium"; f1.bridgeWidth = 18; f1.price = 4.5;
        lk1.frame = f1; lk1.getStoreDetails();

        LensKart lk2 = new LensKart();
        lk2.storeId = 2; lk2.storeName = "LensKart Koramangala"; lk2.city = "Bengaluru"; lk2.manager = "Rahul K";
        Frame f2 = new Frame(); f2.frameId = 102; f2.frameType = "Half Rim"; f2.size = "Large"; f2.bridgeWidth = 20; f2.price = 3.2;
        lk2.frame = f2; lk2.getStoreDetails();

        LensKart lk3 = new LensKart();
        lk3.storeId = 3; lk3.storeName = "LensKart Jayanagar"; lk3.city = "Bengaluru"; lk3.manager = "Anita R";
        Frame f3 = new Frame(); f3.frameId = 103; f3.frameType = "Rimless"; f3.size = "Small"; f3.bridgeWidth = 16; f3.price = 2.8;
        lk3.frame = f3; lk3.getStoreDetails();

        LensKart lk4 = new LensKart();
        lk4.storeId = 4; lk4.storeName = "LensKart MG Road"; lk4.city = "Bengaluru"; lk4.manager = "Vikram J";
        Frame f4 = new Frame(); f4.frameId = 104; f4.frameType = "Full Rim"; f4.size = "Medium"; f4.bridgeWidth = 19; f4.price = 5.1;
        lk4.frame = f4; lk4.getStoreDetails();

        LensKart lk5 = new LensKart();
        lk5.storeId = 5; lk5.storeName = "LensKart Malleshwaram"; lk5.city = "Bengaluru"; lk5.manager = "Neha G";
        Frame f5 = new Frame(); f5.frameId = 105; f5.frameType = "Wayfarer"; f5.size = "Large"; f5.bridgeWidth = 22; f5.price = 4.8;
        lk5.frame = f5; lk5.getStoreDetails();

        LensKart lk6 = new LensKart();
        lk6.storeId = 6; lk6.storeName = "LensKart Indiranagar"; lk6.city = "Bengaluru"; lk6.manager = "Amit P";
        Frame f6 = new Frame(); f6.frameId = 106; f6.frameType = "Aviator"; f6.size = "Medium"; f6.bridgeWidth = 17; f6.price = 3.9;
        lk6.frame = f6; lk6.getStoreDetails();

        LensKart lk7 = new LensKart();
        lk7.storeId = 7; lk7.storeName = "LensKart Bannerghatta"; lk7.city = "Bengaluru"; lk7.manager = "Sita D";
        Frame f7 = new Frame(); f7.frameId = 107; f7.frameType = "Rectangle"; f7.size = "Small"; f7.bridgeWidth = 15; f7.price = 2.1;
        lk7.frame = f7; lk7.getStoreDetails();

        LensKart lk8 = new LensKart();
        lk8.storeId = 8; lk8.storeName = "LensKart Hebbal"; lk8.city = "Bengaluru"; lk8.manager = "Karan M";
        Frame f8 = new Frame(); f8.frameId = 108; f8.frameType = "Round"; f8.size = "Medium"; f8.bridgeWidth = 18; f8.price = 4.2;
        lk8.frame = f8; lk8.getStoreDetails();

        LensKart lk9 = new LensKart();
        lk9.storeId = 9; lk9.storeName = "LensKart Marathahalli"; lk9.city = "Bengaluru"; lk9.manager = "Lata B";
        Frame f9 = new Frame(); f9.frameId = 109; f9.frameType = "Cat Eye"; f9.size = "Large"; f9.bridgeWidth = 21; f9.price = 5.5;
        lk9.frame = f9; lk9.getStoreDetails();

        LensKart lk10 = new LensKart();
        lk10.storeId = 10; lk10.storeName = "LensKart Electronic City"; lk10.city = "Bengaluru"; lk10.manager = "Ravi K";
        Frame f10 = new Frame(); f10.frameId = 110; f10.frameType = "Oval"; f10.size = "Small"; f10.bridgeWidth = 16; f10.price = 3.0;
        lk10.frame = f10; lk10.getStoreDetails();

        LensKart lk11 = new LensKart();
        lk11.storeId = 11; lk11.storeName = "LensKart Pune Camp"; lk11.city = "Pune"; lk11.manager = "Sneha P";
        Frame f11 = new Frame(); f11.frameId = 111; f11.frameType = "Full Rim"; f11.size = "Medium"; f11.bridgeWidth = 19; f11.price = 4.0;
        lk11.frame = f11; lk11.getStoreDetails();

        LensKart lk12 = new LensKart();
        lk12.storeId = 12; lk12.storeName = "LensKart Mumbai Andheri"; lk12.city = "Mumbai"; lk12.manager = "Rajesh S";
        Frame f12 = new Frame(); f12.frameId = 112; f12.frameType = "Half Rim"; f12.size = "Large"; f12.bridgeWidth = 20; f12.price = 3.7;
        lk12.frame = f12; lk12.getStoreDetails();

        LensKart lk13 = new LensKart();
        lk13.storeId = 13; lk13.storeName = "LensKart Chennai T Nagar"; lk13.city = "Chennai"; lk13.manager = "Deepa R";
        Frame f13 = new Frame(); f13.frameId = 113; f13.frameType = "Rimless"; f13.size = "Small"; f13.bridgeWidth = 17; f13.price = 2.5;
        lk13.frame = f13; lk13.getStoreDetails();

        LensKart lk14 = new LensKart();
        lk14.storeId = 14; lk14.storeName = "LensKart Hyderabad Banjara"; lk14.city = "Hyderabad"; lk14.manager = "Arjun M";
        Frame f14 = new Frame(); f14.frameId = 114; f14.frameType = "Square"; f14.size = "Medium"; f14.bridgeWidth = 18; f14.price = 4.3;
        lk14.frame = f14; lk14.getStoreDetails();

        LensKart lk15 = new LensKart();
        lk15.storeId = 15; lk15.storeName = "LensKart Delhi Karol Bagh"; lk15.city = "Delhi"; lk15.manager = "Pooja K";
        Frame f15 = new Frame(); f15.frameId = 115; f15.frameType = "Wayfarer"; f15.size = "Large"; f15.bridgeWidth = 22; f15.price = 5.2;
        lk15.frame = f15; lk15.getStoreDetails();

        LensKart lk16 = new LensKart();
        lk16.storeId = 16; lk16.storeName = "LensKart Kolkata Park Street"; lk16.city = "Kolkata"; lk16.manager = "Saurabh D";
        Frame f16 = new Frame(); f16.frameId = 116; f16.frameType = "Aviator"; f16.size = "Medium"; f16.bridgeWidth = 19; f16.price = 3.8;
        lk16.frame = f16; lk16.getStoreDetails();

        LensKart lk17 = new LensKart();
        lk17.storeId = 17; lk17.storeName = "LensKart Ahmedabad CG Road"; lk17.city = "Ahmedabad"; lk17.manager = "Meera S";
        Frame f17 = new Frame(); f17.frameId = 117; f17.frameType = "Rectangle"; f17.size = "Small"; f17.bridgeWidth = 15; f17.price = 2.9;
        lk17.frame = f17; lk17.getStoreDetails();

        LensKart lk18 = new LensKart();
        lk18.storeId = 18; lk18.storeName = "LensKart Chandigarh Sector 17"; lk18.city = "Chandigarh"; lk18.manager = "Gurpreet K";
        Frame f18 = new Frame(); f18.frameId = 118; f18.frameType = "Round"; f18.size = "Medium"; f18.bridgeWidth = 18; f18.price = 4.7;
        lk18.frame = f18; lk18.getStoreDetails();

        LensKart lk19 = new LensKart();
        lk19.storeId = 19; lk19.storeName = "LensKart Jaipur MI Road"; lk19.city = "Jaipur"; lk19.manager = "Nisha R";
        Frame f19 = new Frame(); f19.frameId = 119; f19.frameType = "Cat Eye"; f19.size = "Large"; f19.bridgeWidth = 21; f19.price = 5.0;
        lk19.frame = f19; lk19.getStoreDetails();

        LensKart lk20 = new LensKart();
        lk20.storeId = 20; lk20.storeName = "LensKart Noida Sector 18"; lk20.city = "Noida"; lk20.manager = "Vikrant S";
        Frame f20 = new Frame(); f20.frameId = 120; f20.frameType = "Oval"; f20.size = "Small"; f20.bridgeWidth = 16; f20.price = 3.4;
        lk20.frame = f20; lk20.getStoreDetails();
    }
}

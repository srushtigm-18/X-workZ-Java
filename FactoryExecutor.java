class FactoryExecutor {
    public static void main(String[] args) {
        Factory f1 = new Factory();
        f1.factoryId = 1; f1.factoryName = "BHEL Haridwar"; f1.location = "Uttarakhand"; f1.industry = "Power Equipment";
        Machine m1 = new Machine(); m1.machineId = 101; m1.machineType = "Turbine"; m1.capacity = 500; m1.manufacturer = "Siemens"; m1.cost = 45.0;
        f1.machine = m1; f1.getFactoryDetails();

        Factory f2 = new Factory();
        f2.factoryId = 2; f2.factoryName = "Tata Steel Jamshedpur"; f2.location = "Jharkhand"; f2.industry = "Steel";
        Machine m2 = new Machine(); m2.machineId = 202; m2.machineType = "Blast Furnace"; m2.capacity = 10000; m2.manufacturer = "Danieli"; m2.cost = 120.0;
        f2.machine = m2; f2.getFactoryDetails();

        Factory f3 = new Factory();
        f3.factoryId = 3; f3.factoryName = "Maruti Suzuki Manesar"; f3.location = "Haryana"; f3.industry = "Automobile";
        Machine m3 = new Machine(); m3.machineId = 303; m3.machineType = "Assembly Line"; m3.capacity = 2000; m3.manufacturer = "ABB"; m3.cost = 85.0;
        f3.machine = m3; f3.getFactoryDetails();

        Factory f4 = new Factory();
        f4.factoryId = 4; f4.factoryName = "Reliance Jamnagar"; f4.location = "Gujarat"; f4.industry = "Refinery";
        Machine m4 = new Machine(); m4.machineId = 404; m4.machineType = "Catalytic Cracker"; m4.capacity = 1500000; m4.manufacturer = "ExxonMobil"; m4.cost = 250.0;
        f4.machine = m4; f4.getFactoryDetails();

        Factory f5 = new Factory();
        f5.factoryId = 5; f5.factoryName = "Foxconn Chennai"; f5.location = "Tamil Nadu"; f5.industry = "Electronics";
        Machine m5 = new Machine(); m5.machineId = 505; m5.machineType = "SMT Machine"; m5.capacity = 50000; m5.manufacturer = "Yamaha"; m5.cost = 12.5;
        f5.machine = m5; f5.getFactoryDetails();

        Factory f6 = new Factory();
        f6.factoryId = 6; f6.factoryName = "Bajaj Auto Pune"; f6.location = "Maharashtra"; f6.industry = "Two Wheeler";
        Machine m6 = new Machine(); m6.machineId = 606; m6.machineType = "CNC Machine"; m6.capacity = 800; m6.manufacturer = "DMG Mori"; m6.cost = 18.0;
        f6.machine = m6; f6.getFactoryDetails();

        Factory f7 = new Factory();
        f7.factoryId = 7; f7.factoryName = "Hero MotoCorp Dharuhera"; f7.location = "Haryana"; f7.industry = "Motorcycle";
        Machine m7 = new Machine(); m7.machineId = 707; m7.machineType = "Welding Robot"; m7.capacity = 1200; m7.manufacturer = "KUKA"; m7.cost = 22.0;
        f7.machine = m7; f7.getFactoryDetails();

        Factory f8 = new Factory();
        f8.factoryId = 8; f8.factoryName = "Samsung Noida"; f8.location = "Uttar Pradesh"; f8.industry = "Consumer Electronics";
        Machine m8 = new Machine(); m8.machineId = 808; m8.machineType = "Injection Molding"; m8.capacity = 30000; m8.manufacturer = "Arburg"; m8.cost = 15.0;
        f8.machine = m8; f8.getFactoryDetails();

        Factory f9 = new Factory();
        f9.factoryId = 9; f9.factoryName = "L&T Hazira"; f9.location = "Gujarat"; f9.industry = "Heavy Engineering";
        Machine m9 = new Machine(); m9.machineId = 909; m9.machineType = "Heavy Lathe"; m9.capacity = 50; m9.manufacturer = "WaldrichSiegen"; m9.cost = 35.0;
        f9.machine = m9; f9.getFactoryDetails();

        Factory f10 = new Factory();
        f10.factoryId = 10; f10.factoryName = "TVS Hosur"; f10.location = "Tamil Nadu"; f10.industry = "Auto Components";
        Machine m10 = new Machine(); m10.machineId = 1010; m10.machineType = "Die Casting"; m10.capacity = 4000; m10.manufacturer = "Idra"; m10.cost = 28.0;
        f10.machine = m10; f10.getFactoryDetails();

        Factory f11 = new Factory();
        f11.factoryId = 11; f11.factoryName = "Hindalco Renukoot"; f11.location = "Uttar Pradesh"; f11.industry = "Aluminium";
        Machine m11 = new Machine(); m11.machineId = 111; m11.machineType = "Smelter"; m11.capacity = 600000; m11.manufacturer = "Outotec"; m11.cost = 180.0;
        f11.machine = m11; f11.getFactoryDetails();

        Factory f12 = new Factory();
        f12.factoryId = 12; f12.factoryName = "JSW Steel Vijayanagar"; f12.location = "Karnataka"; f12.industry = "Steel";
        Machine m12 = new Machine(); m12.machineId = 1212; m12.machineType = "Rolling Mill"; m12.capacity = 18000; m12.manufacturer = "SMS Siemag"; m12.cost = 95.0;
        f12.machine = m12; f12.getFactoryDetails();

        Factory f13 = new Factory();
        f13.factoryId = 13; f13.factoryName = "Hyundai Chennai"; f13.location = "Tamil Nadu"; f13.industry = "Automobile";
        Machine m13 = new Machine(); m13.machineId = 1313; m13.machineType = "Press Line"; m13.capacity = 1500; m13.manufacturer = "Schuler"; m13.cost = 65.0;
        f13.machine = m13; f13.getFactoryDetails();

        Factory f14 = new Factory();
        f14.factoryId = 14; f14.factoryName = "Vedanta Sterlite"; f14.location = "Tamil Nadu"; f14.industry = "Copper";
        Machine m14 = new Machine(); m14.machineId = 1414; m14.machineType = "Electrolytic Refinery"; m14.capacity = 400000; m14.manufacturer = "Outotec"; m14.cost = 110.0;
        f14.machine = m14; f14.getFactoryDetails();

        Factory f15 = new Factory();
        f15.factoryId = 15; f15.factoryName = "Godrej Appliances"; f15.location = "Maharashtra"; f15.industry = "Consumer Durables";
        Machine m15 = new Machine(); m15.machineId = 1515; m15.machineType = "Assembly Robot"; m15.capacity = 25000; m15.manufacturer = "Fanuc"; m15.cost = 20.0;
        f15.machine = m15; f15.getFactoryDetails();

        Factory f16 = new Factory();
        f16.factoryId = 16; f16.factoryName = "Thermax Pune"; f16.location = "Maharashtra"; f16.industry = "Boilers";
        Machine m16 = new Machine(); m16.machineId = 1616; m16.machineType = "Boiler Drum"; m16.capacity = 1000; m16.manufacturer = "BHEL"; m16.cost = 55.0;
        f16.machine = m16; f16.getFactoryDetails();

        Factory f17 = new Factory();
        f17.factoryId = 17; f17.factoryName = "Grasim Nagda"; f17.location = "Madhya Pradesh"; f17.industry = "Viscose Staple";
        Machine m17 = new Machine(); m17.machineId = 1717; m17.machineType = "Spinning Machine"; m17.capacity = 80000; m17.manufacturer = "Rieter"; m17.cost = 42.0;
        f17.machine = m17; f17.getFactoryDetails();

        Factory f18 = new Factory();
        f18.factoryId = 18; f18.factoryName = "Apollo Tyres"; f18.location = "Kerala"; f18.industry = "Tyres";
        Machine m18 = new Machine(); m18.machineId = 1818; m18.machineType = "Vulcanizer"; m18.capacity = 5000; m18.manufacturer = "McNeil"; m18.cost = 38.0;
        f18.machine = m18; f18.getFactoryDetails();

        Factory f19 = new Factory();
        f19.factoryId = 19; f19.factoryName = "Dixon Technologies"; f19.location = "Noida"; f19.industry = "Electronics Manufacturing";
        Machine m19 = new Machine(); m19.machineId = 1919; m19.machineType = "Pick Place Machine"; m19.capacity = 75000; m19.manufacturer = "Fuji"; m19.cost = 25.0;
        f19.machine = m19; f19.getFactoryDetails();

        Factory f20 = new Factory();
        f20.factoryId = 20; f20.factoryName = "Suzlon Pune"; f20.location = "Maharashtra"; f20.industry = "Wind Turbines";
        Machine m20 = new Machine(); m20.machineId = 2020; m20.machineType = "Blade Mould"; m20.capacity = 120; m20.manufacturer = "LM Wind Power"; m20.cost = 75.0;
        f20.machine = m20; f20.getFactoryDetails();
    }
}

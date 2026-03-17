class FactoryExecutor {
    public static void main(String[] args) {
        Machine m1 = new Machine(101, "Turbine", 500, "Siemens", 45.0);
        Factory f1 = new Factory(1, "BHEL Haridwar", "Uttarakhand", "Power Equipment", m1);
        f1.getFactoryDetails();

        Machine m2 = new Machine(202, "Blast Furnace", 10000, "Danieli", 120.0);
        Factory f2 = new Factory(2, "Tata Steel Jamshedpur", "Jharkhand", "Steel", m2);
        f2.getFactoryDetails();

        Machine m3 = new Machine(303, "Assembly Line", 2000, "ABB", 85.0);
        Factory f3 = new Factory(3, "Maruti Suzuki Manesar", "Haryana", "Automobile", m3);
        f3.getFactoryDetails();

        Machine m4 = new Machine(404, "Catalytic Cracker", 1500000, "ExxonMobil", 250.0);
        Factory f4 = new Factory(4, "Reliance Jamnagar", "Gujarat", "Refinery", m4);
        f4.getFactoryDetails();

        Machine m5 = new Machine(505, "SMT Machine", 50000, "Yamaha", 12.5);
        Factory f5 = new Factory(5, "Foxconn Chennai", "Tamil Nadu", "Electronics", m5);
        f5.getFactoryDetails();

        Machine m6 = new Machine(606, "CNC Machine", 800, "DMG Mori", 18.0);
        Factory f6 = new Factory(6, "Bajaj Auto Pune", "Maharashtra", "Two Wheeler", m6);
        f6.getFactoryDetails();

        Machine m7 = new Machine(707, "Welding Robot", 1200, "KUKA", 22.0);
        Factory f7 = new Factory(7, "Hero MotoCorp Dharuhera", "Haryana", "Motorcycle", m7);
        f7.getFactoryDetails();

        Machine m8 = new Machine(808, "Injection Molding", 30000, "Arburg", 15.0);
        Factory f8 = new Factory(8, "Samsung Noida", "Uttar Pradesh", "Consumer Electronics", m8);
        f8.getFactoryDetails();

        Machine m9 = new Machine(909, "Heavy Lathe", 50, "WaldrichSiegen", 35.0);
        Factory f9 = new Factory(9, "L&T Hazira", "Gujarat", "Heavy Engineering", m9);
        f9.getFactoryDetails();

        Machine m10 = new Machine(1010, "Die Casting", 4000, "Idra", 28.0);
        Factory f10 = new Factory(10, "TVS Hosur", "Tamil Nadu", "Auto Components", m10);
        f10.getFactoryDetails();

        Machine m11 = new Machine(111, "Smelter", 600000, "Outotec", 180.0);
        Factory f11 = new Factory(11, "Hindalco Renukoot", "Uttar Pradesh", "Aluminium", m11);
        f11.getFactoryDetails();

        Machine m12 = new Machine(1212, "Rolling Mill", 18000, "SMS Siemag", 95.0);
        Factory f12 = new Factory(12, "JSW Steel Vijayanagar", "Karnataka", "Steel", m12);
        f12.getFactoryDetails();

        Machine m13 = new Machine(1313, "Press Line", 1500, "Schuler", 65.0);
        Factory f13 = new Factory(13, "Hyundai Chennai", "Tamil Nadu", "Automobile", m13);
        f13.getFactoryDetails();

        Machine m14 = new Machine(1414, "Electrolytic Refinery", 400000, "Outotec", 110.0);
        Factory f14 = new Factory(14, "Vedanta Sterlite", "Tamil Nadu", "Copper", m14);
        f14.getFactoryDetails();

        Machine m15 = new Machine(1515, "Assembly Robot", 25000, "Fanuc", 20.0);
        Factory f15 = new Factory(15, "Godrej Appliances", "Maharashtra", "Consumer Durables", m15);
        f15.getFactoryDetails();

        Machine m16 = new Machine(1616, "Boiler Drum", 1000, "BHEL", 55.0);
        Factory f16 = new Factory(16, "Thermax Pune", "Maharashtra", "Boilers", m16);
        f16.getFactoryDetails();

        Machine m17 = new Machine(1717, "Spinning Machine", 80000, "Rieter", 42.0);
        Factory f17 = new Factory(17, "Grasim Nagda", "Madhya Pradesh", "Viscose Staple", m17);
        f17.getFactoryDetails();

        Machine m18 = new Machine(1818, "Vulcanizer", 5000, "McNeil", 38.0);
        Factory f18 = new Factory(18, "Apollo Tyres", "Kerala", "Tyres", m18);
        f18.getFactoryDetails();

        Machine m19 = new Machine(1919, "Pick Place Machine", 75000, "Fuji", 25.0);
        Factory f19 = new Factory(19, "Dixon Technologies", "Noida", "Electronics Manufacturing", m19);
        f19.getFactoryDetails();

        Machine m20 = new Machine(2020, "Blade Mould", 120, "LM Wind Power", 75.0);
        Factory f20 = new Factory(20, "Suzlon Pune", "Maharashtra", "Wind Turbines", m20);
        f20.getFactoryDetails();
    }
}

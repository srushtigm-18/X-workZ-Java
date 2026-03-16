class UniverseExecutor {
    public static void main(String[] args) {
        Universe u1 = new Universe();
        u1.structureId = 1; u1.structureName = "Observable Universe"; u1.scale = "93 billion ly"; u1.contains = "2 trillion galaxies";
        Earth e1 = new Earth(); e1.planetId = 101; e1.position = "3rd from Sun"; e1.diameterKM = 12742; e1.atmosphere = "Nitrogen 78%"; e1.ageBillions = 4.54;
        u1.earth = e1; u1.getUniverseDetails();

        Universe u2 = new Universe();
        u2.structureId = 2; u2.structureName = "Laniakea Supercluster"; u2.scale = = "520 million ly"; u2.contains = "100,000 galaxies";
        Earth e2 = new Earth(); e2.planetId = 102; e2.position = "Orion Arm"; e2.diameterKM = 12742; e2.atmosphere = "Oxygen 21%"; e2.ageBillions = 4.54;
        u2.earth = e2; u2.getUniverseDetails();

        Universe u3 = new Universe();
        u3.structureId = 3; u3.structureName = "Virgo Supercluster"; u3.scale = "110 million ly"; u3.contains = "100 galaxy groups";
        Earth e3 = new Earth(); e3.planetId = 103; e3.position = "Local Group"; e3.diameterKM = 12742; e3.atmosphere = "78% N2, 21% O2"; e3.ageBillions = 4.54;
        u3.earth = e3; u3.getUniverseDetails();

        Universe u4 = new Universe();
        u4.structureId = 4; u4.structureName = "Local Group"; u4.scale = "10 million ly"; u4.contains = "54 galaxies";
        Earth e4 = new Earth(); e4.planetId = 104; e4.position = "Milky Way galaxy"; e4.diameterKM = 12742; e4.atmosphere = "1 bar pressure"; e4.ageBillions = 4.54;
        u4.earth = e4; u4.getUniverseDetails();

        Universe u5 = new Universe();
        u5.structureId = 5; u5.structureName = "Milky Way Galaxy"; u5.scale = "100,000 ly"; u5.contains = "400 billion stars";
        Earth e5 = new Earth(); e5.planetId = 105; e5.position = "Solar System"; e5.diameterKM = 12742; e5.atmosphere = "365.25 day orbit"; e5.ageBillions = 4.54;
        u5.earth = e5; u5.getUniverseDetails();

        Universe u6 = new Universe();
        u6.structureId = 6; u6.structureName = "Orion Arm"; u6.scale = "3,500 ly"; u6.contains = "Milky Way spur";
        Earth e6 = new Earth(); e6.planetId = 106; e6.position = "8 kpc from center"; e6.diameterKM = 12742; e6.atmosphere = "Troposphere 0-12km"; e6.ageBillions = 4.54;
        u6.earth = e6; u6.getUniverseDetails();

        Universe u7 = new Universe();
        u7.structureId = 7; u7.structureName = "Solar System"; u7.scale = "2 ly"; u7.contains = "8 planets";
        Earth e7 = new Earth(); e7.planetId = 107; e7.position = "149.6M km from Sun"; e7.diameterKM = 12742; e7.atmosphere = "Stratosphere 12-50km"; e7.ageBillions = 4.54;
        u7.earth = e7; u7.getUniverseDetails();

        Universe u8 = new Universe();
        u8.structureId = 8; u8.structureName = "Heliosphere"; u8.scale = "120 AU"; u8.contains = "Solar wind boundary";
        Earth e8 = new Earth(); e8.planetId = 108; e8.position = "1 AU"; e8.diameterKM = 12742; e8.atmosphere = "Mesosphere 50-85km"; e8.ageBillions = 4.54;
        u8.earth = e8; u8.getUniverseDetails();

        Universe u9 = new Universe();
        u9.structureId = 9; u9.structureName = "Earth-Moon System"; u9.scale = "384,000 km"; u9.contains = "1 moon";
        Earth e9 = new Earth(); e9.planetId = 109; e9.position = "Terrestrial planet"; e9.diameterKM = 12742; e9.atmosphere = "Thermosphere 85-600km"; e9.ageBillions = 4.54;
        u9.earth = e9; u9.getUniverseDetails();

        Universe u10 = new Universe();
        u10.structureId = 10; u10.structureName = "Earth Biosphere"; u10.scale = "20 km"; u10.contains = "All life";
        Earth e10 = new Earth(); e10.planetId = 110; e10.position = "Habitable zone"; e10.diameterKM = 12742; e10.atmosphere = "Exosphere >600km"; e10.ageBillions = 4.54;
        u10.earth = e10; u10.getUniverseDetails();

        Universe u11 = new Universe();
        u11.structureId = 11; u11.structureName = "Galactic Habitable Zone"; u11.scale = "26,000 ly"; u11.contains = "Stable stars";
        Earth e11 = new Earth(); e11.planetId = 111; e11.position = "Goldilocks zone"; e11.diameterKM = 12756; e11.atmosphere = "Magnetosphere"; e11.ageBillions = 4.54;
        u11.earth = e11; u11.getUniverseDetails();

        Universe u12 = new Universe();
        u12.structureId = 12; u12.structureName = "Oort Cloud"; u12.scale = "200,000 AU"; u12.contains = "Comets";
        Earth e12 = new Earth(); e12.planetId = 112; e12.position = "Ecliptic plane"; e12.diameterKM = 12742; e12.atmosphere = "Ionosphere"; e12.ageBillions = 4.54;
        u12.earth = e12; u12.getUniverseDetails();

        Universe u13 = new Universe();
        u13.structureId = 13; u13.structureName = "Kuiper Belt"; u13.scale = "50 AU"; u13.contains = "Icy bodies";
        Earth e13 = new Earth(); e13.planetId = 113; e13.position = "23.5° axial tilt"; e13.diameterKM = 12742; e13.atmosphere = "Ozone layer"; e13.ageBillions = 4.54;
        u13.earth = e13; u13.getUniverseDetails();

        Universe u14 = new Universe();
        u14.structureId = 14; u14.structureName = "Asteroid Belt"; u14.scale = "2.7 AU"; u14.contains = "Rocky asteroids";
        Earth e14 = new Earth(); e14.planetId = 114; e14.position = "Circumpolar regions"; e14.diameterKM = 12742; e14.atmosphere = "Jet streams"; e14.ageBillions = 4.54;
        u14.earth = e14; u14.getUniverseDetails();

        Universe u15 = new Universe();
        u15.structureId = 15; u15.structureName = "Inner Solar System"; u15.scale = "2 AU"; u15.contains = "Rocky planets";
        Earth e15 = new Earth(); e15.planetId = 115; e15.position = "Tropic zones"; e15.diameterKM = 12742; e15.atmosphere = "Hadley cells"; e15.ageBillions = 4.54;
        u15.earth = e15; u15.getUniverseDetails();

        Universe u16 = new Universe();
        u16.structureId = 16; u16.structureName = "Earth's Hydrosphere"; u16.scale = "11 km"; u16.contains = "71% water";
        Earth e16 = new Earth(); e16.planetId = 116; e16.position = "Polar regions"; e16.diameterKM = 12742; e16.atmosphere = "Aurora zones"; e16.ageBillions = 4.54;
        u16.earth = e16; u16.getUniverseDetails();

        Universe u17 = new Universe();
        u17.structureId = 17; u17.structureName = "Earth's Lithosphere"; u17.scale = "100 km"; u17.contains = "7 continents";
        Earth e17 = new Earth(); e17.planetId = 117; e17.position = "Plate boundaries"; e17.diameterKM = 12742; e17.atmosphere = "Trade winds"; e17.ageBillions = 4.54;
        u17.earth = e17; u17.getUniverseDetails();

        Universe u18 = new Universe();
        u18.structureId = 18; u18.structureName = "Cosmic Web"; u18.scale = "Billions ly"; u18.contains = "Filaments";
        Earth e18 = new Earth(); e18.planetId = 118; e18.position = "Void regions"; e18.diameterKM = 12742; e18.atmosphere = "Rossby waves"; e18.ageBillions = 4.54;
        u18.earth = e18; u18.getUniverseDetails();

        Universe u19 = new Universe();
        u19.structureId = 19; u19.structureName = "Great Attractor"; u19.scale = "250 Mly"; u19.contains = "Mass concentration";
        Earth e19 = new Earth(); e19.planetId = 119; e19.position = "Galactic plane"; e19.diameterKM = 12742; e19.atmosphere = "Walker circulation"; e19.ageBillions = 4.54;
        u19.earth = e19; u19.getUniverseDetails();

        Universe u20 = new Universe();
        u20.structureId = 20; u20.structureName = "Celestial Sphere"; u20.scale = "Infinite"; u20.contains = "All directions";
        Earth e20 = new Earth(); e20.planetId = 120; e20.position = "Pale blue dot"; e20.diameterKM = 12742; e20.atmosphere = "Living planet"; e20.ageBillions = 4.54;
        u20.earth = e20; u20.getUniverseDetails();
    }
}

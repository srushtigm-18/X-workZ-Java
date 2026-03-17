class UniverseExecutor {
    public static void main(String[] args) {
        Earth e1 = new Earth(101, "3rd from Sun", 12742, "Nitrogen 78%", 4.54);
        Universe u1 = new Universe(1, "Observable Universe", "93 billion ly", "2 trillion galaxies", e1);
        u1.getUniverseDetails();

        Earth e2 = new Earth(102, "Orion Arm", 12742, "Oxygen 21%", 4.54);
        Universe u2 = new Universe(2, "Laniakea Supercluster", "520 million ly", "100,000 galaxies", e2);
        u2.getUniverseDetails();

        Earth e3 = new Earth(103, "Local Group", 12742, "78% N2, 21% O2", 4.54);
        Universe u3 = new Universe(3, "Virgo Supercluster", "110 million ly", "100 galaxy groups", e3);
        u3.getUniverseDetails();

        Earth e4 = new Earth(104, "Milky Way galaxy", 12742, "1 bar pressure", 4.54);
        Universe u4 = new Universe(4, "Local Group", "10 million ly", "54 galaxies", e4);
        u4.getUniverseDetails();

        Earth e5 = new Earth(105, "Solar System", 12742, "365.25 day orbit", 4.54);
        Universe u5 = new Universe(5, "Milky Way Galaxy", "100,000 ly", "400 billion stars", e5);
        u5.getUniverseDetails();

        Earth e6 = new Earth(106, "8 kpc from center", 12742, "Troposphere 0-12km", 4.54);
        Universe u6 = new Universe(6, "Orion Arm", "3,500 ly", "Milky Way spur", e6);
        u6.getUniverseDetails();

        Earth e7 = new Earth(107, "149.6M km from Sun", 12742, "Stratosphere 12-50km", 4.54);
        Universe u7 = new Universe(7, "Solar System", "2 ly", "8 planets", e7);
        u7.getUniverseDetails();

        Earth e8 = new Earth(108, "1 AU", 12742, "Mesosphere 50-85km", 4.54);
        Universe u8 = new Universe(8, "Heliosphere", "120 AU", "Solar wind boundary", e8);
        u8.getUniverseDetails();

        Earth e9 = new Earth(109, "Terrestrial planet", 12742, "Thermosphere 85-600km", 4.54);
        Universe u9 = new Universe(9, "Earth-Moon System", "384,000 km", "1 moon", e9);
        u9.getUniverseDetails();

        Earth e10 = new Earth(110, "Habitable zone", 12742, "Exosphere >600km", 4.54);
        Universe u10 = new Universe(10, "Earth Biosphere", "20 km", "All life", e10);
        u10.getUniverseDetails();

        Earth e11 = new Earth(111, "Goldilocks zone", 12756, "Magnetosphere", 4.54);
        Universe u11 = new Universe(11, "Galactic Habitable Zone", "26,000 ly", "Stable stars", e11);
        u11.getUniverseDetails();

        Earth e12 = new Earth(112, "Ecliptic plane", 12742, "Ionosphere", 4.54);
        Universe u12 = new Universe(12, "Oort Cloud", "200,000 AU", "Comets", e12);
        u12.getUniverseDetails();

        Earth e13 = new Earth(113, "23.5° axial tilt", 12742, "Ozone layer", 4.54);
        Universe u13 = new Universe(13, "Kuiper Belt", "50 AU", "Icy bodies", e13);
        u13.getUniverseDetails();

        Earth e14 = new Earth(114, "Circumpolar regions", 12742, "Jet streams", 4.54);
        Universe u14 = new Universe(14, "Asteroid Belt", "2.7 AU", "Rocky asteroids", e14);
        u14.getUniverseDetails();

        Earth e15 = new Earth(115, "Tropic zones", 12742, "Hadley cells", 4.54);
        Universe u15 = new Universe(15, "Inner Solar System", "2 AU", "Rocky planets", e15);
        u15.getUniverseDetails();

        Earth e16 = new Earth(116, "Polar regions", 12742, "Aurora zones", 4.54);
        Universe u16 = new Universe(16, "Earth's Hydrosphere", "11 km", "71% water", e16);
        u16.getUniverseDetails();

        Earth e17 = new Earth(117, "Plate boundaries", 12742, "Trade winds", 4.54);
        Universe u17 = new Universe(17, "Earth's Lithosphere", "100 km", "7 continents", e17);
        u17.getUniverseDetails();

        Earth e18 = new Earth(118, "Void regions", 12742, "Rossby waves", 4.54);
        Universe u18 = new Universe(18, "Cosmic Web", "Billions ly", "Filaments", e18);
        u18.getUniverseDetails();

        Earth e19 = new Earth(119, "Galactic plane", 12742, "Walker circulation", 4.54);
        Universe u19 = new Universe(19, "Great Attractor", "250 Mly", "Mass concentration", e19);
        u19.getUniverseDetails();

        Earth e20 = new Earth(120, "Pale blue dot", 12742, "Living planet", 4.54);
        Universe u20 = new Universe(20, "Celestial Sphere", "Infinite", "All directions", e20);
        u20.getUniverseDetails();
    }
}

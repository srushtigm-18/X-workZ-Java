class UniverseExecutor {
    public static void main(String[] args) {
        Universe uni = new Universe();

        uni.addGalaxy("Milky Way");
        uni.addGalaxy("Andromeda");
        uni.addGalaxy("Triangulum");
        uni.addGalaxy("Pinwheel Galaxy");
        uni.addGalaxy("Whirlpool Galaxy");
        uni.addGalaxy("Sombrero Galaxy");
        uni.addGalaxy("Centaurus A");
        uni.addGalaxy("Large Magellanic Cloud");
        uni.addGalaxy("Small Magellanic Cloud");
        uni.addGalaxy("Messier 87");
        uni.addGalaxy("Cigar Galaxy");
        uni.addGalaxy("Eye of Sauron Galaxy");
        uni.addGalaxy("Cartwheel Galaxy");
        uni.addGalaxy("Tadpole Galaxy");
        uni.addGalaxy("Comet Galaxy");
        uni.addGalaxy("Barnard's Galaxy");
        uni.addGalaxy("UGC 4881");

        uni.getGalaxies();
        System.out.println();

        int index = 5;
        String galaxy = uni.getGalaxyByIndex(index);
        System.out.println("Galaxy at index " + index + " is: " + galaxy);
        System.out.println();

        String galaxyName = "Andromeda";
        int idx = uni.getIndexByGalaxy(galaxyName);
        if (idx != -1) {
            System.out.println("Index for galaxy " + galaxyName + " is: " + idx);
        } else {
            System.out.println("Galaxy '" + galaxyName + "' not found.");
        }
        System.out.println();

        String updated = "Andromeda Galaxy ";
        boolean ref = uni.updateGalaxy("Andromeda", updated);
        if (ref) {
            System.out.println("Galaxy updated to: " + updated);
        }
        uni.getGalaxies();
        System.out.println();

        String deleting = "Comet Galaxy";
        boolean reff = uni.deleteGalaxy(deleting);
        if (reff) {
            System.out.println("Galaxy " + deleting + " is deleted.");
        }
        uni.getGalaxies();
    }
}
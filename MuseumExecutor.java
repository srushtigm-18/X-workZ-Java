class MuseumExecutor {
    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.addMonument("Taj Mahal");
        museum.addMonument("Red Fort");
        museum.addMonument("Qutub Minar");
        museum.addMonument("Hampi Ruins");
        museum.addMonument("Ajanta Caves");
        museum.addMonument("Ellora Caves");
        museum.addMonument("Khajuraho Temples");
        museum.addMonument("Konark Sun Temple");
        museum.addMonument("Mysore Palace");
        museum.addMonument("Hawa Mahal");
        museum.addMonument("Amer Fort");
        museum.addMonument("Charminar");
        museum.addMonument("Victoria Memorial");
        museum.addMonument("Gateway of India");
        museum.addMonument("Brihadeeswarar Temple");
        museum.addMonument("Rani ki Vav");

        museum.getMonuments();
        System.out.println();

        int index = 8;
        String monument = museum.getMonumentNameByIndex(index);
        System.out.println("The monument at index " + index + " is: " + monument);
        System.out.println();

        String monumentName = "Ellora Caves";
        int i = museum.getIndexByMonumentName(monumentName);
        System.out.println("Monument '" + monumentName + "' is at index: " + i);
        System.out.println();

        String updated = "Ellora Caves (UNESCO Heritage)";
        boolean ref = museum.updateMonument("Ellora Caves", updated);
        museum.getMonuments();
        System.out.println();

        String deleting = "Hawa Mahal";
        boolean reff = museum.deleteMonument(deleting);
        museum.getMonuments();
    }
}
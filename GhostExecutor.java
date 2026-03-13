class GhostExecutor {
    public static void main(String[] args) {
        Ghost ghost1 = new Ghost("Poltergeist", "Old Mansion", "Transparent", "Throws Objects");
        
        Ghost ghost2 = new Ghost(false, true, true, false);
        
        Ghost ghost3 = new Ghost(150, 8, 25, 9);
        
        System.out.println("Ghost Type: " + ghost1.type);
        System.out.println("Ghost Friendly: " + ghost2.friendly);
        System.out.println("Ghost Age: " + ghost3.age);
        System.out.println("Ghost HauntLocation: " + ghost1.hauntLocation);
        System.out.println("Ghost Visible: " + ghost2.visible);
        System.out.println("Ghost Strength: " + ghost3.strength);
        System.out.println("Ghost Appearance: " + ghost1.appearance);
        System.out.println("Ghost MakesNoise: " + ghost2.makesNoise);
        System.out.println("Ghost Sightings: " + ghost3.sightings);
        System.out.println("Ghost Behavior: " + ghost1.behavior);
        System.out.println("Ghost Possesses: " + ghost2.possesses);
        System.out.println("Ghost ScareFactor: " + ghost3.scareFactor);
        System.out.println("");
    }
}

class TigersExecutor {
    public static void main(String[] args) {
        Tigers tigers1 = new Tigers("Bengal", "Sundarbans", "Orange", "Deer");
        
        Tigers tigers2 = new Tigers(8, 220, 65);
        
        Tigers tigers3 = new Tigers(true, true);
        
        Tigers tigers4 = new Tigers(3.0, 1.1, 112.0);
        
        System.out.println("Tigers Species: " + tigers1.species);
        System.out.println("Tigers Habitat: " + tigers1.habitat);
        System.out.println("Tigers Age: " + tigers2.age);
        System.out.println("Tigers Color: " + tigers1.color);
        System.out.println("Tigers Weight: " + tigers2.weight);
        System.out.println("Tigers Diet: " + tigers1.diet);
        System.out.println("Tigers Speed: " + tigers2.speed);
        System.out.println("Tigers Length: " + tigers4.length);
        System.out.println("Tigers Height: " + tigers4.height);
        System.out.println("Tigers Endangered: " + tigers3.endangered);
        System.out.println("Tigers RoarVolume: " + tigers4.roarVolume);
        System.out.println("Tigers Nocturnal: " + tigers3.nocturnal);
        System.out.println("");
    }
}
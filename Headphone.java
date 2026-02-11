class Headphone {
    static boolean chargeLevel;
    
    static boolean audioStatus() {
        if (chargeLevel == false) {
            chargeLevel = true;
            System.out.println("The headphone is on:");
        }
        else if (chargeLevel == true) {
            chargeLevel = false;
            System.out.println("The headphone is Off:");
        }
        return chargeLevel;
    }
}
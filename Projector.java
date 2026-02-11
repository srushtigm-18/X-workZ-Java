class Projector {
    static boolean projectorStatus;
    
    static boolean projectorPower() {
        if (projectorStatus == false) {
            projectorStatus = true;
            System.out.println("The projector is on:");
        }
        else if (projectorStatus == true) {
            projectorStatus = false;
            System.out.println("The projector is Off:");
        }
        return projectorStatus;
    }
}
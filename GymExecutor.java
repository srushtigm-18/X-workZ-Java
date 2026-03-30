class GymExecutor {
    public static void main(String[] args) {
        Gym gym = new Gym();

        gym.addEquipment("Treadmill");
        gym.addEquipment("Exercise Bike");
        gym.addEquipment("Elliptical Trainer");
        gym.addEquipment("Chest Press Machine");
        gym.addEquipment("Leg Press Machine");
        gym.addEquipment("Lat Pulldown Machine");
        gym.addEquipment("Leg Extension Machine");
        gym.addEquipment("Leg Curl Machine");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Squat Rack");
        gym.addEquipment("Dumbbells Set");
        gym.addEquipment("Barbell Set");
        gym.addEquipment("Resistance Bands");
        gym.addEquipment("Yoga Mat");
        gym.addEquipment("Foam Roller");
        gym.addEquipment("Jump Rope");

        gym.getEquipment();
        System.out.println();

        int index = 6;
        String eqp = gym.getEquipmentNameByIndex(index);
        System.out.println("The equipment at index " + index + " is: " + eqp);
        System.out.println();

        String eqpName = "Barbell Set";
        int i = gym.getIndexByEquipmentName(eqpName);
        System.out.println("Equipment '" + eqpName + "' is at index: " + i);
        System.out.println();

        String updated = "Barbell Set (Olympic)";
        boolean ref = gym.updateEquipment("Barbell Set", updated);
        gym.getEquipment();
        System.out.println();

        String deleting = "Foam Roller";
        boolean reff = gym.deleteEquipment(deleting);
        gym.getEquipment();
    }
}
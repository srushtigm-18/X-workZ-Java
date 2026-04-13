class MortuaryObjRunner {

public static void main(String[] bodies) {
        System.out.println("main started");
		
        DeadBody deadBody = new DeadBody();
        Mortuary mortuary = new Mortuary(1, deadBody);
        deadBody.bodyId = 3414;
        deadBody.name = "Ramesh K";
        deadBody.gender = "Male";
        deadBody.causeOfDeath = "Cardiac Arrest";
        deadBody.tagNumber = "MB-001";
        mortuary.getDetails();
		
        System.out.println("Main ended");
    }
}
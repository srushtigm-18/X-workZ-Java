class MortuaryMethodRunner {
 
public static void main(String[] a) {
DeadBody deadBody = new DeadBody();

deadBody.bodyId = 32455;
deadBody.name = "Suresh";
deadBody.gender = "Male";
deadBody.causeOfDeath = "Road Accident";
deadBody.tagNumber = "MB-002";

Mortuary mortuary = new Mortuary(2, deadBody);
mortuary.getDetails();
}
}
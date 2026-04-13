class MortuaryConstRunner {

public static void main(String[] body) {

DeadBody deadBody = new DeadBody();
deadBody.bodyId = 545;
deadBody.name = "Unknown";
deadBody.gender = "Female";
deadBody.causeOfDeath = "Pending Postmortem";
deadBody.tagNumber = "MB-003";

Mortuary mortuary = new Mortuary(3, deadBody);
mortuary.getDetails();
}
}
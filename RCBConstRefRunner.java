class RCBConstRefRunner {

public static void main(String[] rbc) {

System.out.println("main started");

RCB rcb = new RCB();

rcb.setTeamId(222458);
rcb.setCaptain("Rajat Patidar");
rcb.setCoach("Andy Flower");

Ipl ipl = new Ipl(3, rcb);

ipl.getDetails();

System.out.println("Main ended");
}
}
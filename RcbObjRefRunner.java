class RcbObjRefRunner {

public static void main(String[] team) {

System.out.println("main started");

RCB rcb = new RCB();
Ipl ipl = new Ipl(1, rcb);
rcb.setTeamId(335970);
rcb.setCaptain("Rajat Patidar");
rcb.setCoach("Andy Flower");

ipl.getDetails();

System.out.println("Main ended");

}
}
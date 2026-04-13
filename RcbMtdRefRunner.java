class RcbMtdRefRunner {
public static void main(String[] team) {

System.out.println("main started");

RCB rcb = new RCB();
rcb.setTeamId(5689422);
rcb.setCaptain("Rajat Patidar");
rcb.setCoach("Dinesh Karthik");

Ipl ipl = new Ipl(2, rcb);

ipl.getDetails();

System.out.println("Main ended");
}
}
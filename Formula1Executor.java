class Formula1Executor {
    public static void main(String[] args) {
        Franchise f1 = new Franchise(1, "Exor NV", 3.9, 16, true);
        Formula1 team1 = new Formula1(1, "Ferrari", "Maranello", "Ferrari", f1);
        team1.getTeamDetails();

        Franchise f2 = new Franchise(2, "Mercedes-Benz", 3.8, 8, true);
        Formula1 team2 = new Formula1(2, "Mercedes", "Brackley", "Mercedes", f2);
        team2.getTeamDetails();

        Franchise f3 = new Franchise(3, "Mumtalakat", 2.5, 8, true);
        Formula1 team3 = new Formula1(3, "McLaren", "Woking", "Mercedes", f3);
        team3.getTeamDetails();

        Franchise f4 = new Franchise(4, "Red Bull GmbH", 3.0, 6, true);
        Formula1 team4 = new Formula1(4, "Red Bull", "Milton Keynes", "Honda RBPT", f4);
        team4.getTeamDetails();

        Franchise f5 = new Franchise(5, "Lawrence Stroll", 1.6, 0, true);
        Formula1 team5 = new Formula1(5, "Aston Martin", "Silverstone", "Mercedes", f5);
        team5.getTeamDetails();

        Franchise f6 = new Franchise(6, "Renault Group", 1.4, 0, true);
        Formula1 team6 = new Formula1(6, "Alpine", "Enstone", "Renault", f6);
        team6.getTeamDetails();

        Franchise f7 = new Franchise(7, "Dorilton Capital", 1.2, 9, true);
        Formula1 team7 = new Formula1(7, "Williams", "Grove", "Mercedes", f7);
        team7.getTeamDetails();

        Franchise f8 = new Franchise(8, "Gene Haas", 0.8, 0, true);
        Formula1 team8 = new Formula1(8, "Haas", "Kannapolis", "Ferrari", f8);
        team8.getTeamDetails();

        Franchise f9 = new Franchise(9, "Red Bull Powertrains", 1.1, 0, true);
        Formula1 team9 = new Formula1(9, "RB", "Faenza", "Honda RBPT", f9);
        team9.getTeamDetails();

        Franchise f10 = new Franchise(10, "Volkswagen Group", 2.2, 0, true);
        Formula1 team10 = new Formula1(10, "Audi Factory", "Neuburg", "Audi", f10);
        team10.getTeamDetails();

        Franchise f11 = new Franchise(11, "Exor NV", 2.1, 0, true);
        Formula1 team11 = new Formula1(11, "Ferrari Reserve", "Maranello", "Ferrari", f11);
        team11.getTeamDetails();

        Franchise f12 = new Franchise(12, "INEOS", 1.9, 0, true);
        Formula1 team12 = new Formula1(12, "Mercedes Reserve", "Brackley", "Mercedes", f12);
        team12.getTeamDetails();

        Franchise f13 = new Franchise(13, "MSP Sports", 1.7, 0, true);
        Formula1 team13 = new Formula1(13, "McLaren B", "Woking", "Mercedes", f13);
        team13.getTeamDetails();

        Franchise f14 = new Franchise(14, "Red Bull GmbH", 1.5, 0, true);
        Formula1 team14 = new Formula1(14, "Red Bull B", "Milton Keynes", "Honda", f14);
        team14.getTeamDetails();

        Franchise f15 = new Franchise(15, "Lawrence Stroll", 1.3, 0, true);
        Formula1 team15 = new Formula1(15, "Aston Reserve", "Silverstone", "Mercedes", f15);
        team15.getTeamDetails();

        Franchise f16 = new Franchise(16, "Renault Group", 1.2, 0, true);
        Formula1 team16 = new Formula1(16, "Alpine B", "Enstone", "Renault", f16);
        team16.getTeamDetails();

        Franchise f17 = new Franchise(17, "Dorilton Capital", 1.0, 0, true);
        Formula1 team17 = new Formula1(17, "Williams B", "Grove", "Mercedes", f17);
        team17.getTeamDetails();

        Franchise f18 = new Franchise(18, "Gene Haas", 0.9, 0, true);
        Formula1 team18 = new Formula1(18, "Haas Reserve", "Kannapolis", "Ferrari", f18);
        team18.getTeamDetails();

        Franchise f19 = new Franchise(19, "Red Bull Powertrains", 1.1, 0, true);
        Formula1 team19 = new Formula1(19, "RB Reserve", "Faenza", "Honda", f19);
        team19.getTeamDetails();

        Franchise f20 = new Franchise(20, "General Motors", 1.8, 0, true);
        Formula1 team20 = new Formula1(20, "Cadillac F1", "Indianapolis", "Ferrari", f20);
        team20.getTeamDetails();
    }
}

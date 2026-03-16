class Formula1Executor {
    public static void main(String[] args) {
        Formula1 team1 = new Formula1();
        team1.teamId = 1; team1.teamName = "Ferrari"; team1.baseLocation = "Maranello"; team1.enginePartner = "Ferrari";
        Franchise f1 = new Franchise(); f1.franchiseId = 1; f1.owner = "Exor NV"; f1.valuation = 3.9; f1.championships = 16; f1.active = true;
        team1.franchise = f1; team1.getTeamDetails();

        Formula1 team2 = new Formula1();
        team2.teamId = 2; team2.teamName = "Mercedes"; team2.baseLocation = "Brackley"; team2.enginePartner = "Mercedes";
        Franchise f2 = new Franchise(); f2.franchiseId = 2; f2.owner = "Mercedes-Benz"; f2.valuation = 3.8; f2.championships = 8; f2.active = true;
        team2.franchise = f2; team2.getTeamDetails();

        Formula1 team3 = new Formula1();
        team3.teamId = 3; team3.teamName = "McLaren"; team3.baseLocation = "Woking"; team3.enginePartner = "Mercedes";
        Franchise f3 = new Franchise(); f3.franchiseId = 3; f3.owner = "Mumtalakat"; f3.valuation = 2.5; f3.championships = 8; f3.active = true;
        team3.franchise = f3; team3.getTeamDetails();

        Formula1 team4 = new Formula1();
        team4.teamId = 4; team4.teamName = "Red Bull"; team4.baseLocation = "Milton Keynes"; team4.enginePartner = "Honda RBPT";
        Franchise f4 = new Franchise(); f4.franchiseId = 4; f4.owner = "Red Bull GmbH"; f4.valuation = 3.0; f4.championships = 6; f4.active = true;
        team4.franchise = f4; team4.getTeamDetails();

        Formula1 team5 = new Formula1();
        team5.teamId = 5; team5.teamName = "Aston Martin"; team5.baseLocation = "Silverstone"; team5.enginePartner = "Mercedes";
        Franchise f5 = new Franchise(); f5.franchiseId = 5; f5.owner = "Lawrence Stroll"; f5.valuation = 1.6; f5.championships = 0; f5.active = true;
        team5.franchise = f5; team5.getTeamDetails();

        Formula1 team6 = new Formula1();
        team6.teamId = 6; team6.teamName = "Alpine"; team6.baseLocation = "Enstone"; team6.enginePartner = "Renault";
        Franchise f6 = new Franchise(); f6.franchiseId = 6; f6.owner = "Renault Group"; f6.valuation = 1.4; f6.championships = 0; f6.active = true;
        team6.franchise = f6; team6.getTeamDetails();

        Formula1 team7 = new Formula1();
        team7.teamId = 7; team7.teamName = "Williams"; team7.baseLocation = "Grove"; team7.enginePartner = "Mercedes";
        Franchise f7 = new Franchise(); f7.franchiseId = 7; f7.owner = "Dorilton Capital"; f7.valuation = 1.2; f7.championships = 9; f7.active = true;
        team7.franchise = f7; team7.getTeamDetails();

        Formula1 team8 = new Formula1();
        team8.teamId = 8; team8.teamName = "Haas"; team8.baseLocation = "Kannapolis"; team8.enginePartner = "Ferrari";
        Franchise f8 = new Franchise(); f8.franchiseId = 8; f8.owner = "Gene Haas"; f8.valuation = 0.8; f8.championships = 0; f8.active = true;
        team8.franchise = f8; team8.getTeamDetails();

        Formula1 team9 = new Formula1();
        team9.teamId = 9; team9.teamName = "RB"; team9.baseLocation = "Faenza"; team9.enginePartner = "Honda RBPT";
        Franchise f9 = new Franchise(); f9.franchiseId = 9; f9.owner = "Red Bull Powertrains"; f9.valuation = 1.1; f9.championships = 0; f9.active = true;
        team9.franchise = f9; team9.getTeamDetails();

        Formula1 team10 = new Formula1();
        team10.teamId = 10; team10.teamName = "Audi Factory"; team10.baseLocation = "Neuburg"; team10.enginePartner = "Audi";
        Franchise f10 = new Franchise(); f10.franchiseId = 10; f10.owner = "Volkswagen Group"; f10.valuation = 2.2; f10.championships = 0; f10.active = true;
        team10.franchise = f10; team10.getTeamDetails();

        Formula1 team11 = new Formula1();
        team11.teamId = 11; team11.teamName = "Ferrari Reserve"; team11.baseLocation = "Maranello"; team11.enginePartner = "Ferrari";
        Franchise f11 = new Franchise(); f11.franchiseId = 11; f11.owner = "Exor NV"; f11.valuation = 2.1; f11.championships = 0; f11.active = true;
        team11.franchise = f11; team11.getTeamDetails();

        Formula1 team12 = new Formula1();
        team12.teamId = 12; team12.teamName = "Mercedes Reserve"; team12.baseLocation = "Brackley"; team12.enginePartner = "Mercedes";
        Franchise f12 = new Franchise(); f12.franchiseId = 12; f12.owner = "INEOS"; f12.valuation = 1.9; f12.championships = 0; f12.active = true;
        team12.franchise = f12; team12.getTeamDetails();

        Formula1 team13 = new Formula1();
        team13.teamId = 13; team13.teamName = "McLaren B"; team13.baseLocation = "Woking"; team13.enginePartner = "Mercedes";
        Franchise f13 = new Franchise(); f13.franchiseId = 13; f13.owner = "MSP Sports"; f13.valuation = 1.7; f13.championships = 0; f13.active = true;
        team13.franchise = f13; team13.getTeamDetails();

        Formula1 team14 = new Formula1();
        team14.teamId = 14; team14.teamName = "Red Bull B"; team14.baseLocation = "Milton Keynes"; team14.enginePartner = "Honda";
        Franchise f14 = new Franchise(); f14.franchiseId = 14; f14.owner = "Red Bull GmbH"; f14.valuation = 1.5; f14.championships = 0; f14.active = true;
        team14.franchise = f14; team14.getTeamDetails();

        Formula1 team15 = new Formula1();
        team15.teamId = 15; team15.teamName = "Aston Reserve"; team15.baseLocation = "Silverstone"; team15.enginePartner = "Mercedes";
        Franchise f15 = new Franchise(); f15.franchiseId = 15; f15.owner = "Lawrence Stroll"; f15.valuation = 1.3; f15.championships = 0; f15.active = true;
        team15.franchise = f15; team15.getTeamDetails();

        Formula1 team16 = new Formula1();
        team16.teamId = 16; team16.teamName = "Alpine B"; team16.baseLocation = "Enstone"; team16.enginePartner = "Renault";
        Franchise f16 = new Franchise(); f16.franchiseId = 16; f16.owner = "Renault Group"; f16.valuation = 1.2; f16.championships = 0; f16.active = true;
        team16.franchise = f16; team16.getTeamDetails();

        Formula1 team17 = new Formula1();
        team17.teamId = 17; team17.teamName = "Williams B"; team17.baseLocation = "Grove"; team17.enginePartner = "Mercedes";
        Franchise f17 = new Franchise(); f17.franchiseId = 17; f17.owner = "Dorilton Capital"; f17.valuation = 1.0; f17.championships = 0; f17.active = true;
        team17.franchise = f17; team17.getTeamDetails();

        Formula1 team18 = new Formula1();
        team18.teamId = 18; team18.teamName = "Haas Reserve"; team18.baseLocation = "Kannapolis"; team18.enginePartner = "Ferrari";
        Franchise f18 = new Franchise(); f18.franchiseId = 18; f18.owner = "Gene Haas"; f18.valuation = 0.9; f18.championships = 0; f18.active = true;
        team18.franchise = f18; team18.getTeamDetails();

        Formula1 team19 = new Formula1();
        team19.teamId = 19; team19.teamName = "RB Reserve"; team19.baseLocation = "Faenza"; team19.enginePartner = "Honda";
        Franchise f19 = new Franchise(); f19.franchiseId = 19; f19.owner = "Red Bull Powertrains"; f19.valuation = 1.1; f19.championships = 0; f19.active = true;
        team19.franchise = f19; team19.getTeamDetails();

        Formula1 team20 = new Formula1();
        team20.teamId = 20; team20.teamName = "Cadillac F1"; team20.baseLocation = "Indianapolis"; team20.enginePartner = "Ferrari";
        Franchise f20 = new Franchise(); f20.franchiseId = 20; f20.owner = "General Motors"; f20.valuation = 1.8; f20.championships = 0; f20.active = true;
        team20.franchise = f20; team20.getTeamDetails();
    }
}

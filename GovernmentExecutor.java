class GovernmentExecutor {
    public static void main(String[] args) {
        Government g1 = new Government();
        g1.policyId = 1; g1.stateName = "Karnataka"; g1.cmName = "Siddaramaiah"; g1.dept = "Tourism";
        Policy p1 = new Policy();
		p1.polId = 101; p1.name = "Coastal Tourism Plan"; p1.focus = "Karavali Development"; p1.budget = "1260 Cr"; p1.duration = "2026-2030";
        g1.policy = p1;
		g1.getGovDetails();

        Government g2 = new Government();
        g2.policyId = 2; g2.stateName = "Karnataka"; g2.cmName = "Siddaramaiah"; g2.dept = "Tourism";
        Policy p2 = new Policy();
		p2.polId = 102; p2.name = "Anjanadri Hill Dev"; p2.focus = "Hampi Tourism"; p2.budget = "100 Cr"; p2.duration = "2026-28";
        g2.policy = p2;
		g2.getGovDetails();

        Government g3 = new Government();
        g3.policyId = 3; g3.stateName = "Karnataka"; g3.cmName = "Siddaramaiah"; g3.dept = "Tourism";
        Policy p3 = new Policy(); 
		p3.polId = 103; p3.name = "Smaraka Mitras"; p3.focus = "Heritage Guides"; p3.budget = "50 Cr"; p3.duration = "2026-30";
        g3.policy = p3; 
		g3.getGovDetails();

        Government g4 = new Government();
        g4.policyId = 4; g4.stateName = "Karnataka"; g4.cmName = "Siddaramaiah"; g4.dept = "Finance";
        Policy p4 = new Policy(); 
		p4.polId = 104; p4.name = "Budget 2026-27"; p4.focus = "Economic Growth"; p4.budget = "350000 Cr"; p4.duration = "2026-27";
        g4.policy = p4; 
		g4.getGovDetails();

        Government g5 = new Government();
        g5.policyId = 5; g5.stateName = "Karnataka"; g5.cmName = "Siddaramaiah"; g5.dept = "IT-BT";
        Policy p5 = new Policy(); 
		p5.polId = 105; p5.name = "AI Policy 2026"; p5.focus = "Tech Innovation"; p5.budget = "5000 Cr"; p5.duration = "2026-31";
        g5.policy = p5; 
		g5.getGovDetails();

        Government g6 = new Government();
        g6.policyId = 6; g6.stateName = "Karnataka"; g6.cmName = "Siddaramaiah"; g6.dept = "Tourism";
        Policy p6 = new Policy();
		p6.polId = 106; p6.name = "Gadag Heritage Circuit"; p6.focus = "North Karnataka"; p6.budget = "200 Cr"; p6.duration = "2026-29";
        g6.policy = p6; 
		g6.getGovDetails();

        Government g7 = new Government();
        g7.policyId = 7; g7.stateName = "Karnataka"; g7.cmName = "Siddaramaiah"; g7.dept = "Education";
        Policy p7 = new Policy();
		p7.polId = 107; p7.name = "Skill India Karnataka"; p7.focus = "Youth Training"; p7.budget = "3000 Cr"; p7.duration = "2026-30";
        g7.policy = p7; 
		g7.getGovDetails();

        Government g8 = new Government();
        g8.policyId = 8; g8.stateName = "Karnataka"; g8.cmName = "Siddaramaiah"; g8.dept = "Agriculture";
        Policy p8 = new Policy(); 
		p8.polId = 108; p8.name = "Agri-Tech 2026"; p8.focus = "Farm Innovation"; p8.budget = "2500 Cr"; p8.duration = "2026-28";
        g8.policy = p8; 
		g8.getGovDetails();

        Government g9 = new Government();
        g9.policyId = 9; g9.stateName = "Karnataka"; g9.cmName = "Siddaramaiah"; g9.dept = "Industry";
        Policy p9 = new Policy();
		p9.polId = 109; p9.name = "Make in Karnataka 2.0"; p9.focus = "Industrial Growth"; p9.budget = "10000 Cr"; p9.duration = "2026-32";
        g9.policy = p9; 
		g9.getGovDetails();

        Government g10 = new Government();
        g10.policyId = 10; g10.stateName = "Karnataka"; g10.cmName = "Siddaramaiah"; g10.dept = "Environment";
        Policy p10 = new Policy();
		p10.polId = 110; p10.name = "Green Karnataka"; p10.focus = "Eco Conservation"; p10.budget = "1500 Cr"; p10.duration = "2026-31";
        g10.policy = p10;
		g10.getGovDetails();

        Government g11 = new Government();
        g11.policyId = 11; g11.stateName = "Karnataka";
		g11.cmName = "Siddaramaiah"; g11.dept = "Health";
        Policy p11 = new Policy(); 
		p11.polId = 111; p11.name = "Ayushman Bharat KC";
		p11.focus = "Healthcare Access"; p11.budget = "8000 Cr";
		p11.duration = "2026-30";
        g11.policy = p11; g11.getGovDetails();

        Government g12 = new Government();
        g12.policyId = 12; g12.stateName = "Karnataka"; 
		g12.cmName = "Siddaramaiah"; g12.dept = "Transport";
        Policy p12 = new Policy(); p12.polId = 112;
		p12.name = "Bengaluru Metro Phase 3";
		p12.focus = "Urban Mobility"; p12.budget = "25000 Cr"; 
		p12.duration = "2026-35";
        g12.policy = p12;
		g12.getGovDetails();

        Government g13 = new Government();
        g13.policyId = 13; g13.stateName = "Karnataka";
		g13.cmName = "Siddaramaiah"; g13.dept = "Energy";
        Policy p13 = new Policy(); p13.polId = 113; 
		p13.name = "Solar Karnataka 2026"; p13.focus = "Renewable Energy";
		p13.budget = "5000 Cr"; p13.duration = "2026-32";
        g13.policy = p13; 
		g13.getGovDetails();

        Government g14 = new Government();
        g14.policyId = 14; g14.stateName = "Karnataka"; 
		g14.cmName = "Siddaramaiah"; g14.dept = "Women & Child";
        Policy p14 = new Policy(); p14.polId = 114; 
		p14.name = "Shakti Scheme"; p14.focus = "Women Safety"; 
		p14.budget = "2000 Cr"; p14.duration = "Permanent";
        g14.policy = p14;
		g14.getGovDetails();

        Government g15 = new Government();
        g15.policyId = 15; g15.stateName = "Karnataka"; 
		g15.cmName = "Siddaramaiah"; g15.dept = "Rural Dev";
        Policy p15 = new Policy(); p15.polId = 115; p15.name = "Grama Swaraj 2.0";
		p15.focus = "Village Development"; p15.budget = "4000 Cr";
		p15.duration = "2026-30";
        g15.policy = p15;
		g15.getGovDetails();

        Government g16 = new Government();
        g16.policyId = 16; g16.stateName = "Karnataka"; 
		g16.cmName = "Siddaramaiah"; g16.dept = "Urban Dev";
        Policy p16 = new Policy(); p16.polId = 116; 
		p16.name = "Smart City BBMP"; p16.focus = "Urban Renewal";
		p16.budget = "10000 Cr"; p16.duration = "2026-33";
        g16.policy = p16;
		g16.getGovDetails();

        Government g17 = new Government();
        g17.policyId = 17; g17.stateName = "Karnataka"; 
		g17.cmName = "Siddaramaiah";
		g17.dept = "Labour";
        Policy p17 = new Policy(); p17.polId = 117;
		p17.name = "Gig Economy Policy"; p17.focus = "Freelance Workers";
		p17.budget = "500 Cr"; p17.duration = "2026-29";
        g17.policy = p17;
		g17.getGovDetails();

        Government g18 = new Government();
        g18.policyId = 18; g18.stateName = "Karnataka";
		g18.cmName = "Siddaramaiah"; g18.dept = "Social Welfare";
        Policy p18 = new Policy(); p18.polId = 118; 
		p18.name = "SC/ST Scholarship"; p18.focus = "Education Support";
		p18.budget = "3000 Cr"; p18.duration = "Annual";
        g18.policy = p18;
		g18.getGovDetails();

        Government g19 = new Government();
        g19.policyId = 19; g19.stateName = "Karnataka"; 
		g19.cmName = "Siddaramaiah"; g19.dept = "Animal Husbandry";
        Policy p19 = new Policy(); p19.polId = 119;
		p19.name = "Dairy Development"; p19.focus = "Milk Production"; 
		p19.budget = "1200 Cr"; p19.duration = "2026-30";
        g19.policy = p19;
		g19.getGovDetails();

        Government g20 = new Government();
        g20.policyId = 20; g20.stateName = "Karnataka"; 
		g20.cmName = "Siddaramaiah"; g20.dept = "Youth Services";
        Policy p20 = new Policy(); p20.polId = 120; 
		p20.name = "Youth Employment Guarantee"; p20.focus = "Job Creation";
		p20.budget = "2500 Cr"; p20.duration = "2026-28";
        g20.policy = p20;
		g20.getGovDetails();
    }
}

class GovernmentExecutor {
    public static void main(String[] args) {
        Policy p1 = new Policy(101, "Coastal Tourism Plan", "Karavali Development", "1260 Cr", "2026-2030");
        Government g1 = new Government(1, "Karnataka", "Siddaramaiah", "Tourism", p1);
        g1.getGovDetails();

        Policy p2 = new Policy(102, "Anjanadri Hill Dev", "Hampi Tourism", "100 Cr", "2026-28");
        Government g2 = new Government(2, "Karnataka", "Siddaramaiah", "Tourism", p2);
        g2.getGovDetails();

        Policy p3 = new Policy(103, "Smaraka Mitras", "Heritage Guides", "50 Cr", "2026-30");
        Government g3 = new Government(3, "Karnataka", "Siddaramaiah", "Tourism", p3);
        g3.getGovDetails();

        Policy p4 = new Policy(104, "Budget 2026-27", "Economic Growth", "350000 Cr", "2026-27");
        Government g4 = new Government(4, "Karnataka", "Siddaramaiah", "Finance", p4);
        g4.getGovDetails();

        Policy p5 = new Policy(105, "AI Policy 2026", "Tech Innovation", "5000 Cr", "2026-31");
        Government g5 = new Government(5, "Karnataka", "Siddaramaiah", "IT-BT", p5);
        g5.getGovDetails();

        Policy p6 = new Policy(106, "Gadag Heritage Circuit", "North Karnataka", "200 Cr", "2026-29");
        Government g6 = new Government(6, "Karnataka", "Siddaramaiah", "Tourism", p6);
        g6.getGovDetails();

        Policy p7 = new Policy(107, "Skill India Karnataka", "Youth Training", "3000 Cr", "2026-30");
        Government g7 = new Government(7, "Karnataka", "Siddaramaiah", "Education", p7);
        g7.getGovDetails();

        Policy p8 = new Policy(108, "Agri-Tech 2026", "Farm Innovation", "2500 Cr", "2026-28");
        Government g8 = new Government(8, "Karnataka", "Siddaramaiah", "Agriculture", p8);
        g8.getGovDetails();

        Policy p9 = new Policy(109, "Make in Karnataka 2.0", "Industrial Growth", "10000 Cr", "2026-32");
        Government g9 = new Government(9, "Karnataka", "Siddaramaiah", "Industry", p9);
        g9.getGovDetails();

        Policy p10 = new Policy(110, "Green Karnataka", "Eco Conservation", "1500 Cr", "2026-31");
        Government g10 = new Government(10, "Karnataka", "Siddaramaiah", "Environment", p10);
        g10.getGovDetails();

        Policy p11 = new Policy(111, "Ayushman Bharat KC", "Healthcare Access", "8000 Cr", "2026-30");
        Government g11 = new Government(11, "Karnataka", "Siddaramaiah", "Health", p11);
        g11.getGovDetails();

        Policy p12 = new Policy(112, "Bengaluru Metro Phase 3", "Urban Mobility", "25000 Cr", "2026-35");
        Government g12 = new Government(12, "Karnataka", "Siddaramaiah", "Transport", p12);
        g12.getGovDetails();

        Policy p13 = new Policy(113, "Solar Karnataka 2026", "Renewable Energy", "5000 Cr", "2026-32");
        Government g13 = new Government(13, "Karnataka", "Siddaramaiah", "Energy", p13);
        g13.getGovDetails();

        Policy p14 = new Policy(114, "Shakti Scheme", "Women Safety", "2000 Cr", "Permanent");
        Government g14 = new Government(14, "Karnataka", "Siddaramaiah", "Women & Child", p14);
        g14.getGovDetails();

        Policy p15 = new Policy(115, "Grama Swaraj 2.0", "Village Development", "4000 Cr", "2026-30");
        Government g15 = new Government(15, "Karnataka", "Siddaramaiah", "Rural Dev", p15);
        g15.getGovDetails();

        Policy p16 = new Policy(116, "Smart City BBMP", "Urban Renewal", "10000 Cr", "2026-33");
        Government g16 = new Government(16, "Karnataka", "Siddaramaiah", "Urban Dev", p16);
        g16.getGovDetails();

        Policy p17 = new Policy(117, "Gig Economy Policy", "Freelance Workers", "500 Cr", "2026-29");
        Government g17 = new Government(17, "Karnataka", "Siddaramaiah", "Labour", p17);
        g17.getGovDetails();

        Policy p18 = new Policy(118, "SC/ST Scholarship", "Education Support", "3000 Cr", "Annual");
        Government g18 = new Government(18, "Karnataka", "Siddaramaiah", "Social Welfare", p18);
        g18.getGovDetails();

        Policy p19 = new Policy(119, "Dairy Development", "Milk Production", "1200 Cr", "2026-30");
        Government g19 = new Government(19, "Karnataka", "Siddaramaiah", "Animal Husbandry", p19);
        g19.getGovDetails();

        Policy p20 = new Policy(120, "Youth Employment Guarantee", "Job Creation", "2500 Cr", "2026-28");
        Government g20 = new Government(20, "Karnataka", "Siddaramaiah", "Youth Services", p20);
        g20.getGovDetails();
    }
}

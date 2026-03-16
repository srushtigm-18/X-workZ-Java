class CompanyExecutor {
    public static void main(String[] args) {
        Company c1 = new Company();
        c1.companyId = 1; c1.companyName = "Tata Consultancy Services"; c1.headquarters = "Mumbai"; c1.ceo = "K Krithivasan";
        Project p1 = new Project(); p1.projectId = 101; p1.projectName = "Digital Horizon"; p1.technology = "Cloud AI"; p1.teamSize = 1500; p1.budget = 2500.0;
        c1.project = p1; c1.getCompanyDetails();

        Company c2 = new Company();
        c2.companyId = 2; c2.companyName = "Infosys"; c2.headquarters = "Bengaluru"; c2.ceo = "Salil Parekh";
        Project p2 = new Project(); p2.projectId = 202; p2.projectName = "Nia AI Platform"; p2.technology = "Generative AI"; p2.teamSize = 1200; p2.budget = 1800.0;
        c2.project = p2; c2.getCompanyDetails();

        Company c3 = new Company();
        c3.companyId = 3; c3.companyName = "Wipro"; c3.headquarters = "Bengaluru"; c3.ceo = "Srinivas Pallia";
        Project p3 = new Project(); p3.projectId = 303; p3.projectName = "TopGear Reimagined"; p3.technology = "Full Stack"; p3.teamSize = 800; p3.budget = 1200.0;
        c3.project = p3; c3.getCompanyDetails();

        Company c4 = new Company();
        c4.companyId = 4; c4.companyName = "HCL Technologies"; c4.headquarters = "Noida"; c4.ceo = "C Vijayakumar";
        Project p4 = new Project(); p4.projectId = 404; p4.projectName = "Mode 1 2 3"; p4.technology = "Digital Engineering"; p4.teamSize = 2000; p4.budget = 3200.0;
        c4.project = p4; c4.getCompanyDetails();

        Company c5 = new Company();
        c5.companyId = 5; c5.companyName = "Tech Mahindra"; c5.headquarters = "Pune"; c5.ceo = "Mohit Joshi";
        Project p5 = new Project(); p5.projectId = 505; p5.projectName = "Cloud Ecosystem"; p5.technology = "Multi Cloud"; p5.teamSize = 950; p5.budget = 1500.0;
        c5.project = p5; c5.getCompanyDetails();

        Company c6 = new Company();
        c6.companyId = 6; c6.companyName = "LTIMindtree"; c6.headquarters = "Bengaluru"; c6.ceo = "Debashis Chatterjee";
        Project p6 = new Project(); p6.projectId = 606; p6.projectName = "iCORE Genesis"; p6.technology = "Low Code"; p6.teamSize = 650; p6.budget = 950.0;
        c6.project = p6; c6.getCompanyDetails();

        Company c7 = new Company();
        c7.companyId = 7; c7.companyName = "Mphasis"; c7.headquarters = "Bengaluru"; c7.ceo = "Sitalakshmi S";
        Project p7 = new Project(); p7.projectId = 707; p7.projectName = "Next Gen Labs"; p7.technology = "Blockchain"; p7.teamSize = 450; p7.budget = 680.0;
        c7.project = p7; c7.getCompanyDetails();

        Company c8 = new Company();
        c8.companyId = 8; c8.companyName = "Cognizant"; c8.headquarters = "Chennai"; c8.ceo = "Ravi Kumar S";
        Project p8 = new Project(); p8.projectId = 808; p8.projectName = "Neuro AI"; p8.technology = "Neuro Symbolic AI"; p8.teamSize = 1800; p8.budget = 2800.0;
        c8.project = p8; c8.getCompanyDetails();

        Company c9 = new Company();
        c9.companyId = 9; c9.companyName = "Accenture"; c9.headquarters = "Gurugram"; c9.ceo = "Manish Sharma";
        Project p9 = new Project(); p9.projectId = 909; p9.projectName = "SynOps Platform"; p9.technology = "Hyperautomation"; p9.teamSize = 2200; p9.budget = 4200.0;
        c9.project = p9; c9.getCompanyDetails();

        Company c10 = new Company();
        c10.companyId = 10; c10.companyName = "Deloitte"; c10.headquarters = "Hyderabad"; c10.ceo = "Romal Shetty";
        Project p10 = new Project(); p10.projectId = 1010; p10.projectName = "Cortex AI"; p10.technology = "Enterprise AI"; p10.teamSize = 1100; p10.budget = 1900.0;
        c10.project = p10; c10.getCompanyDetails();

        Company c11 = new Company();
        c11.companyId = 11; c11.companyName = "Capgemini"; c11.headquarters = "Mumbai"; c11.ceo = "Aiman Ezzat";
        Project p11 = new Project(); p11.projectId = 111; p11.projectName = "Intelligent Industry"; p11.technology = "Industry 4.0"; p11.teamSize = 1400; p11.budget = 2400.0;
        c11.project = p11; c11.getCompanyDetails();

        Company c12 = new Company();
        c12.companyId = 12; c12.companyName = "IBM India"; c12.headquarters = "Bengaluru"; c12.ceo = "Sandip Patel";
        Project p12 = new Project(); p12.projectId = 1212; p12.projectName = "WatsonX"; p12.technology = "AI Foundation"; p12.teamSize = 900; p12.budget = 1600.0;
        c12.project = p12; c12.getCompanyDetails();

        Company c13 = new Company();
        c13.companyId = 13; c13.companyName = "Oracle India"; c13.headquarters = "Bengaluru"; c13.ceo = "Kris Kumar";
        Project p13 = new Project(); p13.projectId = 1313; p13.projectName = "Fusion Cloud"; p13.technology = "SaaS ERP"; p13.teamSize = 750; p13.budget = 1300.0;
        c13.project = p13; c13.getCompanyDetails();

        Company c14 = new Company();
        c14.companyId = 14; c14.companyName = "SAP Labs India"; c14.headquarters = "Bengaluru"; c14.ceo = "Pankaj Kumar";
        Project p14 = new Project(); p14.projectId = 1414; p14.projectName = "RISE with SAP"; p14.technology = "S/4HANA Cloud"; p14.teamSize = 850; p14.budget = 1400.0;
        c14.project = p14; c14.getCompanyDetails();

        Company c15 = new Company();
        c15.companyId = 15; c15.companyName = "Microsoft India"; c15.headquarters = "Hyderabad"; c15.ceo = "Puneet Chandok";
        Project p15 = new Project(); p15.projectId = 1515; p15.projectName = "Copilot Enterprise"; p15.technology = "Generative AI"; p15.teamSize = 1300; p15.budget = 2200.0;
        c15.project = p15; c15.getCompanyDetails();

        Company c16 = new Company();
        c16.companyId = 16; c16.companyName = "Google India"; c16.headquarters = "Hyderabad"; c16.ceo = "Sanjay Gupta";
        Project p16 = new Project(); p16.projectId = 1616; p16.projectName = "Gemini Enterprise"; p16.technology = "Multimodal AI"; p16.teamSize = 1000; p16.budget = 3000.0;
        c16.project = p16; c16.getCompanyDetails();

        Company c17 = new Company();
        c17.companyId = 17; c17.companyName = "Amazon India"; c17.headquarters = "Bengaluru"; c17.ceo = "Manish Tiwary";
        Project p17 = new Project(); p17.projectId = 1717; p17.projectName = "AWS GenAI"; p17.technology = "Serverless AI"; p17.teamSize = 950; p17.budget = 1800.0;
        c17.project = p17; c17.getCompanyDetails();

        Company c18 = new Company();
        c18.companyId = 18; c18.companyName = "Aditya Birla"; c18.headquarters = "Pune"; c18.ceo = "Jyothindra Thota";
        Project p18 = new Project(); p18.projectId = 1818; p18.projectName = "ABSL Digital"; p18.technology = "Digital Banking"; p18.teamSize = 600; p18.budget = 950.0;
        c18.project = p18; c18.getCompanyDetails();

        Company c19 = new Company();
        c19.companyId = 19; c19.companyName = "Zensar"; c19.headquarters = "Pune"; c19.ceo = "Sandeep Kumar";
        Project p19 = new Project(); p19.projectId = 1919; p19.projectName = "EOS Platform"; p19.technology = "Experience Engineering"; p19.teamSize = 550; p19.budget = 820.0;
        c19.project = p19; c19.getCompanyDetails();

        Company c20 = new Company();
        c20.companyId = 20; c20.companyName = "KPMG India"; c20.headquarters = "Mumbai"; c20.ceo = "Vinayak Bhargava";
        Project p20 = new Project(); p20.projectId = 2020; p20.projectName = "Ignite Digital"; p20.technology = "Risk AI"; p20.teamSize = 700; p20.budget = 1100.0;
        c20.project = p20; c20.getCompanyDetails();
    }
}

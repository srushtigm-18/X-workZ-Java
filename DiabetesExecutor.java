class DiabetesExecutor{
    public static void main(String[] args){
        Diabetes diabetes1 = new Diabetes(1, "Ramesh Kumar", "Type 2", false, "Thirst Fatigue", 
                                        "Insulin Resistance", "Metformin Diet", 45, 180.0, 7.8, 
                                        true, "Metformin 500mg", "Low Carb", true, 1, 
                                        "Dr. Sharma", "Narayana Health Bengaluru", true, 7, 0.0, 
                                        "Managed", "Moderate");
        diabetes1.getDiabetesDetails();

        Diabetes diabetes2 = new Diabetes(2, "Priya M", "Type 1", true, "Weight Loss Thirst", 
                                        "Autoimmune", "Insulin Therapy", 12, 320.0, 9.5, 
                                        false, "Insulin Lantus", "Carb Counting", true, 2, 
                                        "Dr. Rao", "Manipal Hospital", false, 1, 25.0, 
                                        "Uncontrolled", "High");
        diabetes2.getDiabetesDetails();

        Diabetes diabetes3 = new Diabetes(3, "Srushti G M", "Pre-Diabetes", false, "Mild Fatigue", 
                                        "Predisposition", "Lifestyle Change", 22, 110.0, 6.2, 
                                        true, "None", "Balanced Diet", true, 0, 
                                        "Dr. Patel", "Apollo Clinic Bengaluru", true, 30, 0.0, 
                                        "Reversing", "Low");
        diabetes3.getDiabetesDetails();

        Diabetes diabetes4 = new Diabetes(4, "Anil Joshi", "Type 2", false, "Blurred Vision", 
                                        "Obesity", "GLP-1 Agonist", 52, 220.0, 8.9, 
                                        true, "Semaglutide", "Keto Diet", false, 3, 
                                        "Dr. Gupta", "Fortis Hospital", false, 14, 0.0, 
                                        "Poor Control", "High");
        diabetes4.getDiabetesDetails();

        Diabetes diabetes5 = new Diabetes(5, "Lakshmi D", "Gestational", false, "Excessive Hunger", 
                                        "Pregnancy Hormones", "Insulin Diet", 28, 145.0, 6.8, 
                                        false, "Insulin Short Acting", "Diabetic Pregnancy", true, 0, 
                                        "Dr. Shetty", "Cloudnine Hospital", true, 3, 12.0, 
                                        "Postpartum", "Moderate");
        diabetes5.getDiabetesDetails();

        Diabetes diabetes6 = new Diabetes(6, "Vijay Reddy", "Type 2", false, "Frequent Urination", 
                                        "Sedentary Lifestyle", "SGLT2 Inhibitor", 38, 165.0, 7.5, 
                                        true, "Empagliflozin", "Low GI", true, 1, 
                                        "Dr. Kumar", "Sakra World Hospital", true, 7, 0.0, 
                                        "Well Managed", "Low");
        diabetes6.getDiabetesDetails();

        Diabetes diabetes7 = new Diabetes(7, "Meera S", "Type 1", true, "Nausea Vomiting", 
                                        "Pancreatic Failure", "Insulin Pump", 19, 280.0, 10.2, 
                                        true, "Insulin Pump Continuous", "Carb Ratio", true, 4, 
                                        "Dr. Nair", "Aster CMI", false, 1, 40.0, 
                                        "Ketoacidosis Risk", "Critical");
        diabetes7.getDiabetesDetails();

        Diabetes diabetes8 = new Diabetes(8, "Rajesh N", "MODY", true, "No Symptoms", 
                                        "Genetic Mutation", "Sulfonylurea", 25, 130.0, 6.5, 
                                        true, "Gliclazide", "Normal Diet", true, 0, 
                                        "Dr. Iyer", "Manipal Hospital", true, 30, 5.0, 
                                        "Genetic Type", "Low");
        diabetes8.getDiabetesDetails();

        Diabetes diabetes9 = new Diabetes(9, "Sunita K", "Type 2", false, "Slow Healing", 
                                        "Poor Circulation", "DPP4 Inhibitor", 60, 195.0, 8.2, 
                                        true, "Sitagliptin", "Renal Diet", false, 2, 
                                        "Dr. Singh", "Columbia Asia", false, 14, 0.0, 
                                        "Nephropathy Risk", "High");
        diabetes9.getDiabetesDetails();

        Diabetes diabetes10 = new Diabetes(10, "Kiran P", "LADA", true, "Gradual Onset", 
                                         "Slow Autoimmune", "Basal Bolus Insulin", 35, 175.0, 7.9, 
                                         false, "Lantus+Novorapid", "Low Carb", true, 1, 
                                         "Dr. Reddy", "Narayana Health", true, 7, 18.0, 
                                         "Latent Autoimmune", "Moderate");
        diabetes10.getDiabetesDetails();
    }
}

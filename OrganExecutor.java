class OrganExecutor{
    public static void main(String[] args){
        Organ organ1 = new Organ(1, "Heart", "Cardiovascular", true, "Thoracic Cavity", 
                               "Blood Circulation", 300.0, 5000, false, "N/A", 
                               "Srushti G M", false, "Normal", 12, 75.0, 
                               "Narayana Health Bengaluru", false, 95, 250.0, 
                               "O+", "Healthy", "High");
        organ1.getOrganDetails();

        Organ organ2 = new Organ(2, "Liver", "Digestive", true, "Right Upper Abdomen", 
                               "Detoxification", 1500.0, 1200, true, "Anonymous Donor", 
                               "Ramesh K", true, "Cirrhosis", 14, 45.0, 
                               "Manipal Hospital", true, 85, 300.0, 
                               "B+", "Failing", "Critical");
        organ2.getOrganDetails();

        Organ organ3 = new Organ(3, "Kidney", "Excretory", true, "Lower Abdomen", 
                               "Blood Filtration", 150.0, 1100, true, "Live Donor", 
                               "Priya M", false, "Normal", 11, 90.0, 
                               "NIMHANS Bengaluru", true, 98, 60.0, 
                               "A+", "Excellent", "High");
        organ3.getOrganDetails();

        Organ organ4 = new Organ(4, "Lung", "Respiratory", true, "Chest Cavity", 
                               "Gas Exchange", 550.0, 4000, false, "N/A", 
                               "Anil J", true, "COPD", 25, 60.0, 
                               "Fortis Hospital", true, 80, 200.0, 
                               "AB+", "Damaged", "High");
        organ4.getOrganDetails();

        Organ organ5 = new Organ(5, "Pancreas", "Endocrine", true, "Left Abdomen", 
                               "Insulin Production", 80.0, 200, true, "Cadaver Donor", 
                               "Lakshmi D", true, "Diabetes", 15, 30.0, 
                               "Apollo Hospital", false, 70, 25.0, 
                               "O-", "Failing", "Critical");
        organ5.getOrganDetails();

        Organ organ6 = new Organ(6, "Cornea", "Sensory", false, "Eye Surface", 
                               "Vision Clarity", 0.1, 50, true, "Eye Bank", 
                               "Vijay R", false, "Normal", 12, 95.0, 
                               "Sankara Eye Hospital", false, 99, 5.0, 
                               "Universal", "Perfect", "High");
        organ6.getOrganDetails();

        Organ organ7 = new Organ(7, "Bone Marrow", "Hematopoietic", true, "All Bones", 
                               "Blood Cell Production", 2600.0, 100, true, "Sibling Donor", 
                               "Meera S", true, "Leukemia", 5, 20.0, 
                               "Tata Memorial", false, 85, 50.0, 
                               "A-", "Regenerating", "Critical");
        organ7.getOrganDetails();

        Organ organ8 = new Organ(8, "Intestine", "Digestive", true, "Abdominal Cavity", 
                               "Nutrient Absorption", 1200.0, 800, true, "Deceased Donor", 
                               "Rajesh N", true, "Crohn's", 600, 40.0, 
                               "FI Hospital", false, 75, 150.0, 
                               "B+", "Short Bowel", "High");
        organ8.getOrganDetails();

        Organ organ9 = new Organ(9, "Skin", "Integumentary", false, "Body Surface", 
                               "Protection Barrier", 5000.0, 300, true, "Cadaver Skin", 
                               "Sunita K", true, "Burns 60%", 2000, 70.0, 
                               "Victoria Hospital Burns", false, 90, 100.0, 
                               "Universal", "Healing", "Emergency");
        organ9.getOrganDetails();

        Organ organ10 = new Organ(10, "Spleen", "Lymphatic", false, "Left Abdomen", 
                                "Immune Function", 150.0, 150, false, "N/A", 
                                "Srushti G M", false, "Normal", 12, 85.0, 
                                "Manipal Hospital", false, 92, 30.0, 
                                "O+", "Healthy", "Medium");
        organ10.getOrganDetails();
    }
}

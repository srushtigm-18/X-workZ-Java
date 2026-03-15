class CellExecutor {
    public static void main(String[] args){
        Cell cell1 = new Cell(1, "Red Blood Cell", "Erythrocyte", true, "Oxygen Transport", "Bloodstream", 
                            7, 5000000000L, false, "Mature", "Human", "Blood", 
                            false, 120, 85.0, "Srushti G M", "Narayana Health", 
                            false, 0, 0.01, "Healthy", "Low");
        cell1.getCellDetails();

        Cell cell2 = new Cell(2, "White Blood Cell", "Leukocyte", true, "Immune Defense", "Lymphatic", 
                            12, 7000000L, true, "G1 Phase", "Human", "Blood", 
                            false, 24, 92.0, "Ramesh K", "Manipal Hospital", 
                            false, 1, 0.05, "Active", "Low");
        cell2.getCellDetails();

        Cell cell3 = new Cell(3, "Neuron", "Nerve Cell", true, "Signal Transmission", "Brain", 
                            100, 86000000000L, false, "Resting", "Human", "Nervous", 
                            false, 0, 75.0, "Srushti G M", "NIMHANS", 
                            false, 0, 0.001, "Functional", "Low");
        cell3.getCellDetails();

        Cell cell4 = new Cell(4, "Hepatocyte", "Liver Cell", true, "Detoxification", "Liver Lobule", 
                            20, 200000000000L, true, "S Phase", "Human", "Liver", 
                            false, 300, 88.0, "Anil J", "Manipal Hospital", 
                            false, 2, 0.02, "Regenerating", "Low");
        cell4.getCellDetails();

        Cell cell5 = new Cell(5, "Beta Cell", "Pancreatic", true, "Insulin Production", "Islets of Langerhans", 
                            10, 1000000000L, false, "Secretory", "Human", "Pancreas", 
                            true, 48, 65.0, "Priya M", "Apollo Hospital", 
                            false, 1, 0.1, "Dysfunctional", "High");
        cell5.getCellDetails();

        Cell cell6 = new Cell(6, "Keratinocyte", "Skin Cell", true, "Skin Barrier", "Epidermis", 
                            30, 1000000000000L, true, "Differentiation", "Human", "Skin", 
                            false, 28, 80.0, "Sunita K", "Victoria Hospital", 
                            false, 5, 0.03, "Healing", "Low");
        cell6.getCellDetails();

        Cell cell7 = new Cell(7, "Osteocyte", "Bone Cell", true, "Bone Maintenance", "Osteon", 
                            15, 42000000000L, false, "Mature", "Human", "Bone", 
                            false, 0, 70.0, "Rajesh N", "Fortis Hospital", 
                            true, 0, 0.01, "Stable", "Low");
        cell7.getCellDetails();

        Cell cell8 = new Cell(8, "Alveolar Cell", "Lung Cell", true, "Gas Exchange", "Alveolus", 
                            5, 480000000000L, true, "Type II", "Human", "Lung", 
                            false, 36, 82.0, "Vijay R", "Sakra Hospital", 
                            false, 3, 0.04, "Active", "Moderate");
        cell8.getCellDetails();

        Cell cell9 = new Cell(9, "Cancer Cell", "Carcinoma", true, "Uncontrolled Growth", "Tumor Mass", 
                            25, 10000000000L, true, "M Phase", "Human", "Breast", 
                            true, 12, 95.0, "Meera S", "Tata Memorial", 
                            false, 50, 0.8, "Malignant", "Critical");
        cell9.getCellDetails();

        Cell cell10 = new Cell(10, "Stem Cell", "Pluripotent", true, "Regeneration", "Bone Marrow", 
                             12, 100000000L, true, "G2 Phase", "Human", "Hematopoietic", 
                             false, 24, 90.0, "Srushti G M", "Narayana Health", 
                             true, 10, 0.05, "Therapeutic", "Low");
        cell10.getCellDetails();
    }
}

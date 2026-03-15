class ToxicExecutor{
    public static void main(String[] args){
        Toxic toxic1 = new Toxic(1, "Toluene", "Solvent", true, "Printing Ink", "Inhalation", 
                               "High", 150, 50, 100, 720, false, "Industrial", 
                               "Headache Dizziness", false, 5000, "Printing", 
                               "REACH Restricted", false, 8, 0.7, "Flammable Toxic");
        toxic1.getToxicDetails();

        Toxic toxic2 = new Toxic(2, "Formaldehyde", "Chemical", true, "Particle Board", "Inhalation", 
                               "Very High", 300, 0, 0, 3600, false, "Formalin", 
                               "Eye Irritation Cancer", true, 100, "Furniture", 
                               "Carcinogen Listed", true, 10, 0.9, "CMR");
        toxic2.getToxicDetails();

        Toxic toxic3 = new Toxic(3, "Lead Chromate", "Pigment", true, "Yellow Paint", "Ingestion", 
                               "Extreme", 800, 10, 0, 8760, true, "Industrial Pigment", 
                               "Kidney Damage Cancer", true, 50, "Paints", 
                               "Banned REACH", true, 9, 1.0, "Heavy Metal");
        toxic3.getToxicDetails();

        Toxic toxic4 = new Toxic(4, "Benzene", "Solvent", true, "Fuel Additive", "Inhalation", 
                               "Very High", 200, 1, 0, 4320, true, "Petrochemical", 
                               "Leukemia Blood Cancer", true, 930, "Petroleum", 
                               "Carcinogen Banned", false, 10, 0.85, "Leukemogen");
        toxic4.getToxicDetails();

        Toxic toxic5 = new Toxic(5, "Asbestos", "Fiber", true, "Insulation", "Inhalation", 
                               "Extreme", 5000, 0, 0, 99999, true, "Building Material", 
                               "Lung Cancer Mesothelioma", false, 20, "Construction", 
                               "Globally Banned", true, 10, 1.0, "Respiratory");
        toxic5.getToxicDetails();

        Toxic toxic6 = new Toxic(6, "Mercury", "Heavy Metal", true, "Thermometers", "Ingestion", 
                               "High", 1200, 0, 0, 8760, false, "Industrial", 
                               "Brain Kidney Damage", true, 1, "Electronics", 
                               "Minamata Convention", true, 9, 0.95, "Neurotoxin");
        toxic6.getToxicDetails();

        Toxic toxic7 = new Toxic(7, "Phthalates", "Plasticizer", true, "PVC Toys", "Ingestion", 
                               "Moderate", 80, 20, 500, 2160, false, "DEHP", 
                               "Hormone Disruption", true, 8000, "Plastics", 
                               "REACH Restricted", true, 7, 0.6, "Endocrine");
        toxic7.getToxicDetails();

        Toxic toxic8 = new Toxic(8, "Cadmium", "Heavy Metal", true, "Batteries", "Inhalation", 
                               "Very High", 900, 5, 0, 7200, true, "NiCd Battery", 
                               "Kidney Cancer Bone Damage", false, 225, "Electronics", 
                               "RoHS Restricted", true, 9, 0.92, "Carcinogen");
        toxic8.getToxicDetails();

        Toxic toxic9 = new Toxic(9, "PCBs", "Industrial Chemical", true, "Electrical Oil", "Ingestion", 
                               "Extreme", 2500, 0, 0, 99999, true, "Aroclor", 
                               "Liver Cancer Immune Damage", true, 2, "Transformers", 
                               "Stockholm Convention", true, 10, 1.0, "POPs");
        toxic9.getToxicDetails();

        Toxic toxic10 = new Toxic(10, "Vinyl Chloride", "Gas", true, "PVC Production", "Inhalation", 
                                "Very High", 400, 1, 0, 5040, true, "Monomer", 
                                "Liver Cancer Angiosarcoma", true, 280, "Plastics", 
                                "IARC Group 1", false, 10, 0.88, "Hepatotoxin");
        toxic10.getToxicDetails();
    }
}

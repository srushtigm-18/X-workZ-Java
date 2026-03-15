class BrainExecutor{
    public static void main(String[] args){
        Brain brain1 = new Brain(1, "Prefrontal Cortex", "Frontal", true, "Decision Making", "Anterior", 
                               "High Activity", 1000000000, 150, 25, false, "Left", 
                               "Executive Function", true, 12, "Srushti G M", 
                               "NIMHANS Bengaluru", false, 0, 750.0, "Normal", "Low");
        brain1.getBrainDetails();

        Brain brain2 = new Brain(2, "Hippocampus", "Temporal", false, "Memory Formation", "Medial Temporal", 
                               "Moderate Activity", 50000000, 8, 30, false, "Right", 
                               "Long Term Memory", true, 8, "Ramesh K", 
                               "Manipal Hospital", false, 0, 650.0, "Normal", "Low");
        brain2.getBrainDetails();

        Brain brain3 = new Brain(3, "Motor Cortex", "Frontal", true, "Movement Control", "Precentral Gyrus", 
                               "High Activity", 200000000, 120, 22, true, "Left", 
                               "Hand Movement", true, 15, "Srushti G M", 
                               "NIMHANS Bengaluru", false, 0, 680.0, "Stroke Recovery", "Moderate");
        brain3.getBrainDetails();

        Brain brain4 = new Brain(4, "Broca's Area", "Frontal", true, "Speech Production", "Inferior Frontal", 
                               "High Activity", 150000000, 80, 28, false, "Left", 
                               "Language Center", true, 20, "Priya M", 
                               "Aster CMI Bengaluru", false, 0, 720.0, "Aphasia Recovery", "Moderate");
        brain4.getBrainDetails();

        Brain brain5 = new Brain(5, "Wernicke's Area", "Temporal", true, "Language Comprehension", "Superior Temporal", 
                               "Moderate Activity", 120000000, 90, 35, false, "Left", 
                               "Speech Understanding", true, 18, "Anil J", 
                               "Narayana Health", false, 0, 700.0, "Normal", "Low");
        brain5.getBrainDetails();

        Brain brain6 = new Brain(6, "Amygdala", "Limbic", false, "Emotion Processing", "Medial Temporal", 
                               "High Activity", 10000000, 2, 40, true, "Right", 
                               "Fear Response", true, 25, "Lakshmi D", 
                               "Manipal Hospital", false, 0, 600.0, "PTSD", "High");
        brain6.getBrainDetails();

        Brain brain7 = new Brain(7, "Occipital Lobe", "Occipital", false, "Visual Processing", "Posterior", 
                               "Very High Activity", 500000000, 200, 20, false, "Right", 
                               "Vision Center", true, 30, "Vijay R", 
                               "Sakra World Hospital", true, 15, 800.0, "Tumor", "Critical");
        brain7.getBrainDetails();

        Brain brain8 = new Brain(8, "Parietal Lobe", "Parietal", true, "Spatial Awareness", "Superior Parietal", 
                               "Moderate Activity", 300000000, 160, 26, false, "Left", 
                               "Spatial Processing", true, 10, "Srushti G M", 
                               "NIMHANS Bengaluru", false, 0, 740.0, "Normal", "Low");
        brain8.getBrainDetails();

        Brain brain9 = new Brain(9, "Cerebellum", "Posterior", false, "Motor Coordination", "Infratentorial", 
                               "High Activity", 690000000, 180, 30, true, "Both", 
                               "Balance Control", false, 5, "Rajesh N", 
                               "Fortis Hospital", false, 0, 550.0, "Ataxia", "Severe");
        brain9.getBrainDetails();

        Brain brain10 = new Brain(10, "Thalamus", "Diencephalon", true, "Sensory Relay", "Central", 
                                "High Activity", 40000000, 30, 45, false, "Both", 
                                "Sensory Gateway", true, 14, "Sunita K", 
                                "Apollo Hospital Bengaluru", false, 0, 780.0, "Normal", "Low");
        brain10.getBrainDetails();
    }
}

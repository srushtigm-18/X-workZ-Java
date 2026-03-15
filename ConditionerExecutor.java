class ConditionerExecutor{
    public static void main(String[] args){
        Conditioner cond1 = new Conditioner(1, "Pantene Pro-V Repair", "Damage Repair", false, "Pro-V", 
                                          "Deep Conditioning", "P&G", 180, 220.0, 
                                          "Pro-V Nutrium 10", true, "Damaged Hair", 
                                          false, 24, "Squeeze Tube", "Procter & Gamble", 
                                          false, 9, "Daily Repair", true, 4.5, "Premium");
        cond1.getConditionerDetails();

        Conditioner cond2 = new Conditioner(2, "Dove Intense Repair", "Restoring", true, "Almond Milk", 
                                          "Split Ends Repair", "Unilever", 200, 280.0, 
                                          "Keratin Proteins", true, "Dry Hair", 
                                          false, 24, "Pump Bottle", "Unilever", 
                                          false, 9, "Frizzy Hair", true, 4.7, "Luxury");
        cond2.getConditionerDetails();

        Conditioner cond3 = new Conditioner(3, "L'Oreal Elvive Dream Lengths", "Lengthening", true, "Floral", 
                                          "No Hair Fall", "L'Oreal", 200, 320.0, 
                                          "Filler-A100 Ceramide", true, "Long Hair", 
                                          false, 24, "Frizz Shield Bottle", "L'Oreal Paris", 
                                          false, 8, "Hair Fall", true, 4.8, "Professional");
        cond3.getConditionerDetails();

        Conditioner cond4 = new Conditioner(4, "Tresemme Keratin Smooth", "Anti-Frizz", false, "Coconut", 
                                          "Frizz Control", "Unilever", 190, 290.0, 
                                          "Keratin Milk", true, "Frizzy Hair", 
                                          false, 24, "Smooth Bottle", "Unilever", 
                                          false, 9, "Humid Weather", true, 4.6, "Salon");
        cond4.getConditionerDetails();

        Conditioner cond5 = new Conditioner(5, "Himalaya Herbals Protein", "Natural", true, "Herbal", 
                                          "Hair Strength", "Himalaya", 200, 240.0, 
                                          "Chickpea Protein", true, "Weak Hair", 
                                          false, 18, "Green Bottle", "Himalaya Wellness", 
                                          true, 8, "Natural Care", false, 4.9, "Ayurvedic");
        cond5.getConditionerDetails();

        Conditioner cond6 = new Conditioner(6, "Matrix Biolage Smooth", "Professional", true, "Camelia", 
                                          "Silky Smooth", "L'Oreal Pro", 200, 650.0, 
                                          "Camelia Oil", true, "Unruly Hair", 
                                          false, 24, "Salon Tube", "Matrix", 
                                          false, 10, "Salon Users", true, 4.4, "Elite");
        cond6.getConditionerDetails();

        Conditioner cond7 = new Conditioner(7, "Mamaearth Onion Oil", "Hair Growth", true, "Onion Argan", 
                                          "Hair Fall Control", "Mamaearth", 250, 350.0, 
                                          "Onion Oil Redensyl", true, "Thinning Hair", 
                                          true, 18, "Recyclable Pump", "Honest Company", 
                                          true, 9, "Toxin Free", false, 4.7, "Clean Beauty");
        cond7.getConditionerDetails();

        Conditioner cond8 = new Conditioner(8, "BBlunt Intense Moisture", "Hydrating", true, "Mango", 
                                          "Dry Hair Rescue", "BBlunt", 200, 550.0, 
                                          "Mango Butter", true, "Dry Scalp", 
                                          false, 24, "Salon Jar", "BBlunt Salon", 
                                          false, 9, "Salon Treatment", true, 4.5, "Professional");
        cond8.getConditionerDetails();

        Conditioner cond9 = new Conditioner(9, "Khadi Natural Amla", "Organic", true, "Amla", 
                                          "Volume & Shine", "Khadi", 210, 260.0, 
                                          "Amla Shikakai Reetha", true, "Normal Hair", 
                                          false, 12, "Matte Bottle", "Khadi Natural", 
                                          true, 8, "Ayurveda Lovers", false, 5.0, "Herbal");
        cond9.getConditionerDetails();

        Conditioner cond10 = new Conditioner(10, "Moroccanoil Hydrating", "Luxury", true, "Argan Berry", 
                                           "Intense Moisture", "Moroccanoil", 250, 3200.0, 
                                           "Argan Oil Keratin", true, "Color Treated", 
                                           true, 24, "Premium Glass", "Moroccanoil", 
                                           true, 10, "Luxury Spa", true, 4.3, "Ultra Premium");
        cond10.getConditionerDetails();
    }
}

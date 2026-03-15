class LotionExecutor{
    public static void main(String[] args){
        Lotion lotion1 = new Lotion(1, "Cetaphil Moisturizing", "Daily", false, "Fragrance Free", 
                                   "Dry Skin Relief", "Galderma", 250, 450.0, 
                                   "Glycerin Niacinamide", true, "Sensitive Skin", 
                                   true, 24, "Pump Bottle", "Narayana Pharmacy", 
                                   false, 9, "Daily Use", true, 5.5, "Premium");
        lotion1.getLotionDetails();

        Lotion lotion2 = new Lotion(2, "Elovera Cream", "Medicated", true, "Mild Herbal", 
                                   "Burn Wound Healing", "Eris Lifesciences", 50, 180.0, 
                                   "Herbal Extracts", true, "Burns Wounds", 
                                   true, 18, "Tube", "Manipal Pharmacy", 
                                   true, 8, "Hospital Use", true, 6.0, "Therapeutic");
        lotion2.getLotionDetails();

        Lotion lotion3 = new Lotion(3, "Srushti Aloe Vera", "Natural", false, "Aloe Fresh", 
                                   "Post Gym Soothing", "Srushti Naturals", 100, 250.0, 
                                   "Aloe Vera Vitamin E", true, "Athletic Skin", 
                                   true, 12, "Squeeze Tube", "Apollo Pharmacy", 
                                   false, 9, "Fitness Users", true, 5.2, "Organic");
        lotion3.getLotionDetails();

        Lotion lotion4 = new Lotion(4, "Calamine Lotion", "Medicated", true, "Calamine Pink", 
                                   "Itch Relief", "Pfizer", 100, 120.0, 
                                   "Calamine Zinc Oxide", true, "Rashes Itching", 
                                   false, 24, "Shake Bottle", "Fortis Pharmacy", 
                                   false, 8, "Allergy Relief", true, 7.0, "Classic");
        lotion4.getLotionDetails();

        Lotion lotion5 = new Lotion(5, "Nivea Soft", "Moisturizing", false, "Jojoba Vanilla", 
                                   "Daily Hydration", "Beiersdorf", 300, 280.0, 
                                   "Jojoba Oil Vitamin E", true, "Normal Skin", 
                                   true, 24, "Soft Tube", "MedPlus Pharmacy", 
                                   false, 9, "Daily Moisturizer", false, 5.4, "Premium");
        lotion5.getLotionDetails();

        Lotion lotion6 = new Lotion(6, "Betnovate Cream", "Steroid", true, "Odorless", 
                                   "Eczema Psoriasis", "GSK", 30, 220.0, 
                                   "Betamethasone", false, "Inflammatory Skin", 
                                   false, 12, "Aluminum Tube", "Sakra Pharmacy", 
                                   true, 7, "Prescription Only", false, 5.0, "Potent");
        lotion6.getLotionDetails();

        Lotion lotion7 = new Lotion(7, "Himalaya Cocoa Butter", "Nourishing", false, "Cocoa Butter", 
                                   "Stretch Mark Prevention", "Himalaya", 200, 320.0, 
                                   "Cocoa Butter Shea", true, "Pregnancy Skin", 
                                   true, 18, "Jar Packaging", "Aster Pharmacy", 
                                   false, 8, "Maternity Care", true, 5.8, "Natural");
        lotion7.getLotionDetails();

        Lotion lotion8 = new Lotion(8, "Silicone Gel", "Scar Treatment", true, "Fragrance Free", 
                                   "Scar Reduction", "ScarAway", 15, 1500.0, 
                                   "Medical Silicone", true, "Surgical Scars", 
                                   true, 24, "Roll On", "Columbia Asia Pharmacy", 
                                   true, 9, "Post Surgery", true, 5.5, "Medical");
        lotion8.getLotionDetails();

        Lotion lotion9 = new Lotion(9, "Sebamed Clear Face", "Anti-Acne", true, "Citrus Fresh", 
                                   "Acne Control", "Sebamed", 50, 650.0, 
                                   "Salicylic Acid", true, "Oily Acne Skin", 
                                   false, 18, "Pump Dispenser", "NIMHANS Pharmacy", 
                                   false, 9, "Teen Acne Care", true, 5.5, "Dermatology");
        lotion9.getLotionDetails();

        Lotion lotion10 = new Lotion(10, "Vaseline Intensive Care", "Deep Moisturizing", false, "Aloe Fresh", 
                                    "Very Dry Skin", "Unilever", 400, 220.0, 
                                    "Petrolatum Glycerin", true, "Extremely Dry", 
                                    true, 36, "Large Pump", "Apollo Pharmacy", 
                                    false, 9, "Winter Care", false, 6.2, "Value Pack");
        lotion10.getLotionDetails();
    }
}

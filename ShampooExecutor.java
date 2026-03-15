class ShampooExecutor{
    public static void main(String[] args){
        Shampoo shampoo1 = new Shampoo(1, "Head & Shoulders Classic", "Anti-Dandruff", false, "Menthol", 
                                     "Dandruff Control", "P&G", 340, 299.0, 
                                     "Zinc Pyrithione SLES", true, "All Hair Types", 
                                     true, 24, "Flip Cap Bottle", "Procter & Gamble", 
                                     false, 9, "Daily Use", true, 5.5, "Premium");
        shampoo1.getShampooDetails();

        Shampoo shampoo2 = new Shampoo(2, "Dove Intense Repair", "Repairing", true, "Almond", 
                                     "Damage Repair", "Unilever", 340, 350.0, 
                                     "SLES Silk Proteins", true, "Damaged Hair", 
                                     true, 24, "Pump Bottle", "Unilever", 
                                     false, 9, "Color Treated", false, 5.7, "Luxury");
        shampoo2.getShampooDetails();

        Shampoo shampoo3 = new Shampoo(3, "Srushti Herbal", "Organic", true, "Neem Amla", 
                                     "Hair Fall Control", "Srushti Naturals", 200, 250.0, 
                                     "Neem Amla Bhringraj", true, "Oily Scalp", 
                                     true, 18, "Tube Packaging", "Bengaluru Herbal", 
                                     true, 8, "Natural Lovers", false, 5.2, "Ayurvedic");
        shampoo3.getShampooDetails();

        Shampoo shampoo4 = new Shampoo(4, "Pantene Pro-V", "Volume", false, "Floral", 
                                     "Volume Boost", "P&G", 180, 220.0, 
                                     "Panthenol SLES", false, "Thin Hair", 
                                     true, 24, "Squeeze Bottle", "Procter & Gamble", 
                                     false, 8, "Fine Hair", false, 5.8, "Professional");
        shampoo4.getShampooDetails();

        Shampoo shampoo5 = new Shampoo(5, "L'Oreal Paris EverPure", "Sulfate-Free", true, "Moisture", 
                                     "Color Protection", "L'Oreal", 250, 450.0, 
                                     "Cleansers Citric Acid", true, "Color Treated", 
                                     false, 24, "Premium Pump", "L'Oreal Paris", 
                                     false, 9, "Salon Quality", false, 5.4, "Luxury");
        shampoo5.getShampooDetails();

        Shampoo shampoo6 = new Shampoo(6, "Himalaya Anti-Hairfall", "Herbal", true, "Bhringraj", 
                                     "Hair Fall Reduction", "Himalaya", 400, 280.0, 
                                     "Bhringraj Amla Fenugreek", true, "Normal Hair", 
                                     true, 24, "Large Bottle", "Himalaya Wellness", 
                                     true, 8, "Ayurvedic Users", false, 5.3, "Natural");
        shampoo6.getShampooDetails();

        Shampoo shampoo7 = new Shampoo(7, "Tresemme Keratin Smooth", "Smoothing", false, "Coconut", 
                                     "Frizzy Hair Control", "Unilever", 580, 420.0, 
                                     "Keratin SLES", true, "Frizzy Hair", 
                                     true, 24, "Family Pack", "Unilever", 
                                     false, 9, "Humid Climate", false, 5.6, "Salon");
        shampoo7.getShampooDetails();

        Shampoo shampoo8 = new Shampoo(8, "Biotique Bio Kelp", "Organic", true, "Seaweed", 
                                     "Dandruff & Protein", "Biotique", 200, 220.0, 
                                     "Kelp Neem Ginger", true, "Dry Scalp", 
                                     true, 18, "Tube Pack", "Biotique India", 
                                     true, 7, "Vegan Users", true, 5.1, "Bio-Organic");
        shampoo8.getShampooDetails();

        Shampoo shampoo9 = new Shampoo(9, "Moroccanoil Moisture Repair", "Premium", true, "Argan", 
                                     "Deep Hydration", "Moroccanoil", 250, 2800.0, 
                                     "Argan Oil Keratin", true, "Dry Damaged", 
                                     true, 24, "Luxury Bottle", "Moroccanoil", 
                                     true, 10, "Luxury Spa", false, 5.0, "Elite");
        shampoo9.getShampooDetails();

        Shampoo shampoo10 = new Shampoo(10, "Mamaearth Tea Tree", "Anti-Dandruff", true, "Tea Tree", 
                                      "Scalp Care", "Mamaearth", 250, 300.0, 
                                      "Tea Tree Ginger Lemongrass", true, "Oily Dandruff", 
                                      true, 18, "Recyclable Bottle", "Honest Company", 
                                      true, 9, "Toxin-Free", true, 5.4, "Clean Beauty");
        shampoo10.getShampooDetails();
    }
}

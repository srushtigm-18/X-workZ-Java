class SalonExecutor {
    public static void main(String[] args) {
        Service sv1 = new Service(101, "Keratin Treatment", "3 hrs", 8500, "Certified Stylist");
        Salon s1 = new Salon(1, "Lakme Salon", "Koramangala", "Lakme", sv1);
        s1.getSalonDetails();

        Service sv2 = new Service(102, "Hair Spa", "1 hr", 1800, "Hair Expert");
        Salon s2 = new Salon(2, "Jawed Habib", "MG Road", "Jawed Habib", sv2);
        s2.getSalonDetails();

        Service sv3 = new Service(103, "Global Hair Color", "2 hrs", 4500, "Color Specialist");
        Salon s3 = new Salon(3, "Naturals Salon", "Jayanagar", "Naturals", sv3);
        s3.getSalonDetails();

        Service sv4 = new Service(104, "Balayage", "3 hrs", 12500, "International Trainer");
        Salon s4 = new Salon(4, "Toni & Guy", "Indiranagar", "Toni & Guy", sv4);
        s4.getSalonDetails();

        Service sv5 = new Service(105, "Hydrafacial", "45 min", 3500, "Skin Expert");
        Salon s5 = new Salon(5, "Looks Salon", "Whitefield", "Looks", sv5);
        s5.getSalonDetails();

        Service sv6 = new Service(106, "Brazilian Blowout", "2.5 hrs", 9500, "Keratin Specialist");
        Salon s6 = new Salon(6, "Juice Salon", "Malleshwaram", "Juice", sv6);
        s6.getSalonDetails();

        Service sv7 = new Service(107, "Microblading", "2 hrs", 18000, "Brow Artist");
        Salon s7 = new Salon(7, "Enrich Salon", "HSR Layout", "Enrich", sv7);
        s7.getSalonDetails();

        Service sv8 = new Service(108, "Nail Extensions", "2 hrs", 2500, "Nail Technician");
        Salon s8 = new Salon(8, "Strands Salon", "Marathahalli", "Strands", sv8);
        s8.getSalonDetails();

        Service sv9 = new Service(109, "Bridal Makeup", "3 hrs", 25000, "Celebrity MUA");
        Salon s9 = new Salon(9, "Geetanjali Salon", "Banashankari", "Geetanjali", sv9);
        s9.getSalonDetails();

        Service sv10 = new Service(110, "Olaplex Treatment", "1.5 hrs", 6500, "Hair Doctor");
        Salon s10 = new Salon(10, "Biguine Salon", "UB City", "Biguine", sv10);
        s10.getSalonDetails();

        Service sv11 = new Service(111, "Laser Hair Removal", "30 min", 5000, "Laser Tech");
        Salon s11 = new Salon(11, "HC-One", "Brigade Road", "HC-One", sv11);
        s11.getSalonDetails();

        Service sv12 = new Service(112, "Threading + Facial", "1 hr", 1200, "Facialist");
        Salon s12 = new Salon(12, "Green Trends", "Electronic City", "Green Trends", sv12);
        s12.getSalonDetails();

        Service sv13 = new Service(113, "Hair Smoothing", "2 hrs", 7200, "Styling Expert");
        Salon s13 = new Salon(13, "Vibes Salon", "JP Nagar", "Vibes", sv13);
        s13.getSalonDetails();

        Service sv14 = new Service(114, "Scalp Detox", "45 min", 2200, "Trichologist");
        Salon s14 = new Salon(14, "Loreal Professionnel", "Sadashivanagar", "Loreal", sv14);
        s14.getSalonDetails();

        Service sv15 = new Service(115, "Pre-Bridal Package", "4 hrs", 35000, "Bridal Team");
        Salon s15 = new Salon(15, "Matrix Salon", "RT Nagar", "Matrix", sv15);
        s15.getSalonDetails();

        Service sv16 = new Service(116, "Detan Facial", "1 hr", 2800, "Skin Therapist");
        Salon s16 = new Salon(16, "Kiehl's Spa", "Ashok Nagar", "Kiehl's", sv16);
        s16.getSalonDetails();

        Service sv17 = new Service(117, "Body Polish", "1.5 hrs", 4200, "Wellness Expert");
        Salon s17 = new Salon(17, "VLCC", "Kammanahalli", "VLCC", sv17);
        s17.getSalonDetails();

        Service sv18 = new Service(118, "Hair Botox", "2 hrs", 9800, "Hair Rejuvenation");
        Salon s18 = new Salon(18, "Jean-Claude Biguine", "Domlur", "Biguine", sv18);
        s18.getSalonDetails();

        Service sv19 = new Service(119, "Manicure + Pedicure", "1.5 hrs", 1500, "Nail Artist");
        Salon s19 = new Salon(19, "Rassul Salon", "Frazer Town", "Rassul", sv19);
        s19.getSalonDetails();

        Service sv20 = new Service(120, "Party Makeup", "1.5 hrs", 6500, "Makeup Artist");
        Salon s20 = new Salon(20, "ALK Salon", "Yelahanka", "ALK", sv20);
        s20.getSalonDetails();
    }
}

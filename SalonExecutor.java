class SalonExecutor {
    public static void main(String[] args) {
        Salon s1 = new Salon();
        s1.salonId = 1; 
		s1.salonName = "Lakme Salon";
		s1.location = "Koramangala";
		s1.chain = "Lakme";
        Service sv1 = new Service(); 
		sv1.serviceId = 101;
		sv1.treatment = "Keratin Treatment";
		sv1.duration = "3 hrs"; 
		sv1.price = 8500;
		sv1.specialist = "Certified Stylist";
        s1.service = sv1; 
		s1.getSalonDetails();

        Salon s2 = new Salon();
        s2.salonId = 2;
		s2.salonName = "Jawed Habib"; 
		s2.location = "MG Road"; s2.chain = 
		"Jawed Habib";
        Service sv2 = new Service();
		sv2.serviceId = 102;
		sv2.treatment = "Hair Spa";
		sv2.duration = "1 hr"; 
		sv2.price = 1800; 
		sv2.specialist = "Hair Expert";
        s2.service = sv2;
		s2.getSalonDetails();

        Salon s3 = new Salon();
        s3.salonId = 3; 
		s3.salonName = "Naturals Salon"; 
		s3.location = "Jayanagar"; 
		s3.chain = "Naturals";
        Service sv3 = new Service(); 
		sv3.serviceId = 103;
		sv3.treatment = "Global Hair Color";
		sv3.duration = "2 hrs";
		sv3.price = 4500; 
		sv3.specialist = "Color Specialist";
        s3.service = sv3; 
		s3.getSalonDetails();

        Salon s4 = new Salon();
        s4.salonId = 4; 
		s4.salonName = "Toni & Guy"; 
		s4.location = "Indiranagar"; 
		s4.chain = "Toni & Guy";
        Service sv4 = new Service();
		sv4.serviceId = 104; 
		sv4.treatment = "Balayage";
		sv4.duration = "3 hrs"; 
		sv4.price = 12500; 
		sv4.specialist = "International Trainer";
        s4.service = sv4;
		s4.getSalonDetails();

        Salon s5 = new Salon();
        s5.salonId = 5;
		s5.salonName = "Looks Salon";
		s5.location = "Whitefield";
		s5.chain = "Looks";
        Service sv5 = new Service();
		sv5.serviceId = 105; 
		sv5.treatment = "Hydrafacial"; 
		sv5.duration = "45 min";
		sv5.price = 3500;
		sv5.specialist = "Skin Expert";
        s5.service = sv5;
		s5.getSalonDetails();

        Salon s6 = new Salon();
        s6.salonId = 6; 
		s6.salonName = "Juice Salon";
		s6.location = "Malleshwaram"; 
		s6.chain = "Juice";
        Service sv6 = new Service();
		sv6.serviceId = 106; 
		sv6.treatment = "Brazilian Blowout"; 
		sv6.duration = "2.5 hrs"; 
		sv6.price = 9500; 
		sv6.specialist = "Keratin Specialist";
        s6.service = sv6; 
		s6.getSalonDetails();

        Salon s7 = new Salon();
        s7.salonId = 7;
		s7.salonName = "Enrich Salon";
		s7.location = "HSR Layout"; 
		s7.chain = "Enrich";
        Service sv7 = new Service(); 
		sv7.serviceId = 107; 
		sv7.treatment = "Microblading";
		sv7.duration = "2 hrs";
		sv7.price = 18000;
		sv7.specialist = "Brow Artist";
        s7.service = sv7;
		s7.getSalonDetails();

        Salon s8 = new Salon();
        s8.salonId = 8; 
		s8.salonName = "Strands Salon";
		s8.location = "Marathahalli"; 
		s8.chain = "Strands";
        Service sv8 = new Service();
		sv8.serviceId = 108;
		sv8.treatment = "Nail Extensions";
		sv8.duration = "2 hrs"; 
		sv8.price = 2500;
		sv8.specialist = "Nail Technician";
        s8.service = sv8;
		s8.getSalonDetails();

        Salon s9 = new Salon();
        s9.salonId = 9; 
		s9.salonName = "Geetanjali Salon"; 
		s9.location = "Banashankari"; 
		s9.chain = "Geetanjali";
        Service sv9 = new Service();
		sv9.serviceId = 109; 
		sv9.treatment = "Bridal Makeup"; 
		sv9.duration = "3 hrs"; 
		sv9.price = 25000;
		sv9.specialist = "Celebrity MUA";
        s9.service = sv9;
		s9.getSalonDetails();

        Salon s10 = new Salon();
        s10.salonId = 10; 
		s10.salonName = "Biguine Salon";
		s10.location = "UB City"; 
		s10.chain = "Biguine";
        Service sv10 = new Service(); 
		sv10.serviceId = 110; 
		sv10.treatment = "Olaplex Treatment"; 
		sv10.duration = "1.5 hrs"; 
		sv10.price = 6500;
		sv10.specialist = "Hair Doctor";
        s10.service = sv10;
		s10.getSalonDetails();

        Salon s11 = new Salon();
        s11.salonId = 11;
		s11.salonName = "HC-One"; 
		s11.location = "Brigade Road";
		s11.chain = "HC-One";
        Service sv11 = new Service(); 
		sv11.serviceId = 111;
		sv11.treatment = "Laser Hair Removal"; 
		sv11.duration = "30 min";
		sv11.price = 5000; 
		sv11.specialist = "Laser Tech";
        s11.service = sv11;
		s11.getSalonDetails();

        Salon s12 = new Salon();
        s12.salonId = 12; s12.salonName = "Green Trends"; 
		s12.location = "Electronic City";
		s12.chain = "Green Trends";
        Service sv12 = new Service(); 
		sv12.serviceId = 112; sv12.treatment = "Threading + Facial"; 
		sv12.duration = "1 hr"; sv12.price = 1200; 
		sv12.specialist = "Facialist";
        s12.service = sv12; 
		s12.getSalonDetails();

        Salon s13 = new Salon();
        s13.salonId = 13; s13.salonName = "Vibes Salon";
		s13.location = "JP Nagar"; s13.chain = "Vibes";
        Service sv13 = new Service(); 
		sv13.serviceId = 113; sv13.treatment = "Hair Smoothing";
		sv13.duration = "2 hrs"; sv13.price = 7200; sv13.specialist = "Styling Expert";
        s13.service = sv13;
		s13.getSalonDetails();

        Salon s14 = new Salon();
        s14.salonId = 14; s14.salonName = "Loreal Professionnel"; 
		s14.location = "Sadashivanagar"; s14.chain = "Loreal";
        Service sv14 = new Service(); 
		sv14.serviceId = 114; sv14.treatment = "Scalp Detox"; 
		sv14.duration = "45 min"; sv14.price = 2200; sv14.specialist = "Trichologist";
        s14.service = sv14;
		s14.getSalonDetails();

        Salon s15 = new Salon();
        s15.salonId = 15; s15.salonName = "Matrix Salon"; 
		s15.location = "RT Nagar"; s15.chain = "Matrix";
        Service sv15 = new Service(); sv15.serviceId = 115;
		sv15.treatment = "Pre-Bridal Package"; 
		sv15.duration = "4 hrs"; sv15.price = 35000;
		sv15.specialist = "Bridal Team";
        s15.service = sv15; 
		s15.getSalonDetails();

        Salon s16 = new Salon();
        s16.salonId = 16; s16.salonName = "Kiehl's Spa"; 
		s16.location = "Ashok Nagar"; s16.chain = "Kiehl's";
        Service sv16 = new Service(); sv16.serviceId = 116; 
		sv16.treatment = "Detan Facial"; sv16.duration = "1 hr";
		sv16.price = 2800; sv16.specialist = "Skin Therapist";
        s16.service = sv16;
		s16.getSalonDetails();

        Salon s17 = new Salon();
        s17.salonId = 17; s17.salonName = "VLCC"; 
		s17.location = "Kammanahalli"; s17.chain = "VLCC";
        Service sv17 = new Service(); sv17.serviceId = 117;
		sv17.treatment = "Body Polish"; sv17.duration = "1.5 hrs"; 
		sv17.price = 4200; sv17.specialist = "Wellness Expert";
        s17.service = sv17;
		s17.getSalonDetails();

        Salon s18 = new Salon();
        s18.salonId = 18; s18.salonName = "Jean-Claude Biguine"; 
		s18.location = "Domlur"; s18.chain = "Biguine";
        Service sv18 = new Service(); sv18.serviceId = 118; 
		sv18.treatment = "Hair Botox"; sv18.duration = "2 hrs";
		sv18.price = 9800; sv18.specialist = "Hair Rejuvenation";
        s18.service = sv18; 
		s18.getSalonDetails();

        Salon s19 = new Salon();
        s19.salonId = 19; s19.salonName = "Rassul Salon";
		s19.location = "Frazer Town"; s19.chain = "Rassul";
        Service sv19 = new Service(); sv19.serviceId = 119;
		sv19.treatment = "Manicure + Pedicure"; sv19.duration = "1.5 hrs";
		sv19.price = 1500; sv19.specialist = "Nail Artist";
        s19.service = sv19;
		s19.getSalonDetails();

        Salon s20 = new Salon();
        s20.salonId = 20; s20.salonName = "ALK Salon";
		s20.location = "Yelahanka"; s20.chain = "ALK";
        Service sv20 = new Service(); sv20.serviceId = 120;
		sv20.treatment = "Party Makeup"; sv20.duration = "1.5 hrs";
		sv20.price = 6500; sv20.specialist = "Makeup Artist";
        s20.service = sv20;
		s20.getSalonDetails();
    }
}

class CCDExecutor {
    public static void main(String[] args) {
        CCD ccd1 = new CCD();
        ccd1.outletId = 1; ccd1.chainName = "Café Coffee Day"; ccd1.location = "Brigade Road, Bengaluru"; ccd1.founded = "1996";
        Coffee cf1 = new Coffee();
		cf1.coffeeId = 101; cf1.name = "Cappuccino"; cf1.type = "Classic"; cf1.price = 165; cf1.size = "Regular";
        ccd1.coffee = cf1; 
		ccd1.getCCDDetails();

        CCD ccd2 = new CCD();
        ccd2.outletId = 2; 
		ccd2.chainName = "Café Coffee Day"; ccd2.location = "MG Road, Bengaluru"; ccd2.founded = "1996";
        Coffee cf2 = new Coffee(); 
		cf2.coffeeId = 102; cf2.name = "Filter Coffee"; cf2.type = "South Indian"; cf2.price = 95; cf2.size = "Tall";
        ccd2.coffee = cf2;
		ccd2.getCCDDetails();

        CCD ccd3 = new CCD();
        ccd3.outletId = 3;
		ccd3.chainName = "Café Coffee Day"; ccd3.location = "Koramangala, Bengaluru"; ccd3.founded = "1996";
        Coffee cf3 = new Coffee();
		cf3.coffeeId = 103; cf3.name = "Devils Own"; cf3.type = "Cold"; cf3.price = 185; cf3.size = "Large";
        ccd3.coffee = cf3; 
		ccd3.getCCDDetails();

        CCD ccd4 = new CCD();
        ccd4.outletId = 4; ccd4.chainName = "Café Coffee Day"; ccd4.location = "Whitefield, Bengaluru"; ccd4.founded = "1996";
        Coffee cf4 = new Coffee();
		cf4.coffeeId = 104; cf4.name = "Mocha"; cf4.type = "Hot"; cf4.price = 175; cf4.size = "Regular";
        ccd4.coffee = cf4;
		ccd4.getCCDDetails();

        CCD ccd5 = new CCD();
        ccd5.outletId = 5; ccd5.chainName = "Café Coffee Day"; ccd5.location = "Indiranagar, Bengaluru"; ccd5.founded = "1996";
        Coffee cf5 = new Coffee();
		cf5.coffeeId = 105; cf5.name = "Irish Coffee"; cf5.type = "Premium"; cf5.price = 225; cf5.size = "Regular";
        ccd5.coffee = cf5; 
		ccd5.getCCDDetails();

        CCD ccd6 = new CCD();
        ccd6.outletId = 6; ccd6.chainName = "Café Coffee Day"; ccd6.location = "Jayanagar, Bengaluru"; ccd6.founded = "1996";
        Coffee cf6 = new Coffee();
		cf6.coffeeId = 106; cf6.name = "Espresso"; cf6.type = "Shot"; cf6.price = 105; cf6.size = "Single";
        ccd6.coffee = cf6; 
		ccd6.getCCDDetails();

        CCD ccd7 = new CCD();
        ccd7.outletId = 7; ccd7.chainName = "Café Coffee Day"; ccd7.location = "Malleshwaram, Bengaluru"; ccd7.founded = "1996";
        Coffee cf7 = new Coffee();
		cf7.coffeeId = 107; cf7.name = "Latte"; cf7.type = "Hot"; cf7.price = 155; cf7.size = "Tall";
        ccd7.coffee = cf7; 
		ccd7.getCCDDetails();

        CCD ccd8 = new CCD();
        ccd8.outletId = 8; ccd8.chainName = "Café Coffee Day"; ccd8.location = "Electronic City, Bengaluru"; ccd8.founded = "1996";
        Coffee cf8 = new Coffee();
		cf8.coffeeId = 108; cf8.name = "Iced Cappuccino"; cf8.type = "Cold"; cf8.price = 195; cf8.size = "Large";
        ccd8.coffee = cf8;
		ccd8.getCCDDetails();

        CCD ccd9 = new CCD();
        ccd9.outletId = 9; ccd9.chainName = "Café Coffee Day"; ccd9.location = "Marathahalli, Bengaluru"; ccd9.founded = "1996";
        Coffee cf9 = new Coffee();
		cf9.coffeeId = 109; cf9.name = "Caramel Macchiato"; cf9.type = "Hot"; cf9.price = 205; cf9.size = "Regular";
        ccd9.coffee = cf9; 
		ccd9.getCCDDetails();

        CCD ccd10 = new CCD();
        ccd10.outletId = 10; ccd10.chainName = "Café Coffee Day"; ccd10.location = "HSR Layout, Bengaluru"; ccd10.founded = "1996";
        Coffee cf10 = new Coffee(); 
		cf10.coffeeId = 110; cf10.name = "Americano"; cf10.type = "Black"; cf10.price = 135; cf10.size = "Tall";
        ccd10.coffee = cf10;
		ccd10.getCCDDetails();

        CCD ccd11 = new CCD();
        ccd11.outletId = 11; ccd11.chainName = "Café Coffee Day"; ccd11.location = "Sadashivanagar, Bengaluru"; ccd11.founded = "1996";
        Coffee cf11 = new Coffee();
		cf11.coffeeId = 111; cf11.name = "Hazelnut Cappuccino"; cf11.type = "Flavored"; cf11.price = 185; cf11.size = "Regular";
        ccd11.coffee = cf11; 
		ccd11.getCCDDetails();

        CCD ccd12 = new CCD();
        ccd12.outletId = 12; ccd12.chainName = "Café Coffee Day"; ccd12.location = "Rajajinagar, Bengaluru"; ccd12.founded = "1996";
        Coffee cf12 = new Coffee(); 
		cf12.coffeeId = 112; cf12.name = "Vanilla Latte"; cf12.type = "Hot"; cf12.price = 175; cf12.size = "Tall";
        ccd12.coffee = cf12; 
		ccd12.getCCDDetails();

        CCD ccd13 = new CCD();
        ccd13.outletId = 13; ccd13.chainName = "Café Coffee Day"; ccd13.location = "Banashankari, Bengaluru"; ccd13.founded = "1996";
        Coffee cf13 = new Coffee();
		cf13.coffeeId = 113; cf13.name = "Cold Brew"; cf13.type = "Cold"; cf13.price = 195; cf13.size = "Large";
        ccd13.coffee = cf13; 
		ccd13.getCCDDetails();

        CCD ccd14 = new CCD();
        ccd14.outletId = 14; ccd14.chainName = "Café Coffee Day"; ccd14.location = "Jalahalli, Bengaluru"; ccd14.founded = "1996";
        Coffee cf14 = new Coffee(); 
		cf14.coffeeId = 114; cf14.name = "Chocolate Mocha"; cf14.type = "Hot"; cf14.price = 195; cf14.size = "Regular";
        ccd14.coffee = cf14; 
		ccd14.getCCDDetails();

        CCD ccd15 = new CCD();
        ccd15.outletId = 15; ccd15.chainName = "Café Coffee Day"; ccd15.location = "Yelahanka, Bengaluru"; ccd15.founded = "1996";
        Coffee cf15 = new Coffee();
		cf15.coffeeId = 115; cf15.name = "Filter Coffee Float"; cf15.type = "Cold"; cf15.price = 145; cf15.size = "Tall";
        ccd15.coffee = cf15;
		ccd15.getCCDDetails();

        CCD ccd16 = new CCD();
        ccd16.outletId = 16; ccd16.chainName = "Café Coffee Day"; ccd16.location = "Domlur, Bengaluru"; ccd16.founded = "1996";
        Coffee cf16 = new Coffee();
		cf16.coffeeId = 116; cf16.name = "Double Espresso"; cf16.type = "Shot"; cf16.price = 155; cf16.size = "Double";
        ccd16.coffee = cf16; 
		ccd16.getCCDDetails();

        CCD ccd17 = new CCD();
        ccd17.outletId = 17; ccd17.chainName = "Café Coffee Day"; ccd17.location = "Kammanahalli, Bengaluru"; ccd17.founded = "1996";
        Coffee cf17 = new Coffee(); 
		cf17.coffeeId = 117; cf17.name = "Peppermint Mocha"; cf17.type = "Hot"; cf17.price = 215; cf17.size = "Regular";
        ccd17.coffee = cf17; 
		ccd17.getCCDDetails();

        CCD ccd18 = new CCD();
        ccd18.outletId = 18; ccd18.chainName = "Café Coffee Day"; ccd18.location = "Banaswadi, Bengaluru"; ccd18.founded = "1996";
        Coffee cf18 = new Coffee();
		cf18.coffeeId = 118; cf18.name = "Iced Americano"; cf18.type = "Cold"; cf18.price = 165; cf18.size = "Large";
        ccd18.coffee = cf18; 
		ccd18.getCCDDetails();

        CCD ccd19 = new CCD();
        ccd19.outletId = 19; ccd19.chainName = "Café Coffee Day"; ccd19.location = "RT Nagar, Bengaluru"; ccd19.founded = "1996";
        Coffee cf19 = new Coffee(); 
		cf19.coffeeId = 119; cf19.name = "Cinnamon Cappuccino"; cf19.type = "Hot"; cf19.price = 185; cf19.size = "Regular";
        ccd19.coffee = cf19;
		ccd19.getCCDDetails();

        CCD ccd20 = new CCD();
        ccd20.outletId = 20; ccd20.chainName = "Café Coffee Day"; ccd20.location = "JP Nagar, Bengaluru"; ccd20.founded = "1996";
        Coffee cf20 = new Coffee(); 
		cf20.coffeeId = 120; cf20.name = "Masala Filter Coffee"; cf20.type = "South Indian"; cf20.price = 115; cf20.size = "Tall";
        ccd20.coffee = cf20; 
		ccd20.getCCDDetails();
    }
}

class CountryRunner {
    public static String[] findStatesByCountry(String countryName) {
        System.out.println("invoked findStatesByCountry");
        
        if (countryName.equals("India")) {
            String[] states = {"Andhra Pradesh", "Arunachal Pradesh", /* ... */};
            System.out.println("India states found");
            return states;
        }
        else if (countryName.equals("United States")) {
            String[] states = {"Alabama", "Alaska", /* ... */};
            System.out.println("United States states found");
            return states;
        }
        else if (countryName.equals("Sweden")) { 
            String[] states = {"Stockholm", "Vasterbotten", /* ... */};
            System.out.println("Sweden states found");
            return states;
        }
        else if (countryName.equals("Egypt")) {  
            String[] states = {"Cairo", "Alexandria", /* ... */};
            System.out.println("Egypt states found");
            return states;
        }
        // Continue for all countries...
        
        return new String[0];  // Empty array for unknown countries
    }
    
    public static void getStates(String[] states) {
        System.out.println("States for the country:");
        if (states.length == 0) {
            System.out.println("- No states found");
        } else {
            for (int i = 0; i < states.length; i++) {
                System.out.println("- " + states[i]);
            }
        }
    }
}

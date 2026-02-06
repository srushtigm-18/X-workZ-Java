class Gym{
    public static void main(String[] args){

        String name = "Gold's Gym";
        String owner = "Gold's Gym International";
        int foundedIn = 1965;
        String address = "Santa Monica, California, USA (HQ)";
        String totalBranches = "700+ gyms worldwide";
        String gymType = "Premium Fitness Chain";

        String branches[] = {"Bengaluru (MG Road)", "Mumbai (Bandra)", "Delhi (Saket)", 
                           "Chennai (Anna Nagar)", "Hyderabad (Hitech City)", 
                           "Pune (Koregaon Park)", "Dubai", "USA (HQ)"};

        String workoutTypes[] = {"Weight Training", "Cardio", "Group Classes (Zumba/Yoga)", 
                               "Functional Training", "HIIT", "Personal Training"};

        String membershipTypes[] = {"Gold Membership", "Platinum (24/7 Access)", 
                                  "Family Pack", "Student Discount", "Corporate", "Trial Pass"};

        System.out.println("The gym name is: " + name);
        System.out.println("The Owner of gym: " + owner);
        System.out.println("Address of the gym: " + address);

        System.out.println("Founded in: " + foundedIn);
        System.out.println("Total branches: " + totalBranches);
        System.out.println("Type of gym: " + gymType);

        System.out.println(); 

        int size = branches.length;
        System.out.println("The number of Branches available are: " + size);
        System.out.println("The list of branches:");

        for(String branch : branches){
            System.out.println(branch);
        }

        System.out.println(); 

        int length = workoutTypes.length;
        System.out.println("The number of workout categories available are: " + length);
        System.out.println("The list of some categories are:");

        for(String category : workoutTypes){
            System.out.println(category);
        }

        System.out.println(); 

        int ln = membershipTypes.length;
        System.out.println("The number of membership types available are: " + ln);
        System.out.println("The list of membership types available are:");

        for(String membership : membershipTypes){
            System.out.println(membership);
        }
    }
}
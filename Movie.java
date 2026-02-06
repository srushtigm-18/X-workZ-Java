class Movie {
    public static void main(String[] args){

        String name = "Kantara";
        String director = "Rishab Shetty";
        int releaseYear = 2022;
        String language = "Kannada";
        String totalRuntime = "2 hours 31 minutes";
        String movieType = "Mythological Folk Drama";

        String actors[] = {"Rishab Shetty (Shivu)","Achyuth Kumar","Sunil Kumar","Ramesh Indira"};

        String actresses[] = {"Sapthami Gowda (Leela)","Manasi Sudhir","Ramachandra Raju (supporting female roles)"};

        String platforms[] = {"PVR INOX Bengaluru","RTO Multiplexes","Amazon Prime Video","Netflix","BookMyShow"};

        System.out.println("The movie name is: " + name);
        System.out.println("The director of movie: " + director);
        System.out.println("Language of the movie: " + language);

        System.out.println("Release year: " + releaseYear);
        System.out.println("Total runtime: " + totalRuntime);
        System.out.println("Type of movie: " + movieType);

        System.out.println(); 

        int size = actors.length;
        System.out.println("The number of actors available are: " + size);
        System.out.println("The list of actors:");

        for(String actor : actors){
            System.out.println(actor);
        }

        System.out.println(); 

        int length = actresses.length;
        System.out.println("The number of actresses available are: " + length);
        System.out.println("The list of some actresses are:");

        for(String actress : actresses){
            System.out.println(actress);
        }

        System.out.println(); 

        int ln = platforms.length;
        System.out.println("The number of platforms available are: " + ln);
        System.out.println("The list of platforms available are:");

        for(String platform : platforms){
            System.out.println(platform);
        }
    }
}
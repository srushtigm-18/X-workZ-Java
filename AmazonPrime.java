public class AmazonPrime{
    public static void main(String[] args) {
    String hindiMovies[]= {"Ae Watan Mere Watan", "Agni", "Kaagaz 2", "Rangeen", "Handsome Guys",
        "Justice on Trial", "Uppu Kappu Rambu", "120 Bahadur", "Operation Valentine", "Farzi Movie",
        "Andhera", "Param Sundari", "Nishaanchi 2", "Pagalpanti", "Pardes",
        "Kal Ho Naa Ho", "Kapoor & Sons", "Karthik Calling Karthik", "Pakeezah", "Sholay"};
		
     String teluguMovies[] = {"Dhandoraa", "Agent Sai Srinivasa Athreya", "Anu and Arjun", "Acharya", "Tuck Jagadish",
        "Kannappa", "Kantara Telugu Dub", "Sye Raa Narasimha Reddy", "F2 Telugu", "Mechanic Rocky",
        "Rathnam Telugu", "Jarann", "Eleven", "Narivetta", "Ace",
        "Kuberaa", "Family Star Telugu", "Adimurai", "Anu and Arjun", "Katha Sangama"};
		
    String tamilMovies[] = {"I", "Engga Hostel", "Rathnam", "Mechanic Rocky Tamil", "Thalaivii",
        "Kalavaani Mappillai", "Family Star Tamil", "Inspector Rishi Movie", "French Biriyani", "Don Tamil",
        "Vikram Vedha Tamil", "Bigil", "Nerkonda Paarvai", "Kaithi", "Master",
        "Sarpatta Parambarai Tamil", "Doctor Tamil", "96 Tamil", "Asuran", "Jagame Thandhiram"};
		
    String malayalamMovies[] = {"Ente Ummante Peru", "Enthadaa Saji", "Family Pack", "Family Star Malayalam", "Mechanic Rocky Malayalam",
        "Avatara Purusha", "Mudra", "Gantumoote", "Geetha", "Kalyana Subhamasthu",
        "Man of the Match", "Mayabazar 2016", "Muddy", "Munduvareda Adhyaya", "Raghavendra Stores",
        "Rathnan Prapancha", "Rewind", "Roberrt Malayalam", "Sunday Special", "Thallana"};
		
    String kannadaMovies[] = {"Kantara", "Kantara Chapter 1", "Avane Srimannarayana", "Avatara Purusha 2", "Mechanic Rocky Kannada",
        "Aachar & Co", "Family Pack Kannada", "French Biriyani Kannada", "Gantumoote Kannada", "Geetha Kannada",
        "Katha Sangama Kannada", "Kalyana Subhamasthu Kannada", "Man of the Match Kannada", "Mayabazar 2016 Kannada",
        "Muddy Kannada", "Munduvareda Adhyaya Kannada", "Raghavendra Stores Kannada", "Rathnan Prapancha Kannada",
        "Rewind Kannada", "Roberrt Kannada"};
		
		
		int size = teluguMovies.length;
System.out.println("The number of movies available are: "+size);
System.out.println("The list of Telugu movies are: ");

for(String movieName : teluguMovies){
 System.out.println(movieName); 
}

System.out.println();

int length = kannadaMovies.length;
System.out.println("The number of movies available are: "+length);
System.out.println("The list of Kannada movies are: ");

for(String movieName : kannadaMovies){
 System.out.println(movieName);
}
    }
}
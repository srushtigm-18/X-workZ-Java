class Netflix{
public static void main(String[] movies){ 
	String hindiMovies[] = {"Dhurandhar", "Tere Ishk Mein", "Champion", "Mardaani 2", "De De Pyaar De 2","Haq", "Mardaani", "Jolly LLB 3",
	     "Fighter", "Jawan", "Animal", "Pathaan","Gadar 2", "OMG 2", "Dream Girl 2", "Kill", "Crew", "Bhool Bhulaiyaa 3","Singham Again", "Housefull 5"};
		 
    String  teluguMovies[] = {"Akhanda 2", "Guntur Kaaram", "Kalki 2898 AD", "Devara", "Game Changer","Pushpa 2", "RRR", "Dasara", "Waltair Veerayya", "Veera Simha Reddy",
        "Bhola Shankar", "Salaar", "Tillu Square", "Manamey", "Gangs of Godavari","Yatra 2", "Mirai", "DNA", "Leo Telugu", "Jailer Telugu"};
		
    String tamilMovies[] = {"Thangalaan", "Thunivu", "Leo", "Jailer", "Indian 2", "Vettaiyan","Vikram", "Kaithi", "Master","Sarpatta Parambarai",
		"Soorarai Pottru","96", "Asuran", "Karnan", "Jagame Thandhiram", "Doctor", "Don","Vikram Vedha", "Bigil", "Viswasam"};
		
     String malayalamMovies[]= {"Manjummel Boys", "Premalu", "Bramayugam", "Romancham", "2018","Drishyam 2", "Lucifer", "Minnal Murali", "Kurup", "Cold Case",
        "Ela Veezha Poonchira", "Anweshippin Kandethum", "Abraham Ozler","Guruvayoor Ambalanadayil", "Aattam", "Kaathal", "Nna Thaan Case Kodu","Gaganachari", "Malayankunju", "Kumbalangi Nights"};
		
     String kannadaMovies[] = {"Kantara", "KGF Chapter 2", "777 Charlie", "Sapta Sagaradaache Ello","Mufti", "Avatar Purush", "Gandhada Gudi", "Kranti", "Kabzaa","Ghost", "Roberrt", "Pogaru", "Rathnan Preshtha Puthali", "James",
        "Bheema", "Yuva Rajakumara", "Kirik Party", "Tagaru","Avane Srimannarayana", "Ugramm"};

int size = teluguMovies.length;
System.out.println("The number of movies available are: "+size);
System.out.println("The list of Telugu movies are: ");

for(String movieName : teluguMovies){
 System.out.println(movieName); 
}

System.out.println();

int length = tamilMovies.length;
System.out.println("The number of movies available are: "+length);
System.out.println("The list of Tamil movies are: ");

for(String movieName : tamilMovies){
 System.out.println(movieName);
}
 }
  }
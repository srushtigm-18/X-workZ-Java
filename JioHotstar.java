class JioHotstar{
public static void main(String[] movies){
   
   String hindiMovies[]= {"Stree 2", "Bhool Bhulaiyaa 3", "Singham Again", "Housefull 5", "Raid 2","Kill", "Crew", "Fighter", "Chandu Champion", "Maidaan","Animal", "Jawan", "Pathaan", "Gadar 2", "OMG 2","Dream Girl 2", "Tu Jhoothi Main Makkaar", "Zara Hatke Zara Bachke", "Shehzada", "Bhediya"};
   
   String teluguMovies[]={"Devara", "Game Changer", "Pushpa 2", "Kalki 2898 AD", "Greatest of All Time","Dasara", "RRR", "Waltair Veerayya", "Veera Simha Reddy", "Bhola Shankar","Jailer Telugu", "Leo Telugu", "Salaar", "Guntur Kaaram", "Tillu Square","Manamey", "Gangs of Godavari", "Yatra 2", "Mirai", "DNA"};
   
   String tamilMovies[]= {"Thug Life", "Vettaiyan", "Leo", "Jailer", "Indian 2","Vikram", "Kaithi", "Master", "Sarpatta Parambarai", "Soorarai Pottru","96", "Asuran", "Karnan", "Jagame Thandhiram", "Doctor","Don", "Vikram Vedha", "Bigil", "Viswasam", "Nerkonda Paarvai"};
   
   String malayalamMovies[]= {"Manjummel Boys", "Premalu", "Bramayugam", "Malayankunju", "Romancham","2018", "Kumbalangi Nights", "Drishyam 2", "Lucifer", "Minnal Murali","Kurup", "Cold Case", "Ela Veezha Poonchira", "Anweshippin Kandethum", "Abraham Ozler","Guruvayoor Ambalanadayil", "Aattam", "Kaathal", "Nna Thaan Case Kodu", "Gaganachari"};
   
   String kannadaMovies[]={"Kantara", "Sapta Sagaradaache Ello", "777 Charlie", "KGF Chapter 2", "Mufti","Avatar Purush", "Gandhada Gudi", "Kranti", "Kabzaa", "Ghost","Roberrt", "Pogaru", "Rathnan Preshtha Puthali", "James", "Bheema","Yuva Rajakumara", "Kirik Party", "Tagaru", "Avane Srimannarayana", "Ugramm"};


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
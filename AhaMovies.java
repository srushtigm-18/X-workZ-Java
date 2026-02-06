class AhaMovies{  
  public static void main(String[] args) {
    String teluguMovies[]= {"Senapathi", "Bhamakalapam", "Bloody Mary", "Highway", "Orey Bujjiga",
        "Colour Photo", "Maa Vintha Gaadha", "Super Over", "Y", "Ardha Shathabdham",
        "Mix Up", "My Dear Donga", "Balu Gani Talkies", "Katha Kamamishu",
        "Neeli Megha Shyama", "Coffee with a Killer", "Chiranjeeva", "Vidya Vasula Aham","Aham Reboot", "EVOL"};
		
    String tamilMovies[] = {"Payanigal Gavanikkavum", "Pothanur Thabal Nilayam", "Rathasaatchi", "Sevappi",
        "Sila Nerangalil", "Maalai Nera Mallipoo", "Ippadiku Kadhal", "Lineman",
        "Alappuzha Gymkhana", "Vikram Vedha Tamil", "Kaithi Tamil", "Master Tamil",
        "Doctor Tamil Dub", "Don Tamil Dub", "96 Tamil Dub", "Asuran Tamil Dub",
        "Karnan Tamil Dub", "Jagame Thandhiram Tamil", "Bigil Tamil Dub", "Nerkonda Paarvai"};
		
    String hindiMovies[] = {"RRR Hindi", "KGF Chapter 2 Hindi", "Kantara Hindi", "Pushpa Hindi",
        "Ala Vaikunthapurramuloo Hindi", "Jersey Hindi", "Shyam Singha Roy Hindi",
        "Sarkaru Vaari Paata Hindi", "F3 Hindi", "DJ Tillu Hindi",
        "Karthikeya 2 Hindi", "Liger Hindi", "Acharya Hindi", "Waltair Veerayya Hindi",
        "Bholaa Shankar Hindi", "Jailer Hindi", "Leo Hindi", "Salaar Hindi Preview",
        "Guntur Kaaram Hindi", "Tillu Square Hindi"};
		
    String malayalamMovies[]= {"Premalu Telugu Dub", "Manjummel Boys Telugu Dub", "2018 Telugu Dub",
        "Drishyam 2 Telugu Dub", "Lucifer Telugu Dub", "Minnal Murali Telugu Dub",
        "Kurup Telugu Dub", "Cold Case Telugu Dub", "Abraham Ozler Telugu Dub",
        "Guruvayoor Ambalanadayil Telugu Dub", "Kaathal Telugu Dub", "Nna Thaan Case Kodu Telugu Dub",
        "Gaganachari Telugu Dub", "Aattam Telugu Dub", "Ela Veezha Poonchira Telugu Dub",
        "Anweshippin Kandethum Telugu Dub", "Bramayugam Telugu Dub", "Romancham Telugu Dub",
        "Kumbalangi Nights Telugu Dub", "Malayankunju Telugu Dub"};
		
    String kannadaMovies[] = {"Kantara Telugu Dub", "Sapta Sagaradaache Ello Telugu Dub", "777 Charlie Telugu Dub",
        "Mufti Telugu Dub", "Avatar Purush Telugu Dub", "Gandhada Gudi Telugu Dub",
        "Kranti Telugu Dub", "Kabzaa Telugu Dub", "Ghost Telugu Dub", "Roberrt Telugu Dub",
        "Pogaru Telugu Dub", "James Telugu Dub", "Bheema Telugu Dub", "Yuva Rajakumara Telugu Dub",
        "Kirik Party Telugu Dub", "Tagaru Telugu Dub", "Avane Srimannarayana Telugu Dub",
        "Ugramm Telugu Dub", "Rathnan Preshtha Puthali Telugu Dub", "Rishab Shetty Specials"};
		
		int size = hindiMovies.length;
System.out.println("The number of movies available are: "+size);
System.out.println("The list of Hindi movies are: ");

for(String movieName : hindiMovies){
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
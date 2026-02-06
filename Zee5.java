class Zee5{
 public static void main(String[] args) {
   
   String hindiMovies[] = {"Sirf Ek Bandaa Kaafi Hai", "Tarla", "Haddi", "Kadak Singh", "Lantrani","Woh Bhi Din The", "Silence 2","Rautu Ka Raaz",
		"Kakuda", "Berlin","Love Sitara", "Despatch", "Hisaab Barabar", "Mrs", "Logout","Costao", "Interrogation", "Detective Sherdil", "Kaalidhar Laapata", "Tehran"};
   
   String teluguMovies[]= {"Malli Modalaindi", "Kinnerasani", "Prema Vimanam", "Rangabali", "Writer Padmabhushan","DASARA", "Karthikeya 2", "DJ Tillu",
		"F3", "Stand Up Rahul","Mem Famous", "Bhola Shankar", "Jailer Telugu", "Bro", "Skanda","Tiger Nageswara Rao", "Chaitanya", "Vivaha Bhojanambu", "Balagam", "Das Ka Dhamki"};
   
   String tamilMovies[]= {"Vikram Vedha Tamil", "Kaithi Tamil", "Master Tamil", "Doctor Tamil", "Don Tamil","Sarpatta Parambarai", "Vikram", "Jailer Tamil",
		"Leo Tamil", "Indian 2 Tamil","Thangalaan", "Garudan", "Por Thozhil", "Sardar", "Vidaa Muyarchi","L2: Empuraan", "Mission Chapter 1", "Lal Salaam", "Captain Miller", "Ayothi"};
   
   String malayalamMovies[] = {"Drishyam 2 ", "Lucifer ", "Minnal Murali", "Kurup", "12th Man","Forensic", "Cold Case", "Ela Veezha Poonchira",
		"Abraham Ozler", "Guruvayoor Ambalanadayil","Aattam", "Kaathal", "Nna Thaan Case Kodu", "Premalu", "Manjummel Boys","Gaganachari", "Bramayugam", 
		"Malayankunju", "Romancham", "2018 Malayalam"};
    
	String marathiMovies[]= {"Avwanchhit", "Sairat", "Seduwa", "Bucket List", "Pune Highway","Carry On Maratha", "Ata Thambaycha Naay", "Zollywood", "Fandry", "Natsamrat",
        "Sammohan", "Ajinkya", "Double Seat", "Chi Chi Chi", "Yatra","Panchlan", "Kapela", "Paru Ulajhang", "Suryachi Pemba", "Kulbhushan"};
   
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
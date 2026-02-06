class Spotify{
public static void main(String[] songs){

String songsName[]={"Mungaru male","Neenade Naa","Bhramhakalasha","Yaare kugadali","Maleye Maleye","Kalank"};

String mungaruMale = songsName[0];

String neenadeNaa = songsName[1];

String bhramhakalsha = songsName[2];

int size = songsName.length;
System.out.println("The number of songs available are: "+size);
System.out.println("The list of Songs are: ");

System.out.println(mungaruMale+" "+neenadeNaa+" "+bhramhakalsha);

for(String songNames : songsName){
 System.out.println(songNames);
}
}
}
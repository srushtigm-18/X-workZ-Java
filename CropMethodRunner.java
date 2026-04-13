class CropMethodRunner {

public static void main(String[] food) {
	
System.out.println("Seasonal crop details: ");
Season season = new Season();
       
season.seasonId = 6658;
season.seasonName = "Rabi";
season.cropType = "Tomato";
 season.duration = "120-150 days";
season.yield = 25.0;
		
Crop crop = new Crop(2, season);
crop.getDetails();
}
}
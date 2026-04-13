class CropObjRunner {

public static void main(String[] food) {
	
System.out.println("Crop details: ");
Season season = new Season();
		
Crop crop = new Crop(1, season);

season.seasonId = 24;
season.seasonName = "Kharif";
season.cropType = "Ragi (Finger Millet)";
season.duration = "90-120 days";
season.yield = 1.5;
		
crop.getDetails();

}
}
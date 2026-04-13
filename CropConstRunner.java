class CropConstRunner {

public static void main(String[] food) {

Season season = new Season();
season.seasonId = 403;
season.seasonName = "Zaid";
season.cropType = "Okra";
season.duration = "60-75 days";
season.yield = 12.0;

Crop crop = new Crop(3, season);
crop.getDetails();


}
}
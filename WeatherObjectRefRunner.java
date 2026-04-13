class WeatherObjectRefRunner {

    public static void main(String[] args) {
	
        System.out.println("Weater deatils: ");
		
        Climate climate = new Climate();
        Weather weather = new Weather(1, climate);
		
        climate.climateId = 18;
        climate.type = "Summer";
        climate.temperature = 34.5;
        climate.condition = "Sunny";
        climate.humidity = 45;
        weather.getDetails();
    }
}
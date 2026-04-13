class WeatherMethodRefRunner {


    public static void main(String[] args) {
	

        Climate climate = new Climate();
        climate.climateId = 21;
        climate.type = "Monsoon";
        climate.temperature = 26.8;
        climate.condition = "Rainy";
        climate.humidity = 85;
		
        Weather weather = new Weather(2, climate);
        weather.getDetails();

    }
}
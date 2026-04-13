class WeatherConstRefRunner {

    public static void main(String[] args) {

        Climate climate = new Climate();
        climate.climateId = 11;
        climate.type = "Winter";
        climate.temperature = 22.1;
        climate.condition = "Partly Cloudy";
        climate.humidity = 60;
        Weather weather = new Weather(3, climate);
        weather.getDetails();

    }
}
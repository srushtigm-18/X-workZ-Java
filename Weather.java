class Weather {

    int weatherId;
    Climate climate;
    
    Weather(int weatherId, Climate climate) {
        this.weatherId = weatherId;
        this.climate = climate;
    }
    
    public void getDetails() {
		
        System.out.println("Weather id is: " + this.weatherId);
        System.out.println("Climate id is: " + this.climate.climateId);
        System.out.println("Climate type is: " + this.climate.type);
        System.out.println("Climate temperature is: " + this.climate.temperature + " C");
        System.out.println("Climate condition is: " + this.climate.condition);
        System.out.println("Climate humidity is: " + this.climate.humidity + "%");
    }
}
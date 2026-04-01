class GpsDetails {

    private int gpsId;
    private String deviceId;
    private double latitude;
    private double longitude;
    private double speedKmh;
    private String timestamp;
    private String locationStatus;

    public void setGpsId(int gpsId) {
        this.gpsId = gpsId;
    }
    public int getGpsId() {
        return this.gpsId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLatitude() {
        return this.latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLongitude() {
        return this.longitude;
    }

    public void setSpeedKmh(double speedKmh) {
        this.speedKmh = speedKmh;
    }
    public double getSpeedKmh() {
        return this.speedKmh;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }
    public String getLocationStatus() {
        return this.locationStatus;
    }
}
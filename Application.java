class Application {
    int appId;
    String appName;
    String version;
    long downloadCount;
    double rating;
    int sizeMB;

    public void getApplicationDetails() {
        System.out.println("App ID: " + this.appId);
        System.out.println("Name: " + this.appName);
        System.out.println("Version: " + this.version);
        System.out.println("Downloads: " + this.downloadCount + "M");
        System.out.println("Rating: " + this.rating + "/5");
        System.out.println("Size: " + this.sizeMB + "MB");
    }
}

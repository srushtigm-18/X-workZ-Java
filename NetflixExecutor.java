class NetflixExecutor {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();

        netflix.addWebSeries("Stranger Things");
        netflix.addWebSeries("The Crown");
        netflix.addWebSeries("Dark");
        netflix.addWebSeries("Ozark");
        netflix.addWebSeries("The Witcher");
        netflix.addWebSeries("Money Heist");
        netflix.addWebSeries("Squid Game");
        netflix.addWebSeries("Bridgerton");
        netflix.addWebSeries("The Queen's Gambit");
        netflix.addWebSeries("Wednesday");
        netflix.addWebSeries("Lupin");
        netflix.addWebSeries("The Umbrella Academy");
        netflix.addWebSeries("Peaky Blinders");
        netflix.addWebSeries("Elite");
        netflix.addWebSeries("The Haunting of Hill House");
        netflix.addWebSeries("Mindhunter");
        netflix.addWebSeries("Orange is the New Black");
        netflix.addWebSeries("Breaking Bad");

        netflix.getWebSeries();
        System.out.println();

        int index = 3;
        String series = netflix.getWebSeriesNameByIndex(index);
        System.out.println("The web series at index " + index + " is: " + series);
        System.out.println();

        String seriesName = "Elite";
        int i = netflix.getIndexByWebSeriesName(seriesName);
        System.out.println("Web series '" + seriesName + "' is at index: " + i);
        System.out.println();

        String updated = "Elite (Season 6)";
        boolean ref = netflix.updateWebSeries("Elite", updated);
        netflix.getWebSeries();
        System.out.println();

        String deleting = "Mindhunter";
        boolean reff = netflix.deleteWebSeries(deleting);
        netflix.getWebSeries();
    }
}
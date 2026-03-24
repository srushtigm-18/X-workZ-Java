class Netflix {

    private String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String seriesName) {
        boolean isSeriesAdded = false;

        if (seriesName != null && !seriesName.isEmpty()) {
            if (index < webSeries.length) {
                webSeries[index] = seriesName;
                index++;
                isSeriesAdded = true;
            } else {
                System.out.println(seriesName + " cannot be added. Array is full (max 18).");
            }
        } else {
            System.out.println(seriesName + " is invalid");
        }
        return isSeriesAdded;
    }

    public void getWebSeries() {
        for (String series : webSeries) {
            if (series != null) {
                System.out.println(series);
            }
        }
    }
}

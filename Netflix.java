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
            System.out.println(seriesName + " is invalid.");
        }
        return isSeriesAdded;
    }



    public void getWebSeries() {
        System.out.println("Netflix web series:");
        for (String series : webSeries) {
            if (series != null) {
                System.out.println(series);
            }
        }
    }



    public String getWebSeriesNameByIndex(int idx) {
        String series = null;
        if (idx < webSeries.length && webSeries[idx] != null) {
            series = webSeries[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return series;
    }



    public int getIndexByWebSeriesName(String seriesName) {
        for (int i = 0; i < index; i++) {
            if (webSeries[i] != null && webSeries[i].equals(seriesName)) {
                return i;
            }
        }
        System.out.println("Web series '" + seriesName + "' not found.");
        return 0;
    }



    public boolean updateWebSeries(String existingSeries, String newSeries) {
        boolean isUpdated = false;
        if (newSeries == null && newSeries.isEmpty()) {
            System.out.println(newSeries + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (webSeries[i] != null && webSeries[i].equals(existingSeries)) {
                webSeries[i] = newSeries;
                isUpdated = true;
            }
        }
        if (!isUpdated) {
            System.out.println("Web series '" + existingSeries + "' not found to update.");
        }
        return isUpdated;
    }



    public boolean deleteWebSeries(String deletingSeries) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (webSeries[i] != null && webSeries[i].equals(deletingSeries)) {
                for (int j = i; j < index - 1; j++) {
                    webSeries[j] = webSeries[j + 1];
                }
                webSeries[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Web series '" + deletingSeries + "' not found to delete.");
        }
        return isDeleted;
    }
}
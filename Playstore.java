class Playstore {
    static String appName;
    static String developer;
    static String category;
    static String version;
    static String packageName;
    static long downloads;
    static double rating;
    static String lastUpdated;
    static String contentRating;

    public static boolean createApp(String appNameInput, String devName, String appCategory, 
                                   String appVersion, String pkgName, long appDownloads, 
                                   double appRating, String updateDate, String ratingType) {
        boolean isAppCreated = false;

        boolean isAppNameValid = false;
        boolean isDeveloperValid = false;
        boolean isCategoryValid = false;
        boolean isVersionValid = false;
        boolean isPackageNameValid = false;
        boolean isDownloadsValid = false;
        boolean isRatingValid = false;
        boolean isLastUpdatedValid = false;
        boolean isContentRatingValid = false;

        if (appNameInput != null && !appNameInput.isEmpty()) {
            appName = appNameInput;
            isAppNameValid = true;
        } else {
            System.out.println("The app name is not valid");
        }

        if (devName != null && !devName.isEmpty()) {
            developer = devName;
            isDeveloperValid = true;
        } else {
            System.out.println("The developer name is not valid");
        }

        if (appCategory != null && !appCategory.isEmpty()) {
            category = appCategory;
            isCategoryValid = true;
        } else {
            System.out.println("The category is not valid");
        }

        if (appVersion != null && !appVersion.isEmpty()) {
            version = appVersion;
            isVersionValid = true;
        } else {
            System.out.println("The version is not valid");
        }

        if (pkgName != null && !pkgName.isEmpty()) {
            packageName = pkgName;
            isPackageNameValid = true;
        } else {
            System.out.println("The package name is not valid");
        }

        if (appDownloads > 0) {
            downloads = appDownloads;
            isDownloadsValid = true;
        } else {
            System.out.println("The downloads count is not valid");
        }

        if (appRating >= 0 && appRating <= 5.0) {
            rating = appRating;
            isRatingValid = true;
        } else {
            System.out.println("The rating must be between 0 and 5.0");
        }

        if (updateDate != null && !updateDate.isEmpty()) {
            lastUpdated = updateDate;
            isLastUpdatedValid = true;
        } else {
            System.out.println("The last updated date is not valid");
        }

        if (ratingType != null && !ratingType.isEmpty()) {
            contentRating = ratingType;
            isContentRatingValid = true;
        } else {
            System.out.println("The content rating is not valid");
        }

        if (isAppNameValid && isDeveloperValid && isCategoryValid && isVersionValid && 
            isPackageNameValid && isDownloadsValid && isRatingValid && 
            isLastUpdatedValid && isContentRatingValid) {
            isAppCreated = true;
        }
        return isAppCreated;
    }

    public static void getAppDetails() {
        System.out.println(" App Details are:");
        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developer);
        System.out.println("Category: " + category);
        System.out.println("Version: " + version);
        System.out.println("Package Name: " + packageName);
        System.out.println("Downloads: " + downloads + "+");
        System.out.println("Rating: " + rating + " ★");
        System.out.println("Last Updated: " + lastUpdated);
        System.out.println("Content Rating: " + contentRating);
       
    }
}


class Article {
    int articleId;
    String headline;
    String byline;
    String category;
    String date;

    public void getArticleDetails() {
        System.out.println("Article ID: " + this.articleId);
        System.out.println("Headline: " + this.headline);
        System.out.println("Byline: " + this.byline);
        System.out.println("Category: " + this.category);
        System.out.println("Date: " + this.date);
    }
}

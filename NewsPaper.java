class NewsPaper {
    String paperName;
    int paperId;
    String city;
    String editor;
    Article article;

    public NewsPaper(int paperId,String paperName,  String city, String editor, Article article) {
        this.paperName = paperName;
        this.paperId = paperId;
        this.city = city;
        this.editor = editor;
        this.article = article;
    }

    public void getPaperDetails() {
        System.out.println("Newspaper: " + this.paperName);
        System.out.println("ID: " + this.paperId);
        System.out.println("City: " + this.city);
        System.out.println("Editor: " + this.editor);
        this.article.getArticleDetails();
        System.out.println("\n");
    }
}

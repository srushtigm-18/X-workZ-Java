class NewsPaper {
    String paperName;
    int paperId;
    String city;
    String editor;
    Article article;

    public void getPaperDetails() {
        System.out.println("Newspaper: " + this.paperName);
        System.out.println("ID: " + this.paperId);
        System.out.println("City: " + this.city);
        System.out.println("Editor: " + this.editor);
        this.article.getArticleDetails();
        System.out.println("\n");
    }
}


class ProgrammingLanguage {
    String languageName;
    int languageId;
    String paradigm;
    String year;
    Syntax syntax;

    public void getLanguageDetails() {
        System.out.println("Language: " + this.languageName);
        System.out.println("ID: " + this.languageId);
        System.out.println("Paradigm: " + this.paradigm);
        System.out.println("Year: " + this.year);
        this.syntax.getSyntaxDetails();
        System.out.println("\n");
    }
}


class Syntax {
    int syntaxId;
    String declaration;
    String endStatement;
    String comment;
    String mainFunction;

    public void getSyntaxDetails() {
        System.out.println("Syntax ID: " + this.syntaxId);
        System.out.println("Declaration: " + this.declaration);
        System.out.println("End: " + this.endStatement);
        System.out.println("Comment: " + this.comment);
        System.out.println("Main: " + this.mainFunction);
    }
}

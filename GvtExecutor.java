class GvtExecutor {
    public static void main(String[] args) {
        Gvt gvt = new Gvt();

        gvt.addCompetitiveExample("UPSC");
        gvt.addCompetitiveExample("SSC CGL");
        gvt.addCompetitiveExample("IBPS PO");
        gvt.addCompetitiveExample("RRB NTPC");
        gvt.addCompetitiveExample("Railway Group D");
        gvt.addCompetitiveExample("State PSC");
        gvt.addCompetitiveExample("TET");
        gvt.addCompetitiveExample("NET");
        gvt.addCompetitiveExample("KAS");

        gvt.getCompetitiveExamples();
    }
}

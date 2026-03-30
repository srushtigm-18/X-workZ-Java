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
System.out.println();

int index = 0;
String exam = gvt.getCompetitiveExampleByIndex(index);
System.out.println("The exam at index " + index + " is: " + exam);
System.out.println();

 String examName = "NET";
int i = gvt.getIndexByCompetitiveExamName(examName);
System.out.println("The exam '" + examName + "' is at index: " + i);
System.out.println();

String updated = "NET (UGC‑NET)";
boolean ref = gvt.updateCompetitiveExam("NET", updated);
gvt.getCompetitiveExamples();
System.out.println();

String deleting = "TET";
boolean reff = gvt.deleteCompetitiveExam(deleting);
gvt.getCompetitiveExamples();
}
}
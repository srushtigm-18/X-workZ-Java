class Gvt {

    private String competitiveExamples[] = new String[9];   
    int index;

    public boolean addCompetitiveExample(String exam) {
        boolean isAdded = false;

        if (exam != null && !exam.isEmpty()) {
                competitiveExamples[index] = exam;
                index++;
                isAdded = true;
           
        } else {
            System.out.println(exam + " is invalid");
        }
        return isAdded;
    }

    public void getCompetitiveExamples() {
        for (String exams : competitiveExamples) {
                System.out.println(exams);
            
        }
    }
}

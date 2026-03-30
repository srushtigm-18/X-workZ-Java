class Gvt {

    private String competitiveExams[] = new String[9];
    int index;

    public boolean addCompetitiveExample(String exam) {
        boolean isAdded = false;
        if (exam != null && !exam.isEmpty()) {
          
		  if (index < competitiveExams.length) {
                competitiveExams[index] = exam;
                index++;
                isAdded = true;
            } else {
                System.out.println("Array is full.");
            }
        } else {
            System.out.println(exam + " is invalid.");
        }
        return isAdded;
    }
	
	

    public void getCompetitiveExamples() {
        System.out.println("Competitive exams:");
        for (String ex : competitiveExams) {
            if (ex != null) {
                System.out.println(ex);
            }
        }
    }
	
	
	

    public String getCompetitiveExampleByIndex(int idx) {
        if (idx < competitiveExams.length && competitiveExams[idx] != null) {
            return competitiveExams[idx];
        } else {
            System.out.println("Invalid index: " + idx);
            return null;
        }
    }

    public int getIndexByCompetitiveExamName(String examName) {
        for (int i = 0; i < index; i++) {
            if (competitiveExams[i] != null && competitiveExams[i].equals(examName)) {
                return i;
            }
        }
        System.out.println("Exam '" + examName + "' not found.");
        return 0;
    }

    public boolean updateCompetitiveExam(String existingExam, String newExam) {
        boolean isUpdated = false;
        if (newExam == null && newExam.isEmpty()) {
            System.out.println(newExam + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (competitiveExams[i] != null && competitiveExams[i].equals(existingExam)) {
                competitiveExams[i] = newExam;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Exam '" + existingExam + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteCompetitiveExam(String deletingExam) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (competitiveExams[i] != null && competitiveExams[i].equals(deletingExam)) {
                for (int j = i; j < index - 1; j++) {
                    competitiveExams[j] = competitiveExams[j + 1];
                }
                competitiveExams[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Exam '" + deletingExam + "' not found to delete.");
        }
        return isDeleted;
    }
}
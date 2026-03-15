class Diabetes {
    int id;
    String name;
    String type;
    boolean insulinDependent;
    String symptoms;
    String cause;
    String treatment;
    int ageOnset;
    double fastingGlucose;
    double hba1c;
    boolean familyHistory;
    String medication;
    String diet;
    boolean exercise;
    int complications;
    String doctor;
    String hospital;
    boolean controlled;
    int monitoringFrequency;
    double insulinDose;
    String status;
    String riskLevel;
    
    Diabetes(int id, String name, String type, boolean insulinDependent, String symptoms, 
             String cause, String treatment, int ageOnset, double fastingGlucose, double hba1c, 
             boolean familyHistory, String medication, String diet, boolean exercise, 
             int complications, String doctor, String hospital, boolean controlled, 
             int monitoringFrequency, double insulinDose, String status, String riskLevel) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.insulinDependent = insulinDependent;
        this.symptoms = symptoms;
        this.cause = cause;
        this.treatment = treatment;
        this.ageOnset = ageOnset;
        this.fastingGlucose = fastingGlucose;
        this.hba1c = hba1c;
        this.familyHistory = familyHistory;
        this.medication = medication;
        this.diet = diet;
        this.exercise = exercise;
        this.complications = complications;
        this.doctor = doctor;
        this.hospital = hospital;
        this.controlled = controlled;
        this.monitoringFrequency = monitoringFrequency;
        this.insulinDose = insulinDose;
        this.status = status;
        this.riskLevel = riskLevel;
    }
    
    public void getDiabetesDetails(){
        System.out.println("The diabetes id is "+this.id);
        System.out.println("The patient name is "+this.name);
        System.out.println("The diabetes type is "+this.type);
        System.out.println("The patient is insulin dependent?.."+this.insulinDependent);
        System.out.println("The symptoms are "+this.symptoms);
        System.out.println("The cause is "+this.cause);
        System.out.println("The treatment is "+this.treatment);
        System.out.println("The age of onset is "+this.ageOnset);
        System.out.println("The fasting glucose is "+this.fastingGlucose);
        System.out.println("The HbA1c is "+this.hba1c);
        System.out.println("The family history exists?.."+this.familyHistory);
        System.out.println("The medication is "+this.medication);
        System.out.println("The diet plan is "+this.diet);
        System.out.println("The patient exercises?.."+this.exercise);
        System.out.println("The complications count is "+this.complications);
        System.out.println("The doctor is "+this.doctor);
        System.out.println("The hospital is "+this.hospital);
        System.out.println("The condition is controlled?.."+this.controlled);
        System.out.println("The monitoring frequency is "+this.monitoringFrequency);
        System.out.println("The insulin dose is "+this.insulinDose);
        System.out.println("The current status is "+this.status);
        System.out.println("The risk level is "+this.riskLevel);
        System.out.println("\n");
    }
}



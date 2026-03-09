class LabourExecutor {
    public static void main(String[] args) {
        // Labour 1
        Labour labour1 = new Labour();
        labour1.name = "Ramesh Kumar";
        labour1.salary = 25000.00;
        labour1.idProofs = "Aadhar,PF,ESI";
        
        System.out.println("Labour Name: " + labour1.name);
        System.out.println("Labour Salary: " + labour1.salary);
        System.out.println("Labour ID Proofs: " + labour1.idProofs);
        System.out.println("-----------------------------");
        
        // Labour 2
        Labour labour2 = new Labour();
        labour2.name = "Suresh Patel";
        labour2.salary = 28000.00;
        labour2.idProofs = "Aadhar,PanCard,LabourCard";
        
        System.out.println("Labour Name: " + labour2.name);
        System.out.println("Labour Salary: " + labour2.salary);
        System.out.println("Labour ID Proofs: " + labour2.idProofs);
        System.out.println("-----------------------------");
        
        // Labour 3
        Labour labour3 = new Labour();
        labour3.name = "Anita Devi";
        labour3.salary = 22000.00;
        labour3.idProofs = "Aadhar,BankPassbook";
        
        System.out.println("Labour Name: " + labour3.name);
        System.out.println("Labour Salary: " + labour3.salary);
        System.out.println("Labour ID Proofs: " + labour3.idProofs);
        System.out.println("-----------------------------");
        
        // Labour 4
        Labour labour4 = new Labour();
        labour4.name = "Vijay Singh";
        labour4.salary = 30000.00;
        labour4.idProofs = "Aadhar,DL,LabourLicense";
        
        System.out.println("Labour Name: " + labour4.name);
        System.out.println("Labour Salary: " + labour4.salary);
        System.out.println("Labour ID Proofs: " + labour4.idProofs);
        System.out.println("-----------------------------");
    }
}

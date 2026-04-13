class Prison {

int prisonId;

Criminal criminal;
    
Prison(int prisonId, Criminal criminal) {
        this.prisonId = prisonId;
        this.criminal = criminal;
}
    
public void getDetails() {
System.out.println("Prison id is: " + this.prisonId);
System.out.println("Criminal id is: " + this.criminal.criminalId);
System.out.println("Criminal name is: " + this.criminal.name);
System.out.println("Criminal crime is: " + this.criminal.crime);
System.out.println("Criminal sentence is: " + this.criminal.sentence);
System.out.println("Criminal cellNumber is: " + this.criminal.cellNumber);

}
}
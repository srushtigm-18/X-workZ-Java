class TrafficSignal {
	
    int signalId;
    Cop cop;
    
    TrafficSignal(int signalId, Cop cop) {
        this.signalId = signalId;
        this.cop = cop;
    }
    
    public void getDetails() {
		
        System.out.println("TrafficSignal id is: " + this.signalId);
        System.out.println("Cop id is: " + this.cop.copId);
        System.out.println("Cop name is: " + this.cop.name);
        System.out.println("Cop badgeNumber is: " + this.cop.badgeNumber);
        System.out.println("Cop shift is: " + this.cop.shift);
        System.out.println("Cop location is: " + this.cop.location);

}
}

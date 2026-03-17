class CCD {
    String chainName;
    int outletId;
    String location;
    String founded;
    Coffee coffee;
	CCD( int outletId,String chainName,String location,String founded,Coffee coffee){
		
		this.chainName = chainName;
        this.outletId = outletId;
        this.location = location;
       this.founded = founded;
	   this.coffee = coffee;
		
	}

    public void getCCDDetails() {
        System.out.println("Chain: " + this.chainName);
        System.out.println("Outlet ID: " + this.outletId);
        System.out.println("Location: " + this.location);
        System.out.println("Founded: " + this.founded);
        coffee.getCoffeeDetails();
        System.out.println("\n");
    }
}


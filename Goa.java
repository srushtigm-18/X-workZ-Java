class Goa {

    private String beachNames[] = new String[19];   
    int index;

    public boolean addBeach(String beach) {
        boolean isAdded = false;

        if (beach != null && !beach.isEmpty()) {
                beachNames[index] = beach;
                index++;
                isAdded = true;
           
        } else {
            System.out.println(beach + " is invalid");
        }
        return isAdded;
    }

    public void getBeaches() {
        for (String b : beachNames) {
                System.out.println(b);
            }
        
    }
}

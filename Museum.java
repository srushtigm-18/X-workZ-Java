class Museum {

    private String historicalMonument[] = new String[16];  
    int index;

    public boolean addMonument(String monument) {
        boolean isAdded = false;

        if (monument != null && !monument.isEmpty()) {
                historicalMonument[index] = monument;
                index++;
                isAdded = true;
          
        } else {
            System.out.println(monument + " is invalid");
        }
        return isAdded;
    }

    public void getMonuments() {
        for (String m : historicalMonument) {
           
                System.out.println(m);
            }
        
    }
}

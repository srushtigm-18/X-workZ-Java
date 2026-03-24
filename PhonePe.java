class PhonePe {

    private String insurance[] = new String[27];   
    int index;

    public boolean addInsurance(String planName) {
        boolean isAdded = false;

        if (planName != null && !planName.isEmpty()) {
            
                insurance[index] = planName;
                index++;
                isAdded = true;
          
        } else {
            System.out.println(planName + " is invalid");
        }
        return isAdded;
    }

    public void getInsurance() {
        for (String plan : insurance) {
           
                System.out.println(plan);
            
        }
    }
}

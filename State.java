class State {

    private String highways[] = new String[9];   
    int index;

    public boolean addHighway(String highway) {
        boolean isAdded = false;

        if (highway != null && !highway.isEmpty()) {
                highways[index] = highway;
                index++;
                isAdded = true;
           
        } else {
            System.out.println(highway + " is invalid");
        }
        return isAdded;
    }

    public void getHighways() {
        for (String h : highways) {
                System.out.println(h);
            }
        }
    }

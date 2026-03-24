class RCB {

    private String playerNames[] = new String[15];   
    int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;

        if (player != null && !player.isEmpty()) {
                playerNames[index] = player;
                index++;
                isAdded = true;
           
        } else {
            System.out.println(player + " is invalid");
        }
        return isAdded;
    }

    public void getPlayers() {
        for (String p : playerNames) {
                System.out.println(p);
            }
        }
    }


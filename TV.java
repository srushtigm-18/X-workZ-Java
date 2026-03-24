class TV {

    private String channelName[] = new String[17];
    int index;

    public boolean addChannel(String channel) {
        boolean isAdded = false;

        if (channel != null && !channel.isEmpty()) {
                channelName[index] = channel;
                index++;
                isAdded = true;
          
        } else {
            System.out.println(channel + " is invalid");
        }
        return isAdded;
    }

    public void getChannels() {
        for (String ch : channelName) {
                System.out.println(ch);
            
        }
    }
}

class TV {

    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channel) {
        boolean isAdded = false;

        if (channel != null && !channel.isEmpty()) {
                channelNames[index] = channel;
                index++;
                isAdded = true;
          
        } else {
            System.out.println(channel + " is invalid");
        }
        return isAdded;
    }

    public void getChannels() {
        for (String ch : channelNames) {
                System.out.println(ch);
            
        }
    }
	
	public String getChannelByIndex(int index){
		String channelName = null;
		if(index < channelNames.length){
			channelName = channelNames[index];
		}else {
			System.out.println("invalid index "+channelName);
		}
		return channelName;
	}
	public int getIndexByChannel(String channel){
		int index = 0;
		for(String chName:channelNames){
			if(channel.equals(channelNames)){
				return index;
			}
			
		index++;
		}
		return 0;
	}
	
	
    public boolean updateChannel(String existingChannel, String newChannel) {
        boolean isUpdated = false;
          for (int i = 0; i < channelNames.length; i++) {
            if (channelNames[i] != null && channelNames[i].equals(existingChannel)) {
                channelNames[i] = newChannel;
                isUpdated = true;
               }
        }
        return isUpdated;
    }
    public boolean deleteChannel(String deletingchannel) {
        boolean isDeleted = false;

        for (int i = 0; i < channelNames.length; i++) {
            if (channelNames[i] != null && channelNames[i].equals(deletingchannel)) {
               
                for (int j = i; j < channelNames.length - 1; j++) {
                    channelNames[j] = channelNames[j + 1];
                }
                channelNames[channelNames.length  - 1] = null;
                isDeleted = true;
                index--;
            }
        }
        return isDeleted;
    }
}
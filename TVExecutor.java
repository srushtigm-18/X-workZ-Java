class TVExecutor {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.addChannel("Star Sports");
        tv.addChannel("Sony Sports");
        tv.addChannel("Star Plus");
        tv.addChannel("Star Maa");
        tv.addChannel("Sun TV");
        tv.addChannel("ETV");
        tv.addChannel("Zee TV");
        tv.addChannel("Discovery Channel");
        tv.addChannel("National Geographic");
        tv.addChannel("Comedy Central");
        tv.addChannel("Sony Mix");
        tv.addChannel("AXN");
        tv.addChannel("MTV India");
        tv.addChannel("Cartoon Network");
        tv.addChannel("Disney Channel");
        tv.addChannel("Epic Channel");
        tv.addChannel("TV9 News");

        tv.getChannels();
		
		int index = 7;
		String channel = tv.getChannelByIndex(index);
		System.out.println("The tv channel of index "+index+" is "+channel);
		
		String channelName = "Star Maa";
		index = tv.getIndexByChannel(channelName);
		System.out.println("the channel for index "+index+" is "+channelName);
		
		System.out.println();

        String updatedChannel = "Colors Kannada";
        boolean ref =tv.updateChannel("ETV",updatedChannel);
        System.out.println("The ETV is updated to "+ updatedChannel);
        tv.getChannels();

        System.out.println();

        String channelNameIs = "AXN" ;
        boolean reff = tv.deleteChannel(channelNameIs);
        System.out.println("The "+ channelNameIs+" is deleted ");                
        tv.getChannels();   
}
}

class Frame {
    int frameId;
    String frameType;
    String size;
    int bridgeWidth;
    double price;

    public void getFrameDetails() {
        System.out.println("Frame ID: " + this.frameId);
        System.out.println("Type: " + this.frameType);
        System.out.println("Size: " + this.size);
        System.out.println("Bridge: " + this.bridgeWidth + "mm");
        System.out.println("Price: " + this.price + "K");
    }
}
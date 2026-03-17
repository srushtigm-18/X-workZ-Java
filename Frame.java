class Frame {
    int frameId;
    String frameType;
    String size;
    int bridgeWidth;
    double price;

    public Frame(int frameId, String frameType, String size, int bridgeWidth, double price) {
        this.frameId = frameId;
        this.frameType = frameType;
        this.size = size;
        this.bridgeWidth = bridgeWidth;
        this.price = price;
    }

    public void getFrameDetails() {
        System.out.println("Frame ID: " + this.frameId);
        System.out.println("Type: " + this.frameType);
        System.out.println("Size: " + this.size);
        System.out.println("Bridge: " + this.bridgeWidth + "mm");
        System.out.println("Price: " + this.price + "K");
    }
}

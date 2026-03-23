class CameraRunner {
    public static void main(String[] args) {
       
        DSLR dslr = new DSLR();
        dslr.setBrand("Nikon D850");
        System.out.println(dslr.getCameraInfo());
    }
}

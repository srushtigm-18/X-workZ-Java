class DigitalCameraExecutor {
    public static void main(String[] power) {
        DigitalCamera.switchPower();
        System.out.println("Power status: " + DigitalCamera.batteryStatus);
        DigitalCamera.increaseZoom(); 
        DigitalCamera.increaseZoom();
        DigitalCamera.decreaseZoom();
        System.out.println("Final zoom: " + DigitalCamera.currentZoom);
    }
}

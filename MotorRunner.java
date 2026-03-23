class MotorRunner {
    public static void main(String[] args) {
       
        ElectronicMotor motor = new ElectronicMotor();
        motor.setBrand("Siemens");
        System.out.println(motor.getMotorInfo());
    }
}

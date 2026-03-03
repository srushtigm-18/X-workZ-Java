class DoloExecutor {
    public static void main(String[] args) {
        Dolo medicine = new Dolo();
        medicine.medicineId = 650;
        medicine.tabletStrength = 650.0;
        medicine.prescriptionRequired = false;
        medicine.available = true;
        medicine.batchNumber = "DOL026001";
        medicine.expiryMonth = "12/2027";
        medicine.batchExpired = false;

        System.out.println("Medicine ID: " + medicine.medicineId);
        System.out.println("Strength: " + medicine.tabletStrength + "mg");
        System.out.println("Batch Number: " + medicine.batchNumber);
        System.out.println("Expiry: " + medicine.expiryMonth);
    }
}

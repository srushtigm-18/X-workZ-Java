class CloudRunner {
    public static void main(String[] args) {
       
        AWS aws = new AWS();
        aws.setProvider("Amazon Web Services");
        System.out.println(aws.getCloudInfo());
    }
}
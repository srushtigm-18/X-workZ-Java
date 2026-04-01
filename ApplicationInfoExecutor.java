class ApplicationInfoExecutor{
//example class executor
public static void main(String[] apps){

ApplicationInfo appInfo = new ApplicationInfo();
appInfo.setAppId(111);
appInfo.setAppName("Instagram");
appInfo.setrRelesedOn("12/12/2012");
appInfo.setRequiredOs("android");
appInfo.setVersion("12.02.149");


System.out.println("App id is "+appInfo.getAppId());
System.out.println("App name is "+ appInfo.getAppName());
System.out.println("App released on "+appInfo.getRelesedOn());
System.out.println("App required OS is "+appInfo.getRequiredOs());
System.out.println("App version is "+appInfo.getVersion());


}
}
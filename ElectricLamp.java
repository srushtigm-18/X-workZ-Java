class ElectricLamp{
static boolean isConnected;
static boolean onOrOff(){

if(isConnected == true){
isConnected = true;
System.out.println("The lamp is on:");
}
else if(isConnected == false){
isConnected = false;
System.out.println("The lamp is Off:");
}
return isConnected;
}
}
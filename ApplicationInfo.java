class ApplicationInfo{
//example class

//encapsulation achieved by private keyword
private  int appId;
private String appName;
private String relesedOn;
private String requiredOs;
private String version;
private String offeredBy;
private String downloads;
private String purchase;


//set method to initialization and get method to read or get info along with the 'this' to access the private variable /in encapsulated class--> setters ond getters method 
public void setAppId(int appId){
 this.appId = appId;
}

public int getAppId(){
return this.appId;
}


public void setAppName(String appName){
	this.appName = appName;
}

public String getAppName(){
return this.appName;
}


public void setrRelesedOn(String relesedOn){
	this.relesedOn = relesedOn;
}
public String getRelesedOn(){
	return this.relesedOn;
}

public void setRequiredOs(String requiredOs){
	this.requiredOs = requiredOs;
}
public String getRequiredOs(){
	return this.requiredOs;
}

public void setVersion(String version){
	this.version=version;
}
public String getVersion(){
	return this.version;
}
}

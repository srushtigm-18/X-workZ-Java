class  PhoneSetting{

private int phoneId;
private String userName;
private int volume;
private int brightness;
private String version;
private String updatedOn;
private String sim;

public void setPhoneId(int phoneId){
this.phoneId = phoneId;
}
int getPhoneId(){
return this.phoneId;
}

public void setUserName(String userName){
this.userName = userName;
}
public String getUserName(){
return this.userName;
}

public void setVolume(int volume){
this.volume = volume;
}
public int getVolume(){
return this.volume;
}
public void setBrightness(int brightness){
this.brightness = brightness;
}
public int getBrightness(){
return this.brightness;
}
public void setVersion(String version){
this.version = version;
}
public String getVersion(){
return this.version;
}
public void setUpdateOn(String updatedOn){
this.updatedOn = updatedOn;
}
public String getUpdateOn(){
return this.updatedOn;
}
public void setSim(String sim){
this.sim = sim;
}
public String getSim(){
return this.sim;
}
}
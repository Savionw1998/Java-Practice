
public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public String getVersion() {
    	String Version = this.versionNumber;
    	return Version;
    }
    public String getCarrier() {
    	String carrier = this.carrier;
    	return carrier;
    }
    public abstract void displayInfo();
    
}

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String x = "Ring Ring Ring!";
		return x;
    }
    @Override
    public String unlock() {
		String x = "Unlocked using fingerprint!";
		return x;
    }
    @Override
    public void displayInfo() {
		System.out.println("Galaxy " + this.getVersion() + " from " + this.getCarrier());
    }
}
public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String x = "BZZZZZ";
    	return x;
    }
    @Override
    public String unlock() {
		String x = "Unlocked using facial scan!!";
		return x;
    }
    @Override
    public void displayInfo() {
		System.out.println("iPhone " + this.getVersion() + " from " + this.getCarrier());
    }
}

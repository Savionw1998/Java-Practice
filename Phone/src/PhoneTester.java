
public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("s9", 99, "Verizon", "Ring Ring Ring");
		IPhone iphoneTen = new IPhone("X", 99, "Sprint", "Bzzzz");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());

	}
}

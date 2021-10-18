package full_factory_method_pattern;

public class CandyStoreMain {
	
	private static final CandyFactory chocolateFactory = new ChocolateFactory();
	private static final CandyFactory hardCandyFactory = new HardCandyFactory();
	
	public static void main(String[] args) {
		chocolateFactory.getCandyPackage(7,"dark");
		hardCandyFactory.getCandyPackage(12, "lollipop");
		hardCandyFactory.getCandyPackage(50, "candy cane");
	}
}

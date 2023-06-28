import java.util.ArrayList;

public class ErgasiaEpiskeuhs {

	private String Name;
	private double Price;
	private ArrayList<ErgasiaEpiskeuhs> ergasiaEpiskeuhs = new ArrayList<>();


	/**
	 * 
	 * @param name
	 * @param price
	 */
	public ErgasiaEpiskeuhs(String name, double price) {
		this.name = name;
		this.price = price;
		
	}

	

	public String getName() {
		
		return ErgasiaEpiskeuhs;
	}

	
	public double getPrice() {
		
		return Price;
	}
	
	public void addErgasiaEpiskuhs(ErgasiaEpiskeuhs e) {
		ergasiaEpiskeuhs.add(e);
	}

}
import java.util.ArrayList;

public class TuposAntallaktikou {

	private String Type;
	private double Price;
	private ArrayList<TuposAntallaktikou> tuposAntallaktikwn = new ArrayList<>();

	/**
	 * 
	 * @param typos
	 */
	public TuposAntallaktikou(String typos) {
		// TODO - implement TuposAntallaktikou.TuposAntallaktikou
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public TuposAntallaktikou(String type, double price) {
		this.type = type;
		this.price = price;
	}

	

	public String getType() {
		return type;
	}

	

	public double getPrice() {
		return price;
	}

	public void addTuposAntallaktikou(TuposAntallaktikou a) {
		tuposAntallaktikwn.add(a);
	}
}
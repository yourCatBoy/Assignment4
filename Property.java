package property_managment_assignment4;

/*
 * The template here has been set according to the specifications provided in Property.html
 * 
 */
public class Property {
	private String name;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;

// Constructor class template
	public Property(String name, String city, double d, String owner, int x, int y, int width, int depth) {
		super();
		this.name = name;
		this.city = city;
		this.rentAmount = d;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}

	@Override
	public String toString() {
		return "\nProperty name=" + name + "\n Located in " + city + " \n Belonging to :" + owner + "\n Rent amount:"
				+ rentAmount;
	}

	public String getName() {
		return name;
	}
	
	public Plot getPlot() {
		return plot;
	}
	

	public String getCity() {
		return city;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public String getOwner() {
		return owner;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
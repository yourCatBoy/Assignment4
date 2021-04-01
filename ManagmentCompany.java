package property_managment_assignment4;

import java.util.Arrays;

public class ManagmentCompany {
//	Setting the number of maximum properties as constant to 5.
	private static final int MAX_PROPERTY = 5;
	
// Initializing strings and arrays for holding Field data 
	private double mgmtFee;
	private String name;
	private Property[] properties = new Property[MAX_PROPERTY];
	private String taxId;
	
// counter to check how many elements are added to the array
	private int propertyCount = 0;

// Constructor to initalize variables properly
	public ManagmentCompany(String companyName, String taxId, double mgmtFee) {
		this.name = companyName;
		this.taxId = taxId;
		this.mgmtFee = mgmtFee;
	}

	public static int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	public Property[] getProperties() {
		return properties;
	}

	public String getCompanyName() {
		return name;
	}

	public String getTaxId() {
		return taxId;
	}

	public double getMgmtFee() {
		return mgmtFee;
	}

	public int getPropertyCount() {
		return propertyCount;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	public void setCompanyName(String companyName) {
		this.name = companyName;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public void setMgmtFee(double mgmtFee) {
		this.mgmtFee = mgmtFee;
	}

	public void setPropertyCount(int propertyCount) {
		this.propertyCount = propertyCount;
	}

	/**
	 * It will add the Property object to the properties array.
	 *
	 * @param p1 property to add to the array
	 * @return It will return the index of the array where the property is added or
	 *         -1 if the array is full.
	 */
	public int addProperty(Property p1) {
		if (propertyCount < MAX_PROPERTY) {
			properties[propertyCount] = p1;
			propertyCount++;
			return (propertyCount - 1);
		}
		System.out.println("Array is full. Cant add more properties");
		return -1;
	}

	/**
	 *
	 * @return Returns the total rent of the properties in the properties array.
	 */
	public double totalRent() {
		double rent = 0;
		for (Property p : properties) {
			if (p != null) {
				rent += p.getRentAmount();
			}
		}
		return rent;
	}

	/**
	 *
	 * @return the index of the property within the properties array that has the
	 *         highest rent amount.
	 */
	public int maxPropertyRentIndex() {
		int index = 0;
		double maxAmount = Integer.MIN_VALUE;
		for (int i = 0; i < properties.length; i++) {
			if (properties[i] != null) {
				if (properties[i].getRentAmount() > maxAmount) {
					maxAmount = properties[i].getRentAmount();
					index = i;
				}
			}
		}
		return index;
	}

	/**
	 *
	 * @param index of the Property object in the properties array
	 * @return the string representation of the property
	 */
	public String displayPropertyAtIndex(int index) {
		return properties[index].toString();
	}

	@Override
	public String toString() {
		return "List of properties for " + name + ", taxId=" + taxId
				+ "\n----------------------------------------------------------\n"
				+ Arrays.toString(properties).replace("[", "").replace("]", "");
	}
}

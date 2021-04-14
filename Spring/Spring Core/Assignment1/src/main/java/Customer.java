
public class Customer {
	
	
private String customerId;
private String customerName;
private double customerContact;
private Address address;
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(double customerContact) {
	this.customerContact = customerContact;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void Fulladdress()
{
	System.out.println("customer-id"+getCustomerId()+"  "+"customer name"+getCustomerName()+"  "+"customer contact"+getCustomerContact()+"  "+"customer addtress\n"+address);
}



}


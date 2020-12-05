package model;

public class Address {
   
	int pin;
	String address;
	
	
	public Address(int pin, String address) {
		this.pin = pin;
		this.address = address;
	}
	
	public Address() {
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address{" +
        "address=" + address +
        ", pin=" + pin + 
        '}';
	}
	 public void init() {
	    	System.out.println("init");
	    }
	    
	    public void destroy() {
	    	System.out.println("destroy");
	    }
    
    
}

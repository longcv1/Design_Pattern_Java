package balazs;

public class Person {
	private String name;
	private String email;
	private String address;
	private String phone;
	
	Person(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.phone = builder.phone;
	}
	
	@Override
	public String toString() {
		String value = "Name: " + this.name;
		value += "\nEmail: " + this.email;
		if(this.address != null) {
			value += "\nAddress: " + this.address;
		}
		if(this.phone != null) {
			value += "\nPhone: " + this.phone;
		}
		return value;
	}
	
	public static class Builder {
		private final String name;
		private final String email;
		private String address;
		private String phone;
		
		public Builder(String name, String email) {
			this.name = name;
			this.email = email;
		}
		
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
	
}

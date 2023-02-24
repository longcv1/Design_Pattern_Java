package balazs;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person.Builder("Nguyen Van A", "a1@gmail.com").build();
		System.out.println(p1);
		Person p2 = new Person.Builder("Hoang Thi B", "b2@yahoo.com")
				    .setAddress("Hanoi")
				    .setPhone("123456789")
				    .build();
		System.out.println(p2);
	}

}

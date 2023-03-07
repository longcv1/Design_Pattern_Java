package others;

public class Director {

	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	public House constructHouse(String areas, int doors, int rooms) {
		builder.addAreas(areas);
		builder.addDoors(doors);
		builder.addRooms(rooms);
		return builder.build();
	}
}

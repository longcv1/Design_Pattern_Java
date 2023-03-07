package others;

public class DepartmentBuilder implements Builder{

	private House house;
	public DepartmentBuilder() {
		house = new House();
	}
	@Override
	public void addAreas(String areas) {
		this.house.setArea(areas);
	}

	@Override
	public void addRooms(int rooms) {
		this.house.setRooms(rooms);
	}

	@Override
	public void addDoors(int doors) {
		this.house.setDoors(doors);
	}

	@Override
	public House build() {
		return this.house;
	}
	
}

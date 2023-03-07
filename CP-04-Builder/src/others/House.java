package others;

public class House {
	private String area;
	private int doors;
	private int rooms;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "Your House With: " + 
			   "Areas: " + this.area + 
			   " Doors: " + this.doors + 
			   " Rooms: " + this.rooms;
	}
}

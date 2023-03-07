package others;

public interface Builder {
	public void addAreas(String areas);
	public void addRooms(int rooms);
	public void addDoors(int doors);
	public House build();
}

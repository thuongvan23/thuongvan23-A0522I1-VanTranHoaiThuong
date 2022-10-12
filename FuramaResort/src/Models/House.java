package Models;

public class House extends Facility{
    private int levelRoom;
    private int floors;

    public House() {
    }

    public House(int levelRoom, int floors) {
        this.levelRoom = levelRoom;
        this.floors = floors;
    }

    public House(String serviceName, float usingArea, int price, int people, String howToRent, int levelRoom, int floors) {
        super(serviceName, usingArea, price, people, howToRent);
        this.levelRoom = levelRoom;
        this.floors = floors;
    }

    public int getLevelRoom() {
        return levelRoom;
    }

    public void setLevelRoom(int levelRoom) {
        this.levelRoom = levelRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "levelRoom=" + levelRoom +
                ", floors=" + floors +
                '}'+super.toString();
    }
}

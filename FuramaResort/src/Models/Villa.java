package Models;

public class Villa extends Facility{
    private int levelRoom;
    private int areaOfPool;
    private int floors;

    public Villa() {
    }

    public Villa(int levelRoom, int areaOfPool, int floors) {
        this.levelRoom = levelRoom;
        this.areaOfPool = areaOfPool;
        this.floors = floors;
    }

    public Villa(String serviceName, float usingArea, int price, int people, String howToRent, int levelRoom, int areaOfPool, int floors) {
        super(serviceName, usingArea, price, people, howToRent);
        this.levelRoom = levelRoom;
        this.areaOfPool = areaOfPool;
        this.floors = floors;
    }

    public int getLevelRoom() {
        return levelRoom;
    }

    public void setLevelRoom(int levelRoom) {
        this.levelRoom = levelRoom;
    }

    public int getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(int areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "levelRoom=" + levelRoom +
                ", areaOfPool=" + areaOfPool +
                ", floors=" + floors +
                '}'+super.toString();
    }
}

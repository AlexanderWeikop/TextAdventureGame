package dungeon;

public class Room {

    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room(String name, String description) {
        //this.name = name;
        this.name = "rA1";
        this.description = "Entrance";
        //this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public void setEast(String east) {
        this.east = east;
    }

    public void setSouth(String south) {
        this.south = south;
    }

    public void setWest(String west) {
        this.west = west;
    }

    public String getNorth() {
        return north;
    }

    public String getEast() {
        return east;
    }

    public String getWest() {
        return west;
    }

    public String getSouth() {
        return south;
    }
}

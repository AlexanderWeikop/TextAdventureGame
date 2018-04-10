package character;

public class Player {

    private String name;
    private String currentRoom;

    public String getName() {
        return name;
    }

    public String getCurrentRoom() {
        return currentRoom;
    }

    public Player(String name, String currentRoom) {
        this.name = name;
        this.currentRoom = currentRoom;
    }
    
    
}

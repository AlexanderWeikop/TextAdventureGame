
package controller;

import character.Player;
import dungeon.Room;
import tui.Tui;

/**
 *
 * @author Alexander W
 */
public class Controller {
    Player player;
    
    public static void main(String[] args) {
        createRooms();
        Tui tui = new Tui();
        String name = tui.getUserName();
        createPlayer(name);
        play();
    }
    
    public static void createRooms() {
        Room rA1 = new Room();
        Room rB1 = new Room();
        Room rB2 = new Room();
        Room rB3 = new Room();
        Room rC1 = new Room();
        Room rC2 = new Room();
        Room rC3 = new Room();
        Room rC4 = new Room();
        Room rD1 = new Room();
        Room rD2 = new Room();
        Room rD3 = new Room();
    }
    
    public static void createPlayer(String name) {
        player = new Player(name);
    }
    
    public static void play() {
        
    }
}

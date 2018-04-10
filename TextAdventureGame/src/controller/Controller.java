
package controller;

import character.Player;
import dungeon.Room;

/**
 *
 * @author Alexander W
 */
public class Controller {

    public static void main(String[] args) {
        createRooms();
        createPlayer();
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
    
    public static void createPlayer() {
        Player player = new Player();
    }
    
    public static void play() {
        
    }
}

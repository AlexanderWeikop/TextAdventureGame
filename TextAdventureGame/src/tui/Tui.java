package tui;

import java.util.Scanner;

public class Tui {
    Scanner sc = new  Scanner(System.in);
    
    public String getUserName() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        return name;
    }
    
    public String getAction() {
        System.out.println("What would you like to do next?");
        String action = sc.nextLine();
        return action;
    }

}

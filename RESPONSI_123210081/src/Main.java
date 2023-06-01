
import controller.UIController;
import model.Connector;
import view.UserInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab Informatika
 */
public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        Connector conn = new Connector();    
        UIController uic = new UIController(conn, ui);
        ui.setVisible(true);
    }
}

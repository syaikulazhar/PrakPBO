import controller.LoginController;
import controller.User;
import model.Connector;
import project_006_081.LoginView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Main {
    
    public static void main(String[] args) {
      LoginView lv = new LoginView();
      Connector conn = new Connector();
      LoginController lc = new LoginController(conn, lv);
      lv.setVisible(true);
      
}
}

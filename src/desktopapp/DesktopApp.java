/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desktopapp;
import Form.DB;
import Form.LoginForm;
import Form.Home;


/**
 *
 * @author Bùi Tuấn
 */
public class DesktopApp { 
    public static Form.Home frmHome = new Home();
    public static Form.DB connection = new DB();
    public static void main(String[] args) {
        Form.LoginForm loginForm = new LoginForm();
        
        loginForm.show();
    }
    
}

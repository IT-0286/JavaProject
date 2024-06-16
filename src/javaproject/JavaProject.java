
package javaproject;

import Control.LoginController;
import View.Login;


public class JavaProject {

  
    public static void main(String[] args) {

        //create object
        Login LoginObj = new Login();
        LoginObj.show();
        
         //notwork call method
        LoginController.loadConnection(); //calling load method in main class
        
        
        
    }
    
}

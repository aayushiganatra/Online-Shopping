/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingcart;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mostafa
 */
public class ShoppingCart {

    public static ArrayList<Items> itemsArray=new ArrayList<Items>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 
        Home home = new Home();
        home.setLocation(10, 10);
        home.setSize(500, 500);
        home.setVisible(true);
    }
    
}

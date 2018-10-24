/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dompath;

import java.util.ArrayList;

/**
 *
 * @author isainrodrigueznorena
 */
public class DomPath {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<String> UsersList = new ArrayList<>();
    
    public static void main(String[] args) {
        
        boolean exit = false;
        
        do{
            int optionMenu = 0;
            Templates.menu();
            optionMenu = Control.askInt("Que quieres hacer?");
            
            switch(optionMenu){
                case 1:
                    String sender = Control.askString("Nombre emisor:");
                    String receiver = Control.askString("Nombre receptor");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida!!");
                    break;            
            }
            
        }while(!exit);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Danny
 */
public class Battleship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BSGame game = new BSGame();
        String returned = game.AIpegSelect();
        System.out.println(returned);
    }
    
}

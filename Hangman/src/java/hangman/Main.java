/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import beans.HangmanBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author mpwnage12
 */
public class Main {
    @EJB
    private static HangmanBeanRemote hangmanBean;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.println(hangmanBean.initWord());
        System.out.println(hangmanBean.makeGuess('p'));
//        
//        System.out.println(hangmanBean.makeGuess('w'));
//        
//        System.out.println(hangmanBean.makeGuess('n'));

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Remote;

/**
 *
 * @author mpwnage12
 */
@Remote
public interface HangmanBeanRemote {

    String initWord();

    String makeGuess(char guess);
    
}

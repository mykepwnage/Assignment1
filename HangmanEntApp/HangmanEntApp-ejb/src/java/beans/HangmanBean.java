/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateful;

/**
 *
 * @author mpwnage12
 */
@Stateful
public class HangmanBean implements HangmanBeanRemote {

    String[] wordList = {
        "divertissement",
        "datelining",
        "enate",
        "separated",
        "grape",
        "upsprung",
        "circumambulator",
        "nonprotestation",
        "underrealising",
        "poeticising"};
    int R = (int) ((Math.random() * (9 - 0)) + 0);
    String word = "pwnage";
//    String word = wordList[R];
    int numberOfDashes = word.length();
    String dashedWord;

    /**
     * Selects a random target word and returns a string of hyphens equal in
     * length to the target word.
     *
     * @return
     */
    @Override
    public String initWord() {
        for (int x = 0; x < numberOfDashes; x++) {
            dashedWord = dashedWord + "-";
        }

        return dashedWord + " is actually " + word;

    }

    /**
     * Takes a single character parameter and checks for the occurrence(s) of
     * the character in the target word. The return value is a string containing
     * the target word with hyphens replacing any letters that have not yet been
     * guessed.
     *
     * @param guess
     * @return
     */
    @Override
    public String makeGuess(String guess) {

        
        for (int i = 0; i < numberOfDashes; i++) {

            char wordCharacter = word.charAt(i);

            if (guess.contains(wordCharacter)) {
                dashedWord = dashedWord.substring(0, i) + wordCharacter + dashedWord.substring(i + 1);
            } else {
                dashedWord = dashedWord.substring(0, i) + "-" + dashedWord.substring(i + 1);
            }
        }

        return dashedWord;
    }
}
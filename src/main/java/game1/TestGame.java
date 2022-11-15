package game1;

import javax.swing.*;
import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        GuessTheNumber dotCom = new GuessTheNumber();

        int[] location = {3};    //  TODO - insert a nr


        dotCom.setLocationCell(location);
        System.out.println("Let's play a game!");

        String userGuess1 = JOptionPane.showInputDialog("");
        String result = dotCom.checkYourelf(userGuess1);

        String userGuess2 = JOptionPane.showInputDialog("");
        result = dotCom.checkYourelf(userGuess2);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        JOptionPane.showMessageDialog(null, testResult, "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, result, "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, testResult, "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null, "You liked the game?", "Sit back, relax, enjoy the show", JOptionPane.YES_NO_CANCEL_OPTION);


    }
}

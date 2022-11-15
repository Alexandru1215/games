package game1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GuessTheNumber {



        int[] locationCell;
        int numbersOffHits = 0;


    GuessTheNumber() {

        }


        public String checkYourelf(String stringGuess) {
            int guess = Integer.parseInt(stringGuess);                                             //convert String in int
            String result = "miss";                                                                 // fac o variabila pentru a tine rezultatul din <- 'result'
            //  presupun ca rateaza- plec de la premiza ca nu ghiceste din prima

            for (int cell : locationCell) {                                                          // bucla se va repeta cu fiecare element 'cell' in 'locationCell
                //fiecare apel facut de obiect
                if (guess == cell) {                                                                   // compar aici numarul bagat de user cu 'cell ' din array
                    result = "hit";                                                                     // aici spun ca a ghicit, - 'hit'
                    // numbersOffHits++;                                                                             // numbersOffHits++;
                    break;                                                                                 // ii zic sa iasa din bucla . sa nu mai testeze celelalte spatii 'cell'
                }
            }
            if (numbersOffHits == locationCell.length) {
                result = "kill";                                                                           // ii zic s iasa din loop dar il las sa afisezze ca e mort 'kill' muhahahahah
                //  are 3 incercari daca nu le potriveste 'result ' se schimba in 'kill'
            }
            System.out.println(result);                                                                    // ce vrem sa vada userul

            return result;                                                                                // ruzultatul de la invocarea metodei.
        }


    }



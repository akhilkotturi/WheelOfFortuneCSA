import java.util.Scanner;

public class WofRunner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String changed_input = "";
        
        System.out.println("Player 1: Enter your Secret Phrase ");
        String input = keyboard.nextLine();
        input.toUpperCase();
        
        WofF word = new WofF(input);
        
        while(!word.checkEqual()){
            System.out.println(word);
            String solve_input;
               System.out.println("Guessed Letters: " + word.letterList);
               while(true){
                   System.out.print("Player 2: Guess a letter or solve the puzzle? (l or s) ");
                   solve_input = keyboard.nextLine();
                   if (solve_input.equals("l") || solve_input.equals("s")){
                       break;
                   }
               }
               if (solve_input.equals("l")){
                   String guess;
                   while(true){
                       System.out.print("Player 2 please enter your letter guess: ");
                       guess = keyboard.nextLine();
                       if (guess.length() == 1) break;
                       else System.out.println("Your guessed letter must be only one character!");
                   }
                   word.guessLetter(guess);
               }
               else if (solve_input.equals("s")){
                   System.out.print("Player 2 please enter your phrase guess: ");
                   String full_guess = keyboard.nextLine();
                   if(word.checkEqual(full_guess)) break;
                   else System.out.println("Your guess was wrong");
                   
               }
               
           
        }
        

        System.out.println("\n\nYou solved the puzzle!");
        
    }
}

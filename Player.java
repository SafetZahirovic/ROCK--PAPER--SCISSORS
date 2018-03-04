import java.util.Scanner;

public class Player extends GameItems{
    Scanner scan;


    public Player(){
        super();
        scan = new Scanner(System.in);
    }

    public CHOICES getChoice(){
        System.out.println("\n**** WELCOME TO \'ROCK, PAPER, SCISSORS\' ****\n" +
                "\t**** GAME ABOUT YOUR CHOICES ****\n" +
                "**** AND REALISING HOW UNIMPORTANT THEY ARE :-) **** \n");
        System.out.println("**** Please enter your choice: ****\n " +
                "\n**** R=Rock, P=Paper, S=Scissors ****");
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);

        switch(playerChoice){
            case 'R':
                return CHOICES.ROCK;
            case 'P':
                return CHOICES.ROCK;
            case 'S':
                return CHOICES.SCISSORS;

        }
        System.out.println("Invalid input!");
        return getChoice();
    }

}

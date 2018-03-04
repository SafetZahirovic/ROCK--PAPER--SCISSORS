

public class Game extends GameItems{
    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;
    private int wins;
    private int loses;
    private int ties;

    public Game(){
        super();
        player = new Player();
        computer = new Computer();
    }

    public void Play(){
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResults();
        displayResults();
        stats();
    }

    public void displayStats(){
        System.out.println("You have played "+ (wins + loses + ties));
        System.out.println("You have won "+ (wins));
        System.out.println("You have lost "+ (loses));
        System.out.println("You have tied "+ (ties) + " times " + "\n");
    }

    private void stats(){
        if(result == RESULT.WIN)
            wins++;
        else if (result == RESULT.LOSE)
            loses++;
        else
            ties++;
    }

    private void displayResults(){
        switch (result) {
            case WIN:
                System.out.println(playerChoice + " beats " + computerChoice + ". Player WINS");
                break;
            case LOSE:
                System.out.println(playerChoice + " loses to " + computerChoice + ". Computer WINS");
                break;
            case TIE:
                System.out.println(playerChoice + " equals to " + computerChoice + ". It's a TIE");
                break;
        }
    }

    public RESULT getResults(){
        if(playerChoice == computerChoice){
            return RESULT.TIE;
        }
        switch (playerChoice){
            case ROCK:
                return (computerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
            case PAPER:
                return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
            case SCISSORS:
                return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
        }

        //it will never come to this line
        return RESULT.LOSE;
    }


}


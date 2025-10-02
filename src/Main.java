import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        System.out.println("Svp entrer les cases que vous voulez jouer comme suit(ligne, column, exemple : 11, 12,13");
        Scanner myObj = new Scanner(System.in);
        // verification du choix de joueurs
        String joueur;
        boolean playerChoice = false;
        while(!playerChoice){
            System.out.println("Voulez vous jouer les X ou les O?");
            joueur = myObj.nextLine();
            joueur = joueur.toLowerCase();
            if(joueur.equals("x") || joueur.equals("o"))
            {
                playerChoice = true;
            }
        }


        //initialise un move a jouer null
        Move moveTest = new Move();
        //initialise un jeu de tictactoe vide.
        Board test = new Board();
        test.getBoard();


        // jouer tant que le jeu nest pas gagner
        // TODO: 2025-10-02 changer la variable endgame a true lorsque le jeu se termine.
        boolean endgame = false;
        while(!endgame)
        {

            test.printBoard();
            try {
                System.out.println("Quel case voulez vous jouer ?");
                String caseJouer = myObj.nextLine();
                int rowJouer = Integer.parseInt(String.valueOf(caseJouer.charAt(0)));
                int columnJouer = Integer.parseInt(String.valueOf(caseJouer.charAt(1)));
                moveTest.setRow(rowJouer);
                moveTest.setCol(columnJouer);
                if(test.verificationCaseLibre(moveTest))
                {
                    // TODO: 2025-10-02 ajouter un modulo pour alterner le placements des x et des o
                    test.play(moveTest, Mark.X);
                    // clear terminal with couple of line jump
                    for(int clearScreen = 0 ; clearScreen < 15 ; clearScreen ++)
                    {
                        System.out.println();
                    }
                }else
                {
                    System.out.println("!!Case non disponible!!");
                }
            }catch(Exception e)
            {
                System.out.println("Entrer une coordoner valide format (ligne,Column)");
            }

        }


        test.getBoard();
        System.out.println("Hello world!");
    }
}
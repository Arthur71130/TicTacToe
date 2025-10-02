import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

// IMPORTANT: Il ne faut pas changer la signature des méthodes
// de cette classe, ni le nom de la classe.
// Vous pouvez par contre ajouter d'autres méthodes (ça devrait
// être le cas)
class Board
{
    private Mark[][] board;

    // Ne pas changer la signature de cette méthode

    /**
     * crée un teableau 3x3 ( tictactoe size )
     * Si  vous voulez un plus gros jeu, modifier les valeur du tableau board = new Mark[3][3]
     */
    public Board() {
        board = new Mark[3][3];
        for(int i = 0 ; i < board.length ; i ++)
        {
            for (int j = 0 ; j < board[i].length ; j ++)
            {
                board[i][j] = Mark.EMPTY;
            }
        }
    }

    // Place la pièce 'mark' sur le plateau, à la
    // position spécifiée dans Move
    //
    // Ne pas changer la signature de cette méthode
    public void play(Move m, Mark mark){
        board[m.getRow()][m.getCol()] = mark;
        //evaluate here ?


    }


    // retourne  100 pour une victoire
    //          -100 pour une défaite
    //           0   pour un match nul
    // Ne pas changer la signature de cette méthode
    // TODO: 2025-10-02 modifier le retour pour le bon
    public int evaluate(Mark mark){

        for (int i = 0; i < 3; i++) {
            // Vérifie les 3 lignes
            if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) {
                return 100;
            }
            //Vérifie les 3 colonnes
            if (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark) {
                return 100;
            }
        }
        //Vérifie la diagonale (haut droit à bas gauche)
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
            return 100;
        }
        //Vérifie la diagonale (haut gauche à bas droit)
        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
            return 100;
        }

        return 0;
    }

    public Mark[][] getBoard()
    {
        return board;
    }

    /**
     * verifie si la position choisi est deja prise.
     * @param move
     * @return
     */
    public boolean verificationCaseLibre(Move move)
    {
        boolean valide = true ;
        if(board[move.getRow()][move.getCol()] != Mark.EMPTY)
        {
            valide = false;
        }

        return valide;
    }

    public void printBoard()
    {
        System.out.println("     0       1       2 ");
        for (int i = 0; i < 3; i++) {
            System.out.print((i) + " "); // row number
            for (int j = 0; j < 3; j++) {
                if(board[i][j] == Mark.EMPTY)
                {
                    System.out.print(" " + board[i][j] + " ");
                }
                else
                {
                    System.out.print("   " + board[i][j] + "   ");
                }

                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -------+-------+-------");
            }
        }

    }
}

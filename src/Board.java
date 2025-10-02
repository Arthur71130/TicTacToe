import java.util.ArrayList;
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

    }


    // retourne  100 pour une victoire
    //          -100 pour une défaite
    //           0   pour un match nul
    // Ne pas changer la signature de cette méthode
    // TODO: 2025-10-02 modifier le retour pour le bon
    public int evaluate(Mark mark){

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
}


public class Main {

    public static void main(String[] args) {

        //initialise un move a jouer null
        Move moveTest = new Move();
        //initialise un jeu de tictactoe vide.
        Board test = new Board();
        test.getBoard();
        moveTest.setRow(1);
        moveTest.setCol(1);


        test.play(moveTest, Mark.X);


        test.getBoard();
        System.out.println("Hello world!");
    }
}
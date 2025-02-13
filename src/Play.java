import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        System.out.println("Enter the row and column to play");
        TicTacToe game = new TicTacToe();
        
        while(!game.isGameOver()) {
            System.out.println("It is Player " + game.getCurrentPlayer() + "'s turn.");
            game.printBoard();
            // your code here
            System.out.println("Row: ");
            int row = scanner.nextInt();
            System.out.println("Column: ");
            int col = scanner.nextInt();
            game.play(row, col);

        }
        scanner.close();
    }
}

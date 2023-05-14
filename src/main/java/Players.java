import java.util.Scanner;

public class Players {

    public static char[] getPlayerInput(){
        Scanner scanner = new Scanner(System.in);
        String playerInput = scanner.nextLine();
        char[] exprArr = playerInput.toCharArray();

        char symb = playerInput.charAt(0);
        char posI = playerInput.charAt(1);
        char posJ = playerInput.charAt(2);
        return new char[]{ symb,posI,posJ };
    }
    public static void makePlayerMove() {
        boolean kavto = true;
        while (kavto){
            char[] input = getPlayerInput();
            int i = Integer.parseInt(String.valueOf(input[1]));
            int j = Integer.parseInt(String.valueOf(input[2]));
            Grid.drawOnGrid(input[0], i, j);
            Grid.drawGrid();
            kavto = !Grid.winnerChecker(i, j);
            if(kavto){
                kavto = Grid.checkIfBoardIsFull();
            }
        }
    }
}

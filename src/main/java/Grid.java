public class Grid {
    private static char[][] gridArr = new char[3][3];
    public static void initializeGrid(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                gridArr[i][j] = '-';
            }
        }
    }
    public static void drawGrid(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(gridArr[i][j]);
            }
            System.out.println();
        }

    }
    public static void drawOnGrid(char symb, int posI, int posJ){
        if(gridArr[posI][posJ] != '-'){
            System.out.println("field is already taken");
        }
        else {
            gridArr[posI][posJ] = symb;
        }

    }

    public static boolean winnerChecker(int posI, int posJ){
        if(gridArr[posI][0] == gridArr[posI][1]){
            if(gridArr[posI][0] == gridArr[posI][2]){
                System.out.println("winner is symbol "+ gridArr[posI][posJ]);
                return true;
            }
        }
        if(gridArr[0][posJ] == gridArr[1][posJ]){
            if(gridArr[0][posJ] == gridArr[2][posJ]){
                System.out.println("winner is symbol "+ gridArr[posI][posJ]);
                return true;
            }
        }
        if(gridArr[posI][posJ] == gridArr[0][0] && gridArr[posI][posJ] == gridArr[1][1] && gridArr[posI][posJ] == gridArr[2][2]){
            System.out.println("winner is symbol "+ gridArr[posI][posJ]);
            return true;
        }
        if(gridArr[posI][posJ] == gridArr[0][2] && gridArr[posI][posJ] == gridArr[1][1] && gridArr[posI][posJ] == gridArr[2][0]){
            System.out.println("winner is symbol "+ gridArr[posI][posJ]);
            return true;
        }
        return false;
    }
    public static boolean checkIfBoardIsFull(){
        int count = 0;
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if(gridArr[i][j] == '-'){
                    count+=1;
                }

            }
        }
        if(count>0){
            return true;
        }
        return false;
    }
}

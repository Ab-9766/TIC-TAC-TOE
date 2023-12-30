package Models;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;
    private PlayerType playerType;

    public Player(char ch, String name, PlayerType playerType) {
        this.symbol = ch;
        this.name = name;
        this.playerType = playerType;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move decideMove(Board board){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter row for the move: ");
        int row= scanner.nextInt();

        System.out.println("Please enter col for the move: ");
        int col= scanner.nextInt();

        return new Move(this, new Cell(this,row,col,CellState.FILLED));



    }
}

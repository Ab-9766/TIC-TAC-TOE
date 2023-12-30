package Strategies.BotPlayingStrategy;

import Models.*;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Player player, Board board) {
        for(int i=0;i<board.getBoard().size();i++){
            for(int j=0;j< board.getBoard().size();j++)
            {
                if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    //bot can move the move at i,j cell
                    return new Move(player,new Cell(player,i,j,CellState.FILLED));
                }
            }

        }
        return null;
    }
}

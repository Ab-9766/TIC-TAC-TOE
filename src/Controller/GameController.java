package Controller;

import Exceptions.InvalidGameBuildException;
import Models.Game;
import Models.GameStatus;
import Models.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players){
        try {
            return Game.getBuilder().setDimension(dimension).setPlayers(players).build();
        } catch (InvalidGameBuildException e) {
            throw new RuntimeException(e);
        }
    }
    public void undo(Game game){

    }
    public void displayBoard(Game game){
        game.displayBoard();
    }
    public Player getWinner(Game game){
        return game.getWinner();

    }
    public void executeNextMove(Game game){

    }
    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }
}

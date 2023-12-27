import Controller.GameController;
import Exceptions.InvalidGameBuildException;
import Models.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension of the game: ");

        int dimension = scanner.nextInt();
        System.out.println("Will there be any boy? Y/N");

        String isBot = scanner.next();
        List<Player> players = new ArrayList<>();

        int noOfHumanPlayers = dimension - 1;
        if (isBot.equals("Y")) noOfHumanPlayers -= 1;

        System.out.println("Enter the name of the bot:");
        String botName = scanner.next();

        System.out.println("What is the symbol of the bot:");
        String botSymbol = scanner.next();

        //Get the bot difficulty level

        players.add(new Bot(botSymbol.charAt(0), botName, PlayerType.BOT, BotDifficultyLevel.EASY));

        for (int i = 0; i < noOfHumanPlayers; i++) {
            System.out.println("What is the name of the player" + (i + 1));
            String name = scanner.next();
            System.out.println("What is the symbol of the player" + (i + 1));
            String symbol = scanner.next();

            players.add(new Player(symbol.charAt(0), name, PlayerType.HUMAN));

        }

        //Creating the game
//        try {
//            Game game= Game.getBuilder().setDimension(dimension).
//                                         setPlayers(players).
//                                          build();
//        } catch (InvalidGameBuildException e) {
//            throw new RuntimeException(e);
//        }

        //Creating the game in controller layer
        GameController controller= new GameController();
        Game game= controller.createGame(dimension,players);

    }
}
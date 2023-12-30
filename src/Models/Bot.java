package Models;

import Factory.BotPlayingStrategyFactory;
import Strategies.BotPlayingStrategy.BotPlayingStrategy;
import Strategies.BotPlayingStrategy.RandomBotPlayingStrategy;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;

    private BotPlayingStrategy botPlayingStrategy;

    public Bot(char ch, String name, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(ch, name, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public Move decideMove(Board board){
        return botPlayingStrategy.makeMove(this,board);

    }
}

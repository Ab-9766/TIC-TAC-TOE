package Models;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public Bot(char ch, String name, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(ch, name, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}

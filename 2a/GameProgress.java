package GameState;

public class GameProgress {
    private static GameProgress instance;
    private int level;
    private int score;

    private GameProgress() {
        level = 1;
        score = 0;
    }

    public static GameProgress getInstance() {
        if (instance == null) {
            instance = new GameProgress();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }
    public void updateLevel(int newLevel) {
        this.level = newLevel;
    }
    public int getScore() {
        return score;
    }
    public void updateScore(int newScore) {
        this.score = newScore;
    }
}

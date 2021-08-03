public class Score implements iScore{
    int score;
    public Score(){
        score = 0;
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public void addToScore(int value) {
        this.score += value;
    }
}

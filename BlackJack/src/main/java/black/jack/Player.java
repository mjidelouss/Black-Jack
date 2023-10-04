package black.jack;

public class Player {
    private int bank;
    private int winCount;
    private int loseCount;
    public Player(int bank, int winCount, int loseCount) {
        this.bank = bank;
        this.winCount = winCount;
        this.loseCount = loseCount;
    }

    public Player () {

    }
    public void setBank(int bank) {
        this.bank = bank;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    public int getBank() {
        return bank;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }
}

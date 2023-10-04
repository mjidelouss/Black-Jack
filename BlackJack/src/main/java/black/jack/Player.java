package black.jack;

public class Player {
    private int bank;
    private int winCount;
    private int loseCount;

    public void setTieCount(int tieCount) {
        this.tieCount = tieCount;
    }

    public int getTieCount() {
        return tieCount;
    }

    private int tieCount;
    public Player(int bank, int winCount, int loseCount, int tieCount) {
        this.bank = bank;
        this.winCount = winCount;
        this.loseCount = loseCount;
        this.tieCount = tieCount;
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

package model.rules.winnerStrategy;

import model.rules.IVisitor;

public class DealerWinStrategy implements IWinnerStrategy {
    @Override
    public boolean isDealerWinner(int dealerCore, int playerScore,int maxScore) {
        if (playerScore > maxScore) {
            return true;
        } else if (dealerCore > maxScore) {
            return false;
        }
        return dealerCore >= playerScore;
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

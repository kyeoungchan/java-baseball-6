package baseball.view;

import baseball.domain.Result;

import static baseball.domain.Const.GAME_OVER_MENTION;
import static baseball.domain.Const.GAME_START_MENTION;

public class OutputView {

    public void startMention() {
        System.out.println(GAME_START_MENTION);
    }

    public void printResult(Result result) {
        System.out.println(result);
    }

    public void gameOverMention() {
        System.out.println(GAME_OVER_MENTION);
    }
}
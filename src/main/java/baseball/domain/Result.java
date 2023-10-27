package baseball.domain;

import static baseball.domain.Const.ALL_BALL;
import static baseball.domain.Const.ALL_STRIKE;
import static baseball.domain.Const.NOTHING;
import static baseball.domain.Const.ONLY_BALL;
import static baseball.domain.Const.ONLY_STRIKE;
import static baseball.domain.Const.BALL_AND_STRIKE;

public class Result {
    private int ballCount;
    private int strikeCount;

    public void initResult() {
        ballCount = 0;
        strikeCount = 0;
    }

    public void addBall() {
        ballCount++;
    }

    public void addStrike() {
        strikeCount++;
    }

    public boolean isAllStrike() {
        return strikeCount == 3;
    }

    private boolean isAllBall() {
        return ballCount == 3;
    }

    private boolean isNothing() {
        return ballCount == 0 && strikeCount == 0;
    }

    @Override
    public String toString() {
        if (isAllStrike()) {
            return ALL_STRIKE;
        }

        if (isAllBall()) {
            return ALL_BALL;
        }

        if (isNothing()) {
            return NOTHING;
        }

        if (strikeCount == 0) {
            return String.format(ONLY_BALL, ballCount);
        }

        if (ballCount == 0) {
            return String.format(ONLY_STRIKE, strikeCount);
        }

        return String.format(BALL_AND_STRIKE, ballCount, strikeCount);
    }
}
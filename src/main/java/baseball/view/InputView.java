package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static baseball.domain.Const.ASK_INPUT_IF_CONTINUE;
import static baseball.domain.Const.ASK_INPUT_NUMBERS;

public class InputView {

    public String inputNumbers() {
        System.out.print(ASK_INPUT_NUMBERS);
        return Console.readLine();
    }

    public String inputIfContinue() {
        System.out.println(ASK_INPUT_IF_CONTINUE);
        return Console.readLine();
    }
}
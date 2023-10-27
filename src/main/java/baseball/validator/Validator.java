package baseball.validator;

import static baseball.domain.Const.ERROR_NUMBER_INPUT;
import static baseball.domain.Const.ERROR_CIPHERS;
import static baseball.domain.Const.ERROR_NUMBER_RANGE;

public class Validator {

    public static int parseValidatedInt(String str) {
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throwIllegalArgumentException(ERROR_NUMBER_INPUT, e);
        }
        return result;
    }

    public static void validateCiphers(int value, int ciphers) {
        // 세 자리면 100(10^2)으로 나누고, 한 자리면 1(10^0)으로 나눈다.
        int divideBy = (int) Math.pow(10, (ciphers - 1));
        int divisionResult = value / divideBy;
        if (divisionResult <= 0 || divisionResult >= 10) {
            throwIllegalArgumentException(ERROR_CIPHERS);
        }
    }

    public static void validateInRange(int value, int from, int to) {
        if (value < from || value > to) {
            String format = String.format(ERROR_NUMBER_RANGE, from, to);
            throwIllegalArgumentException(format);
        }
    }

    private static void throwIllegalArgumentException(String message, Exception e) {
        throw new IllegalArgumentException(message, e);
    }

    private static void throwIllegalArgumentException(String message) {
        throw new IllegalArgumentException(message);
    }
}
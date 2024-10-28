package racingcar.validator;

import java.util.List;

public class Validator {

    public static void validateNameLength(List<String> carNames) {
        for (String name : carNames) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다: " + name);
            }
        }
    }
}
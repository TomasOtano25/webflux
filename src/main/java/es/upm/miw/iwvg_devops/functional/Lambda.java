package es.upm.miw.iwvg_devops.functional;

import org.apache.logging.log4j.LogManager;

import java.util.function.*;

public class Lambda {
    public static final Consumer<String> logInfo =
            LogManager.getLogger(Lambda.class)::info;

    public static final Consumer<String> logInfoDetail =
            msg -> LogManager.getLogger(Lambda.class).info("Consumer {}", msg);

    public static final Function<String, Integer> convertToInt =
            Integer::parseInt;

    public static final Function<String, Integer> convertToIntPlus1 =
            value -> Integer.parseInt(value) + 1;

    public static final Function<String, Integer> convertToIntZeroTo1 =
            value -> {
                if("0".equals(value)) {
                    return 1;
                } else {
                    return Integer.parseInt(value);
                }
            };

    public static final Predicate<String> equalsTo2 =
            "two"::equals;

    public static final Supplier<String> generateDots =
            () -> "...";

    public static final BiConsumer<String, String> biLogInfo =
            (msg1, msg2) -> LogManager.getLogger(Lambda.class).info("Bi-Consumer: {}, {}", msg1, msg2);

    public static final BiFunction<Integer, Integer, Integer> multiply =
            (x, y) -> x * y;

    public static final BiPredicate<String, String> compare =
        String::equals;
}

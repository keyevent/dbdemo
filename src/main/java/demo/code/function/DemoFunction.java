package demo.code.function;

import java.util.function.Function;

/**
 * AI will not create test case for functional interface. This might be similiar with repository issue.
 * For some concrete lamda classes, the generated classes also need improvements.
 * I cant remember the case, but might be related with reactor.
 *
 * @param <T>
 * @param <R>
 */

@FunctionalInterface
public interface DemoFunction<T, R> {
    R accept(T t);

    default DemoFunction<T, R> andThen(Function<T, R> function, T t) {
        return r -> function.apply(t);
    }
}

package pe.com.devinspirare.dpeappjarutils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Clase de utilidades de DevInspirare
 * @author Zeler Benji Villarreal Marcelo
 * @since 24/11/2018
 * @version 1.0.0
 */
public class Utils{

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    public static String formatCode(char charInit, short size, Number value){
        String formatter = "%0".concat(String.valueOf(size)).concat("d");
        String charInitTemp = String.valueOf(charInit);
        return String.format(charInitTemp.concat(formatter), value);
    }

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

}

package me.heraclitus.compiler;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by sam on 3/6/15.
 */
public class Utils {
    public static String stackTraceString(Throwable e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}

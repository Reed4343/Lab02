package StringClassPackege;

import java.util.Locale;
import java.util.Scanner;

public class MyStringClass {
    public static String stringToUpper(String Line){
        return Line.toUpperCase();
    }
    public static String stringToLower(String Line){

        return Line.toLowerCase();
    }
    public static int stringLength(String Line){
        return Line.length();
    }
    public static String stringUnion(String FirstLine, String SecondLine){
        return FirstLine + SecondLine;
    }
}

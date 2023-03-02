import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};

        String answer = commonPrefix(arr);
        System.out.println(answer);

        }





    static String commonPrefix(String[] strs) {
    if (strs.length ==0) return "";

    String prefix = strs[0];
    for (int i = 1; i < strs.length ; i ++) {
        while (strs[i].indexOf(prefix) !=0 ) {
            prefix= prefix.substring(0, prefix.length()-1);
        }
    }
    return  prefix;

    }
}
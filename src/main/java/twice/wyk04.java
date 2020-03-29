package twice;

import java.util.Scanner;

/**
 * @Author wangyukun
 * @Date 2020-03-29 8:45
 * @Version 1.0
 * 连续输入字符串，按长度为8的打印出来
 */
public class wyk04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            spit(s);
        }
    }
    private static void spit(String s) {
        while (s.length()>=8){
            System.out.println(s.substring(0,8));
            s=s.substring(8);
        }
        if (s.length()>0&&s.length()<8)
            s=s+"00000000";
        System.out.println(s.substring(0,8));
    }
}

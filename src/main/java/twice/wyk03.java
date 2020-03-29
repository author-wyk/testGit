package twice;

import java.util.Scanner;

/**
 * @Author wangyukun
 * @Date 2020-03-29 8:32
 * @Version 1.0
 * 判断指定字符串的长度
 */
public class wyk03 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num=0;
        while (sc.hasNextLine()){
            char[] ch0 = sc.nextLine().toCharArray();
            String s0 = sc.nextLine();
            for (int i = 0; i < ch0.length; i++) {
                if (s0.equalsIgnoreCase(String.valueOf(ch0[i])))
                    num++;
            }
            System.out.println(num);
        }
    }
}

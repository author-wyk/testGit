package twice;

import java.util.Scanner;

/**
 * @Author wangyukun
 * @Date 2020-03-29 8:27
 * @Version 1.0
 * 计算字符串最后一个单词的长度
 */
public class wyk02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s.length()-1-s.lastIndexOf(" "));
        }
    }
}

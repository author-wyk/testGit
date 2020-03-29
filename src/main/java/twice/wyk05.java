package twice;

import java.util.Scanner;

/**
 * @Author wangyukun
 * @Date 2020-03-29 8:50
 * @Version 1.0
 * 计算不同字符串的个数
 */
public class wyk05 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            int len=getLe(s);
            System.out.println(len);
        }
    }
    private static int getLe(String s) {
        int[] arr = new int[128];
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(i));
            System.out.println(arr[s.charAt(i)]);
           arr[s.charAt(i)]=1;
        }
        int len=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                len++;
            }
        }
        return len ;
    }
}

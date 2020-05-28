import java.util.Scanner;

/**
 * 字符串分隔
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * @auth jim
 * @date 2020/5/28 20:52
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String next = sc.next();
            while (next.length()>8){
                String substring = next.substring(0, 8);
                System.out.println(substring);
                next = next.substring(8);
            }
            int tmp = 8 - next.length();
            for (int i = 0; i < tmp; i++) {
                next += "0";
            }
            System.out.println(next);
        }
    }
}

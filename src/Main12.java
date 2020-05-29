import java.util.Scanner;

/**
 * 字符串反转
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 *
 * @author jim
 * @date 2020/5/29 9:54
 */
public class Main12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(new StringBuilder(sc.nextLine()).reverse().toString());
        }
    }
}

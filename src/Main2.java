import java.util.Objects;
import java.util.Scanner;

/**
 * 计算字符个数
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 *
 * @auth jim
 * @date 2020/5/28 20:29
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String c = scanner.nextLine();
        if (Objects.isNull(str) || str.isEmpty()) {
            System.out.println(0);;
        } else {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (String.valueOf(str.charAt(i)).equalsIgnoreCase(c)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}

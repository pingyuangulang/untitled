import java.util.Scanner;

/**
 * 简单密码
 * 输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾
 * 输出渊子真正的密文
 *
 * @author jim
 * @date 2020/5/29 15:07
 */
public class Main19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(password(sc.next()));
    }

    public static String password(String str) {
        if (str == null || "".equals(str))
            return str;
        char[] nums = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : nums) {
            if (c >= 'a' && c <= 'z') {
                if (c == 's' || c == 'v'|| c == 'y' || c == 'z')
                    sb.append((c - 'a') / 3 + 1);
                else
                    sb.append((c - 'a') / 3 + 2);
            } else if (c >= 'A' && c <= 'Z') {
                if (c == 'Z')
                    sb.append('a');
                else
                    sb.append((char)(c + 'a' - 'A' + 1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

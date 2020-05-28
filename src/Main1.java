import java.util.Objects;
import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 *
 * @auth jim
 * @date 2020/5/28 20:16
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (Objects.isNull(str) || str.length() == 0) {
            System.out.println(0);
        } else {
            String[] strs = str.split(" ");
            for (int i = strs.length - 1; i >= 0; i--) {
                if (strs[i].isEmpty()) {
                    continue;
                } else {
                    System.out.println(strs[i].length());
                    break;
                }
            }
        }
    }
}

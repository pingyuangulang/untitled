import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 提取不重复的整数
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 *
 * @auth jim
 * @date 2020/5/28 21:45
 */
public class Main9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        char[] chars= num.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for(int i= chars.length-1; i>= 0;i--){
            set.add(chars[i]);
        }
        set.forEach(System.out::print);
    }
}

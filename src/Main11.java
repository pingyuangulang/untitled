import java.util.Scanner;

/**
 * 数字颠倒
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 * @author jim
 * @date 2020/5/29 9:43
 */
public class Main11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numString= scanner.nextLine();
        char[] chars = numString.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }


}

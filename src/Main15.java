import java.util.Scanner;

/**
 * 求int型正整数在内存中存储时1的个数
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 *
 * @author jim
 * @date 2020/5/29 14:08
 */
public class Main15 {

    public static void main(String[] args){
        int count = 0;
        Character character = '1';
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String numString = Integer.toBinaryString(num);
        for (int i = 0; i < numString.length(); i++) {
            if (character.equals(numString.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}

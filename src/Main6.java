import java.util.Scanner;

/**
 * 质数因子
 * 输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 *
 * @auth jim
 * @date 2020/5/28 21:11
 */
public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        for (int i=2; i<=num; i++) {
            while (num%i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}


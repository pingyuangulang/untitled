import java.util.Scanner;

/**
 * 进制转换
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 *
 * @auth jim
 * @date 2020/5/28 21:03
 */
public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String num = sc.next();
            num = num.substring(2);
            System.out.println(Integer.parseInt(num,16));
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字串的连接最长路径查找
 * 给定n个字符串，请对n个字符串按照字典序排列。
 *
 * @author jim
 * @date 2020/5/29 14:05
 */
public class Main14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            String [] arr = new String[n];
            for(int i=0;i<n;i++){
                String str = scanner.next();
                arr[i] = str;
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}

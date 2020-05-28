import java.util.HashSet;
import java.util.Scanner;

/**
 * 字符个数统计
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。注意是不同的字符
 *
 * @auth jim
 * @date 2020/5/28 21:55
 */
public class Main10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            char[] next = sc.next().toCharArray();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < next.length; i++) {
                int ascValue = (int)next[i];
                if(ascValue>0 && ascValue<127){
                    set.add(ascValue);
                }
            }
            System.out.println(set.size());
        }
    }
}

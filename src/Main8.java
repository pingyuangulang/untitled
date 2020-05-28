import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 合并表记录
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 *
 * @auth jim
 * @date 2020/5/28 21:22
 */
public class Main8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String kv = scanner.nextLine();
            String[] kAndV = kv.split(" ");
            Integer key = Integer.parseInt(kAndV[0]);
            Integer value = Integer.parseInt(kAndV[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        entrySet.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}

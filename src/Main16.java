import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 坐标移动
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。
 * 从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 *
 * @author jim
 * @date 2020/5/29 14:17
 */
public class Main16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            int x = 0 , y = 0;
            String[] sArray = s.split(";");
            String res = "[ADWS]\\d{1}\\d?";
            for(int i = 0;i < sArray.length;i ++) {
                if(sArray[i].matches(res))
                    map.put(sArray[i].charAt(0),map.getOrDefault(sArray[i].charAt(0), 0)+Integer.parseInt(sArray[i].substring(1)));
            }
            x = x - map.get('A') + map.get('D');
            y = y - map.get('S') + map.get('W');
            System.out.println(x+","+y);
            map.clear();
        }
        scanner.close();
    }
}

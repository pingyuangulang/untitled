import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 删除字符串中出现次数最少的字符
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 *
 * @author jim
 * @date 2020/5/29 15:23
 */
public class Main21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            int min=1;
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);

                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }else{
                    map.put(c,1);
                }
                if(map.get(c)<min){
                    min=map.get(c);
                }
            }

            for(int i=0;i<str.length();i++){
                char s=str.charAt(i);
                if(map.get(s)!=min){
                    System.out.print(s);
                }
            }
            System.out.println();
        }


    }
}

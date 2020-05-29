import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 简单错误记录
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 *
 *
 * 处理：
 *
 *
 * 1、 记录最多8条错误记录，循环记录（或者说最后只输出最后出现的八条错误记录），对相同的错误记录（净文件名（保留最后16位）称和行号完全匹配）只记录一条，错误计数增加；
 *
 *
 * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
 *
 *
 * 3、 输入的文件可能带路径，记录文件名称不能带路径。
 *
 * @author jim
 * @date 2020/5/29 14:42
 */
public class Main17 {

    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map=new LinkedHashMap<>();
        String tstr;
        while((tstr = cin.readLine()) != null && !tstr.equals("")){
            String[] str=tstr.split("\\s+");
            String fname=str[0].substring(str[0].lastIndexOf("\\")+1);
            fname=fname.substring(Math.max(fname.length()-16 ,0))+" "+str[1];
            map.merge(fname, 1, Integer::sum);
        }
        int cnt=0;
        for(Map.Entry<String,Integer> it:map.entrySet()){
            if(map.size()-cnt<=8)
                System.out.println(it.getKey()+" "+it.getValue());
            cnt++;
        }
    }
}

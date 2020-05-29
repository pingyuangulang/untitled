import java.util.Scanner;

/**
 * 句子逆序
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * @author jim
 * @date 2020/5/29 9:57
 */
public class Main13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(new Main13().reverse(sentence));
    }

    public String reverse(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length == 1) {
            return words[0];
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = words.length -1; i >= 0; i--) {
                builder.append(words[i]);
                if (i > 0) {
                    builder.append(" ");
                }
            }
            return builder.toString();
        }
    }
}

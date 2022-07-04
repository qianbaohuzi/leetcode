import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharNumber {

    /**
     * 描述
     * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
     * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
     * <p>
     * 数据范围： 1 \le n \le 500 \1≤n≤500
     * 输入描述：
     * 输入一行没有空格的字符串。
     * <p>
     * 输出描述：
     * 输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。
     * <p>
     * 示例1
     * 输入：
     * abc
     * 输出：
     * 3
     * <p>
     * 示例2
     * 输入：
     * aaa
     * 输出：
     * 1
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int[] arr = new int[127];
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            int n = line.charAt(i);
            if (arr[n] != 1) {
                arr[n] = 1;
                count++;
            }
        }
        System.out.println(count);
    }
}

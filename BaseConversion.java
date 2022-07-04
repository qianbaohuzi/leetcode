import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseConversion {

    /**
     * 描述
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
     *
     * 数据范围：保证结果在 1 \le n \le 2^{31}-1 \1≤n≤2
     * 31
     *  −1
     * 输入描述：
     * 输入一个十六进制的数值字符串。
     *
     * 输出描述：
     * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
     *
     * 示例1
     * 输入：
     * 0xAA
     * 复制
     * 输出：
     * 170
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(Integer.parseInt(line.substring(2), 16));
        }
    }
}

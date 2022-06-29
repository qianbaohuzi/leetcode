public class IsSubsequence {

    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     * <p>
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     * <p>
     * 进阶：
     * <p>
     * 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
     * <p>
     * 致谢：
     * <p>
     * 特别感谢 @pbrother  添加此问题并且创建所有测试用例。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "abc", t = "ahbgdc"
     * 输出：true
     * 示例 2：
     * <p>
     * 输入：s = "axc", t = "ahbgdc"
     * 输出：false
     * <p>
     * <p>
     * 提示：
     * <p>
     * 0 <= s.length <= 100
     * 0 <= t.length <= 10^4
     * 两个字符串都只由小写字符组成。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/is-subsequence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence(String s, String t) {
        //双指针
        int sp = 0;
        int tp = 0;
        int slen = s.length();
        int tlen = t.length();
        while (sp < slen && tp < tlen) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return sp == slen;
    }

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}

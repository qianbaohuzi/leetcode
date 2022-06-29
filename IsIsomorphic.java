import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

    /**
     * 给定两个字符串 s 和 t ，判断它们是否是同构的。
     * <p>
     * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
     * <p>
     * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
     * <p>
     * <p>
     * <p>
     * 示例 1:
     * <p>
     * 输入：s = "egg", t = "add"
     * 输出：true
     * 示例 2：
     * <p>
     * 输入：s = "foo", t = "bar"
     * 输出：false
     * 示例 3：
     * <p>
     * 输入：s = "paper", t = "title"
     * 输出：true
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= s.length <= 5 * 104
     * t.length == s.length
     * s 和 t 由任意有效的 ASCII 字符组成
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/isomorphic-strings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isIsomorphic(String s, String t) {
        int length = s.length();
        //做两张 hash 表 分别处理映射重复的问题
        Map<Character, Character> smap = new HashMap<>(length);
        Map<Character, Character> tmap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            Character si = s.charAt(i);
            Character ti = t.charAt(i);
            if (smap.containsKey(si)) {
                Character value = smap.get(si);
                if (!value.equals(ti)) {
                    return false;
                }
            }
            if (tmap.containsKey(ti)) {
                Character value = tmap.get(ti);
                if (!value.equals(si)) {
                    return false;
                }
            }
            smap.put(si, ti);
            tmap.put(ti, si);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

}

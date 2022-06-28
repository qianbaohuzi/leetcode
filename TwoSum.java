import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {


    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * <p>
     * 你可以按任意顺序返回答案。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * 示例 2：
     * <p>
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     * 示例 3：
     * <p>
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     * <p>
     * <p>
     * 提示：
     * <p>
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * 只会存在一个有效答案
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        //解题 target - a = b
        // 判断 b 存在在集合中
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            //兼容 hash 表key重复问题
            //因为是两数之和 所以如果重复的key正好等于target的一半 则直接返回该key的两个value
            if (map.containsKey(key)) {
                if (target == (key + key)) {
                    return new int[]{i, map.get(key)};
                }
            }
            map.put(key, i);
        }

        Set<Integer> keySet = map.keySet();
        for (Integer a : keySet) {
            int b = target - a;
            if (map.containsKey(b)) {
                return new int[]{map.get(a), map.get(b)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int[] sum = twoSum(ints, 9);
        System.out.println(Arrays.asList(sum));
    }
}

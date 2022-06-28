import java.util.Arrays;

public class RunningSum {

    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     * <p>
     * 请返回 nums 的动态和。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
     * 示例 2：
     * <p>
     * 输入：nums = [1,1,1,1,1]
     * 输出：[1,2,3,4,5]
     * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
     * 示例 3：
     * <p>
     * 输入：nums = [3,1,2,10,1]
     * 输出：[3,4,6,16,17]
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= nums.length <= 1000
     * -10^6  <= nums[i] <=  10^6
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/running-sum-of-1d-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public static int[] runningSum(int[] nums) {
        // 定义新数组 用来存放结果数组
        // 定义一个变量 用来存放新数组之和
        int t = 0;
        int length = nums.length;
        if (length == 0) {
            return new int[]{0};
        }
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            t = t + nums[i];
            int a = t;
            ints[i] = a;
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = {3, 1, 2, 10, 1};
        int[] runningSum = runningSum(ints);
        Arrays.stream(runningSum).forEach(System.out::println);
    }
}

public class PivotIndex {


    /**
     * 给你一个整数数组   nums ，请计算数组的 中心下标 。
     * <p>
     * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
     * <p>
     * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
     * <p>
     * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [1, 7, 3, 6, 5, 6]
     * 输出：3
     * 解释：
     * 中心下标是 3 。
     * 左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ，
     * 右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11 ，二者相等。
     * 示例 2：
     * <p>
     * 输入：nums = [1, 2, 3]
     * 输出：-1
     * 解释：
     * 数组中不存在满足此条件的中心下标。
     * 示例 3：
     * <p>
     * 输入：nums = [2, 1, -1]
     * 输出：0
     * 解释：
     * 中心下标是 0 。
     * 左侧数之和 sum = 0 ，（下标 0 左侧不存在元素），
     * 右侧数之和 sum = nums[1] + nums[2] = 1 + -1 = 0 。
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= nums.length <= 104
     * -1000 <= nums[i] <= 1000
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/find-pivot-index
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {
        //采用双指针的方式 计算数组的总和
        int length = nums.length;
        if (length == 0) {
            return -1;
        }
        int right = 0;
        for (int num : nums) {
            right = right + num;
        }
        int left = 0;
        for (int i = 0; i < length; i++) {
            right = right - nums[i];
            if (left == right) {
                return i;
            }
            left = left + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {2, 1, -1};
        int index = pivotIndex(ints);
        System.out.println(index);
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = Math.max(first, num);
            } else if (num > second) {
                third = second;
                second = Math.max(second, num);
            } else if (num > third) {
                third = Math.max(third, num);
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
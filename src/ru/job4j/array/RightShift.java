package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                nums[nums.length - 1 - i] = nums[nums.length - 2 - i];
            } else {
                nums[1] = temp;
            }
        }
    }
}
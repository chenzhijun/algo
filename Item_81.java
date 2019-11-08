package me.chenzhijun.leetcode;

public class Item_81 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int[] m2 = merge(nums1, 3, nums2, 3);
        for (int s : m2) {
            System.out.print(s + ",");
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int len1 = 0, len2 = 0, i = 0;
        while (len1 < m && len2 < n) {
            if (nums1[len1] < nums2[len2]) {
                nums[i] = nums1[len1];
                len1++;
            } else {
                nums[i] = nums2[len2];
                len2++;
            }
            i++;
        }
        while (len1 < m) {
            nums[i] = nums1[len1];
            i++;
            len1++;
        }
        while (len2 < n) {
            nums[i] = nums2[len2];
            i++;
            len2++;
        }
        return nums;
        //mergeNums

        //sortNums
    }
}

package array;


/**
 * 题目 #
 * Given n non-negative integers a1, a2, …, an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 *
 *
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Example 1:
 *
 *
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * 题目大意 #
 * 给出一个非负整数数组 a1，a2，a3，…… an，每个整数标识一个竖立在坐标轴 x 位置的一堵高度为 ai 的墙，选择两堵墙，和 x 轴构成的容器可以容纳最多的水。
 *
 * 解题思路 #
 * 这一题也是对撞指针的思路。首尾分别 2 个指针，每次移动以后都分别判断长宽的乘积是否最大。
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] nums=new int[]{1,8,6,2,5,4,8,3,7};
        int result=ContainerWithMostWater.maxArea(nums);
        System.out.println(result);
    }

    public static  int maxArea(int[] nums){
        int start = 0,end = nums.length-1,max=0;
        while(start<end){
            int with=end-start;
            int hight=0;

            if(nums[start]<nums[end]){
                hight=nums[start];
                start++;
            }else {
                hight=nums[end];
                end--;
            }

            if(with*hight>max){
                max=with*hight;
            }


        }
        return max;
    }
}

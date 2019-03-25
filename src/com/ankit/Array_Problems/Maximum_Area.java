package com.ankit.Array_Problems;

/*Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.*/
public class Maximum_Area {

	public static int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
	public static void main(String[] args) {
		
		int arr[]={1, 8, 6, 2, 5, 4, 8, 3, 7};
		int output=maxArea(arr);
		System.out.println(output);
	}
}


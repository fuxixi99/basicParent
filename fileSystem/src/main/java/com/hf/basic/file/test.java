package com.hf.basic.file;

import java.util.Deque;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        int[]nums=new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        int []res=maxSlidingWindow(nums,k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> stack = new LinkedList<>();
        int i = 0;
        while (i < k) {
            while (!stack.isEmpty() && stack.getLast() < nums[i]) {
                //判断当前元素和栈定元素比较
                if (stack.getLast() < nums[i]) {
                    stack.removeLast();
                }
            }
            stack.add(nums[i]);
            i += 1;
        }
        int[] res = new int[nums.length - k + 1];
        while (i < nums.length) {
            res[i - k ] = stack.peek();
            //移除元素
            if (nums[i - k ] == stack.peek()) {
                stack.poll();
            }


            while (!stack.isEmpty() && stack.getLast() < nums[i]) {
                //判断当前元素和栈定元素比较
                if (stack.getLast() < nums[i]) {
                    stack.removeLast();
                }
            }
            stack.add(nums[i]);
            i += 1;
        }
        res[i-k]=stack.peek();
        return res;
    }
}

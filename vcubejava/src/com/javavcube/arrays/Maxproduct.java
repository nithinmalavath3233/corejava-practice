package com.javavcube.arrays;

public class Maxproduct {
	

	    public static int maxProduct(int[] nums) {

	        int leftProduct = 1;
	        int rightProduct = 1;
	        int result = nums[0];

	        for (int i = 0; i < nums.length; i++) {

	            leftProduct = leftProduct * nums[i];

	            rightProduct = rightProduct * nums[nums.length - 1 - i];

	            result = Math.max(result,
	                    Math.max(leftProduct, rightProduct));

	            if (leftProduct == 0) {
	                leftProduct = 1;
	            }

	            if (rightProduct == 0) {
	                rightProduct = 1;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        int[] nums = {2, 3, -2, 4};

	        int result = maxProduct(nums);

	        System.out.println("Maximum Product Subarray = " + result);
	    }
	}

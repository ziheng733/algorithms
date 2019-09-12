package com.ziheng733.algorithms.lintcode;

/**
 * 数字比较
 * @author wenziheng
 *
 */
public class NumCompareHelper {

	/**
	 * 283.三数之中的最大值
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}
	
	/**
	 * 返回两个数字的最大值
	 * @param a
	 * @param b
	 * @return
	 */
	public static int max(int a, int b) {
		return (a >= b) ? a : b;
	}

	public static void main(String[] args) {
		System.out.println(max(3, 4, 7));
	}
}

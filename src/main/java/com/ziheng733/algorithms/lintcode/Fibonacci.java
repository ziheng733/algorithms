package com.ziheng733.algorithms.lintcode;

/**
 * 斐波纳契数列
 * @author wenziheng
 *
 */
public class Fibonacci {

	/**
	 * 366. 斐波纳契数列
	 * 查找斐波纳契数列中第 N 个数(因为数列无穷，用int做演示)
	 * @param n
	 * @return
	 */
	public static int fibonacci(int n) {
		int num_1 = 0;
		int num_2 = 1;

		if(n == 1) {
			return num_1;
		}
		if(n == 2) {
			return num_2;
		}

		int sum = 0;
		for(int i = 3; i <= n; i++) {
			sum = num_1 + num_2;
			num_1 = num_2;
			num_2 = sum;
		}
		return sum;

		// 递归实现的运行效率太低
		// return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(8));
		System.out.println(fibonacci(40));
	}

}

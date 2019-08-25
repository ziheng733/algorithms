package com.ziheng733.algorithms.lintcode;

/**
 * 反转数字
 * @author wenziheng
 *
 */
public class NumReverseHelper {

	/**
	 * 反转3位整数
	 * @param num
	 * @return
	 */
	public static int reverse3DigitInt(int number) {
		int oneDigit = number % 1000 / 100;
		int twoDigit = number % 100 / 10;
		int threeDigit = number % 10 / 1;
		return 100 * threeDigit + 10 * twoDigit + 1 * oneDigit;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse3DigitInt(386));
	}
}

package com.ziheng733.algorithms.lintcode;

/**
 * 大小写转换
 * @author wenziheng
 *
 */
public class CaseConversion {

	/**
	 * 将一个字符由小写字母转换为大写字母
	 * @param c  : a ~ z
	 * @return A ~ Z
	 */
	public char lowerCase2UpperCase(char c) {
		if(c >= 'a' && c <= 'z') {
			return (char)(c - 32);
		}
		return c;
	}

	/**
	 * 讲一个字符由大写字母转换为小写字母
	 * @param c : A ~ Z
	 * @return a ~ z
	 */
	public char upperCase2LowerCase(char c) {
		if(c >= 'A' && c <= 'Z') {
			return (char)(c + 32);
		}
		return c;
	}

	public static void main(String[] args) {
		CaseConversion cc = new CaseConversion();
		System.out.println(cc.lowerCase2UpperCase('b'));
		System.out.println(cc.lowerCase2UpperCase('C'));
		System.out.println(cc.upperCase2LowerCase('J'));
		System.out.println(cc.upperCase2LowerCase('z'));
	}

}

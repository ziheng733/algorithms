package com.ziheng733.algorithms.lintcode;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * 454.矩形面积
	 * @return
	 */
	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		int width = 10;
		int height = 5;
		Rectangle rectangle = new Rectangle(width, height);
		System.out.println(rectangle.getArea());
	}

}

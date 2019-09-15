package com.ziheng733.algorithms.lintcode;

import java.util.Arrays;

/**
 * 463. 整数排序
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。 
 * 
 * @author wenziheng
 *
 */
public class IntSort {

	/**
	 * 选择排序
	 * 
	 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
	 * 以此类推，直到所有元素均排序完毕。
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] selectionSort(int[] arr) {
		if(arr.length == 0) {
			return arr;
		}
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				minIndex = arr[minIndex] < arr[j] ? minIndex : j;
			}
			exchange(arr, i, minIndex);
		}
		return arr;
	}

	/**
	 * 冒泡排序
	 * 
	 * 它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
	 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {
		if(arr.length == 0 || arr.length == 1) {
			return arr;
		}
		boolean exchangeHappened = false;
		do {
			exchangeHappened = false;
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					exchangeHappened = true;
					exchange(arr, j, j + 1);
				}
			}
		}while(exchangeHappened);

		return arr;
	}

	/**
	 * 插入排序
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int[] arr) {
		//TODO:
		return null;
	}

	public static void exchange(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 2, 0, 9, 8};
//		selectionSort(arr);
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

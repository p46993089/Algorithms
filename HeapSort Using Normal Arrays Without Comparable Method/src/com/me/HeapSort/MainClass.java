package com.me.HeapSort;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of elements to be sorted");
		int n = src.nextInt();
		int data[] = new int[n];
		System.out.println("Enter the numbers to be sorted");
		for(int i=0; i<n;i++){
			data[i] = src.nextInt();
		}
		HeapSort heapSort = new HeapSort(data, n);
		heapSort.heapSort();
		System.out.println("Sorted List is \n");
		heapSort.printData();
	}

}

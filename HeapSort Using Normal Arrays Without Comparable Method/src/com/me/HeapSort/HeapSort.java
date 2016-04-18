package com.me.HeapSort;

public class HeapSort {
	private int input[],size;
	
	public HeapSort(int dataIn[],int n){
		size = n;
		input = new int[size];
		for(int i=0;i<size;i++){
			//retrieving the user input
			input[i] = dataIn[i];			
		}
	}
	//function to compare and sort the data
	public void heapSort(){
		int position, temp;
		for(int N = size;N>=1;N--){
			for(int i=1;i<N;i++){ //child loops start from position 1
				position = i;
				do{
					int p = (position-1)/2;
					//checking if value of child is greater than for swap
					if(p<0 || input[p]>= input[position])
						break;
					
					temp =input[position];
					input[position] = input[p];
					input[p] = temp;
					
					position = p;
				}while(true);	
			}
			//swapping largest element on top with smallest in the list
			temp = input[0];
			input[0] = input[N-1];
			input[N-1] = temp;
			
			
		}
	}
	
	public void printData(){
		for(int i =0;i<size;i++){
			System.out.println(input[i]);
		}
		System.out.println();
	}
	
}

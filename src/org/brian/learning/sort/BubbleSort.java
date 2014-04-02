package org.brian.learning.sort;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {

	private ArrayList<Integer> sortArray;
	
	public BubbleSort(ArrayList<Integer> sortArray){
		this.sortArray = sortArray;
	}
	
	//a,b -> b,a 
	private void swapElement(int a, int b){
		Integer tmp = this.sortArray.get(b);
		this.sortArray.set(b, this.sortArray.get(a));
		this.sortArray.set(a, tmp);
	}
	
	public ArrayList<Integer> doSort(){
		int size = this.sortArray.size();
		
		for(int out = (size - 1); out > 1; out--){
			for(int in = 0; in < out; in ++){
				if(this.sortArray.get(in).compareTo(this.sortArray.get(in+1)) > 0 ) {
					this.swapElement(in, in+1);
				}
			}	
		}
		
		return this.sortArray;
	}
	
	public static void main(String[] args){
		final int NUMBER = 15;
		ArrayList<Integer> sortArray = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int index = 0; index < NUMBER; index++){
			sortArray.add(random.nextInt(NUMBER));
		}
		
		BubbleSort bubbleSort = new BubbleSort(sortArray);
		ArrayList<Integer> sortedArray = bubbleSort.doSort();
		
		for(int index = 0; index < NUMBER; index++){
			System.out.print( sortedArray.get(index) + " ");
		}
		
	}
}

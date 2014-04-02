package org.brian.learning.sort;

import java.util.ArrayList;
import java.util.Random;

public class SelectSort {

	private ArrayList<Integer> sortArray;
	
	public SelectSort(ArrayList<Integer> sortArray){
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
		int min,in;
		for(int out = 0; out < size - 1; out ++){
			min = out;
			for(in = out + 1; in < size; in ++){
				if(this.sortArray.get(in).compareTo( this.sortArray.get(min) ) < 0){
					min = in;
				}
			}
			this.swapElement(out, min);
		}
		
		return this.sortArray;
	}
	public static void main(String[] args) {
		final int NUMBER = 15;
		ArrayList<Integer> sortArray = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int index = 0; index < NUMBER; index++){
			sortArray.add(random.nextInt(NUMBER));
		}
		
		SelectSort selectSort = new SelectSort(sortArray);
		ArrayList<Integer> sortedArray = selectSort.doSort();
		
		for(int index = 0; index < NUMBER; index++){
			System.out.print( sortedArray.get(index) + " ");

		}
	}
}

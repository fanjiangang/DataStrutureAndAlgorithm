package org.brian.learning.sort;

import java.util.ArrayList;
import java.util.Random;

public class InsertSort {

	private ArrayList<Integer> sortArray;
	
	
	public InsertSort(ArrayList<Integer> sortArray) {
		this.sortArray = sortArray;
	}

    public ArrayList<Integer> doSort(){
    	
    	int size = this.sortArray.size();
    	for(int out = 1; out < size; out++){
    		
    		Integer temp = this.sortArray.get(out);
    		int in = out;
    		while(in > 0 && this.sortArray.get(in - 1).compareTo(temp) > 0){
    			this.sortArray.set(in, this.sortArray.get(in - 1));
    			in--;
    		}
    		this.sortArray.set(in, temp);
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
		
		InsertSort insertSort = new InsertSort(sortArray);
		ArrayList<Integer> sortedArray = insertSort.doSort();
		
		for(int index = 0; index < NUMBER; index++){
			System.out.print( sortedArray.get(index) + " ");

		}
	}
}

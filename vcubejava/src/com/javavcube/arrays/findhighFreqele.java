package com.javavcube.arrays;
import java.util.*;
public class findhighFreqele {

	public static void main(String[] args) {
		HashMap<Integer,Integer> freq =new HashMap<>();
		int arr[]= {1,5,4,5,3,5,4,5,2,3,2,10,80,2,3,2,3,3,4,1,4};
		
		for(int num:arr) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		for(int i : freq.keySet()) {
		    System.out.println(i + "-->" + freq.get(i));
		}
		int maxfreq=Integer.MIN_VALUE;
		int maxfreqkey=-1;
		int minfreq=Integer.MAX_VALUE;
		int minfreqkey=-1;
		for(int Key:freq.keySet()) {
			int currfreq = freq.get(Key);
			int currfreqKey = Key;
			
			if(currfreq>maxfreq) {
				maxfreq=currfreq;
				maxfreqkey=currfreqKey;
			}
			if(currfreq<minfreq) {
				minfreq=currfreq;
				minfreqkey=currfreqKey;
			}
			}
		System.out.println("max frequency elements   :"+  maxfreqkey+"   count -->"+maxfreq);
		System.out.println("min  frequncy elements   :"+   minfreqkey+"    count -->"+minfreq);

	}
}

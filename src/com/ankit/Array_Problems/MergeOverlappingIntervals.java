package com.ankit.Array_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class MergeOverlappingIntervals {

	public static LinkedList<Interval> mergeIntervals(List<Interval> intervals) {
		// Sort Intervals in decreasing order of
		// start time
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start < i2.start ? -1 : i1.start == i2.start ? 0 : 1;
			}
		});

		
		LinkedList<Interval> linkedList=new LinkedList<Interval>();
		for(Interval interval:intervals)
		{
			if(linkedList.isEmpty() || linkedList.getLast().end<interval.start)
			{
				linkedList.add(interval);
			}
			else
			{
				linkedList.getLast().end=Math.max(linkedList.getLast().end, interval.end);
			}
		}
		
		return linkedList;
	}

	public static void main(String args[]) {

		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1, 3));
		list.add(new Interval(2, 6));
		list.add(new Interval(8, 10));
		list.add(new Interval(15, 18));
		LinkedList<Interval> listResult=mergeIntervals(list);
		for(int i=0;i<listResult.size();i++){
		System.out.println("(" + listResult.get(i).start+ " ," + listResult.get(i).end + ")");
	}}
}

class Interval {
	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

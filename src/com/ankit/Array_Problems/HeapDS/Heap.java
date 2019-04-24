package com.ankit.Array_Problems.HeapDS;

public class Heap {

	private int[] heap;
	private int size;

	public Heap(int capacity) {
		heap = new int[capacity];
	}

	public void insertHeap(int value) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		heap[size] = value;
		fixHeapAbove(size);
		size++;
	}

	public int delete(int index) {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}

		int parent = getParent(index);
		int deletedValue = heap[index];

		heap[index] = heap[size - 1];
		
		if(index==0 || heap[index]<heap[parent])
		{
			fixHeapBelow(index, size-1);
		}
		else
		{
			fixHeapAbove(index);
		}
		size--;
		return deletedValue;
		
	}

	private void fixHeapAbove(int index) {
		int newValue = heap[index];

		while (index > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}

		heap[index] = newValue;

	}

	private void fixHeapBelow(int index, int lastHeapIndex) {

		int childtoswap;

		while (index <= lastHeapIndex) {
			int leftChild = getchild(index, true);
			int rightChild = getchild(index, false);
			if (leftChild <= lastHeapIndex) {
				if (rightChild > lastHeapIndex) {
					childtoswap = leftChild;
				} else {
					childtoswap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
				}

				if (heap[index] < heap[childtoswap]) {
					int temp = heap[index];
					heap[index] = heap[childtoswap];
					heap[childtoswap] = temp;
				} else {
					break;
				}
				index = childtoswap;
			}
			else
			{
				break;
			}
		}
	}

	public void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(heap[i] + " ");
			System.out.print(",");
		}
		
		System.out.println();
	}
	
	public boolean isFull() {
		return size == heap.length;
	}

	public int getParent(int index) {
		return (index - 1) / 2;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getchild(int index, boolean left) {
		return 2 * index + (left ? 1 : 2);
	}
	
	
	public static void main(String[] args) {
		Heap heap=new Heap(10);
		heap.insertHeap(80);
		heap.insertHeap(75);
		heap.insertHeap(60);
		heap.insertHeap(76);
		heap.insertHeap(55);
		heap.insertHeap(40);
		heap.insertHeap(52);
		heap.insertHeap(67);
		heap.print();
		
		heap.delete(0);
		heap.print(); 
		
	}
}

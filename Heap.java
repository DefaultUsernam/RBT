// Ulises Cantor
// 2/22/2026
// Menchukov
// Computer Programing 3
// Period 5
// Heaps assignment - creates a heap data structure type
// no negatives or zeroes added
// add a variable

/* 
public class Heap {

//the actual storage structure for your heap

private int[] arr;
private int lastInt;
 

//constructor for your heap

//feel free to make one that takes in an array if you prefer for your testing purposes.

//note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing

//the array

public Heap() {

arr = new int[100];
lastInt = 0;

}

 

 

//create this function to add elements to your heap

//all heap properties must be preserved

// 5 points

public void add(int toAdd) {
arr[lastInt] = toAdd;
siftUp(lastInt);
lastInt++;
}






 

//remove the largest element of the heap (the root) and re-heapafy

//5 points

public void removeMax() {
    if (lastInt == 0){
        return;
    }
    arr[0] = arr[--lastInt];
    siftDown(0);
}

 

//this should check and alter the tree after an item is inserted

//3 points

private void siftUp(int index) {
    while(index>0){
    int parent = (index-1)/2;
    if (arr[parent] < arr[index]){
        int temp = arr[index];
        arr[index] = arr[parent];
    arr[parent] = temp;
    index = parent;
    }
    else{
        break;
    }
    }
}

 

//this should check and alter the tree after an item is deleted.

//3 points

private void siftDown(int index) {
while(2*index+1<lastInt){
    int left = 2*index+1;
    int right = 2*index+2;
    int a = left;
    if(right<lastInt && arr[right] > arr[left]){
        a = right;
    }
    if (arr[index] < arr[a]){
        int temp = arr[index];
        arr[index] = arr[a];
        arr[a] = temp;
        index = a;
    }
    else{
        break;
    }
}
}

 

//4 points for syntax conventions.
}
*/
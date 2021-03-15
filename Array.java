
public class Array { 

private int[] items;
private int count;

public Array(int length){

items = new int[length] ;

}


public void insert(int item){

// Resize if array is full and add new item and the end of the array

if(items.length == count){

     // Create a new Array.
    int[] newItems = new int[count*2];
 
    // Copy all existing items.
    for(int x = 0 ; x<count; x++)
        newItems[x] = items[x];

    // Set items to new Array items.
    items = newItems;
}

   items[count++]= item;
    
}


public void removeAt(int index){
//Validate the index

if(index < 0 || index >= count)
     throw new IllegalArgumentException();


//Shift item to the left
for(int x = index; x<count; x++)
    items[x] = items[x+1];


count--;

}


public int indexOf(int item){


 for(int x = 0; x< count; x++)
    if(items[x] == item)
       return x;


 return -1 ;
}


public void print(){
    for(int x = 0 ; x<count; x++)
       System.out.println(items[x]);
}


}
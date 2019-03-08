import java.util.Arrays;
public class JavaRecurv{
/**
*Test cases for the method
*/
static int [] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
static int val = 18;
public static void main(String [] args){
recursiveLinearSearch(data,0,val);

}



public static int recursiveLinearSearch(int [] a , int i ,  int val){
//the first step is sorting the array
Arrays.sort(a);
/**
All the integer values are declared
*/
int first_item = 0;
int last_item = a.length - 1;
int middle_item = 0;
int val_needed = 0;
//this loops through the array


//this checks to make sure that as we break down our array into smaller blocks, we stop once it is up to zero
while(first_item <= last_item){
//the middle item is derived and floored if there is a remainder
middle_item = (first_item + last_item) % 2 == 0 ? (first_item + last_item) / 2 : ((first_item + last_item) - 1) / 2;
//a check is carried out to see if the middle item equals the value we are looking for
if(a[middle_item]==val){
val_needed = middle_item;

System.out.println("item found at : " + val_needed);
break;


}
//if the first check returns false, and the middle value is higher than the value 
//we are searching for, then we will set the last value to be the middle value minus one
//this is because our new last value will be to the left of the middle item
else if(a[middle_item] > val){

last_item = middle_item - 1;


}
//if the second check returns false, and the middle value is lesser than than value we are looking for
//we will set the first value to be plus one of the middle value meaning that our new search has eliminated the left hand side
//we now have focus on a  new set of array
else if(a[middle_item] < val){
first_item = middle_item + 1;
}
else{
System.out.println("item not found");
return - 1;
}

}//end of while loop

return val_needed;
}//end of the method recursivesearch

//in binary search, the first condition is data must be sorted
}//closing of class

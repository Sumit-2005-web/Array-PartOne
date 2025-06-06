import java.util.*;

public class PartOne{ 
  // Passing an array as arguments in method
public static int linearSearch(int numbers[], int key){
   for(int i = 0; i < numbers.length; i++){
    if(numbers[i] == key){
        return i;
    }
   }

   return -1;
}

public static int foundMenuIndex(String menu[], String findMenu){
    for(int i = 0; i < menu.length; i++){
        if(menu[i] == findMenu){
            return i;
        }
    } 
    return -1;
}

public static int findLargestInteger(int numbersOne[]){ // Time complexity O(n) as TC is directly proportional to for loop that goes till n opeartion as n is arr.length
    int largest = Integer.MIN_VALUE; // - infinity
    int smallest = Integer.MAX_VALUE; //+ve infinity

    for(int i = 0; i < numbersOne.length; i++){
        if(largest < numbersOne[i]){
            largest = numbersOne[i];
        }
    }

    return largest;
}

// Binary Search Techniques on Array
public static int binarySearch(int numArr[], int findVal){
    int start = 0;
    int end = numArr.length-1;

    while(start <= end){
        int mid = (start + end) / 2; // Formula to find

        if(numArr[mid] == findVal){
            return mid;
        } 
        if(numArr[mid] < findVal){  // Right Condition
            start = mid+1;
        } else { // Left condition
            end = mid - 1;
        }
    }

    return -1;
}

// Reversing an array
public static void reverseArray(int numArr[]){
    int start = 0, end = numArr.length - 1;

    while(start < end){
        int temp = numArr[end];
        numArr[end] = numArr[start];
        numArr[start] = temp;

        start++;
        end--;
    }
}

// Printing pairs in an array
public static void pairsArray(int newNumArr[]){ // Time complexity O(n*n) due to nested loops
    for(int i = 0; i < newNumArr.length; i++){
        int currVal = newNumArr[i]; // Starts with 2, 4, 6, 8, 10 etc how numbers are arranged in an array
        for(int j = i + 1; j < newNumArr.length; j++){
            System.out.print("(" + currVal + "," + newNumArr[j] + ")");
        }
        System.out.println();
    }
}


public static void printSubArr(int newNumArr[]){
    int totalSubArr = 0;
    for(int i = 0; i < newNumArr.length; i++){
        int start = i; // start num
        for(int j = i; j < newNumArr.length; j++){
            int end = j;
            for(int k = start; k <= end ; k++){ // for printing only no logic
                System.out.print(newNumArr[k] + ",");
            }
            System.out.println();
                totalSubArr++;
        }
        System.out.println();
    }
     System.out.println("Total Subarrays: " + totalSubArr);
}

    public static void main(String args[]){  
    int numbers[] = {2, 4, 6, 8, 10, 12, 14}; 
    int key = 10;

    int foundIndex = linearSearch(numbers, key);  // Time complexity O(n)
    if(foundIndex == -1){
        System.out.println("Index not found");
    } else {
        System.out.println("Index found " + foundIndex);
    }


    // 2nd Linear-Search Arrays
    String menu[] = {"dosa", "samosa", "vada", "sandwich", "coke"};
    String findMenu = "coke";

       int foundMenuIndexVal = foundMenuIndex(menu, findMenu);  // Time complexity O(n)
    if(foundMenuIndexVal == -1){
        System.out.println("Order not found");
    } else {
        System.out.println("Menu found " + foundMenuIndexVal);
    }

    // 3rd Question to find Largest Number in an array using Linear Search
    int numbersOne[] = {1, 3, 2, 5, 9, 6};

    int largestNum = findLargestInteger(numbersOne);
    System.out.println(largestNum);



    // 4th Question Based on Binary Search on Arrays
    int numArr[] = {2, 4, 6, 8, 10, 12, 14};  // Time Complexity O(log n)
    int findVal = 6;

    int findBinaryKey = binarySearch(numArr, findVal);
    if(findBinaryKey == -1){
        System.out.println("Key Not found");;
    } else {
        System.out.println("Key found : " + findBinaryKey);
    }

   //5th Question on Reversing an array
   reverseArray(numArr);
   
   for(int i = 0; i < numArr.length; i++){    // For printing values of reversed array
    System.out.print(numArr[i] + " ");
   }
   System.out.println();
  
  // 6th Question Print Pairs in an array
  int newNumArr[] = {2, 4, 6, 8, 10};
//   pairsArray(newNumArr);

  // 7th Question for printing subarrays
  printSubArr(newNumArr);

    }
}
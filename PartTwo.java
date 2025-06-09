import java.util.*;

public class PartTwo{


    public static void printMaxSubarrays(int numArr[]){ // Time complexity O(N*N*N) and space complexity will be O(1) and Brute force approach
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numArr.length; i++){   // Outer loop till n length
            for(int j = i; j < numArr.length; j++){ // sub outer loop till n length
        int currSum = 0;  // reset for every subarrays
                for(int k = i; k <= j; k++){ // Inner loop that goes as well till n 
                    // sum of subarrays
                    currSum += numArr[k];
                }
            System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;;
                }
            }
        }
       System.out.println("Max of sub arrays is " + maxSum);   
    }


    public static void maxSubArray(int numArr[]){  // 2nd Approach Prefix Sum TC = O(n * n)
     int maxSum = Integer.MIN_VALUE;
     int preArr[] = new int[numArr.length];
     int currSum = 0;

     // calculate prefix array
     preArr[0] = numArr[0];
     for(int i = 1 ; i < numArr.length; i++){
        preArr[i] = preArr[i-1] + numArr[i];
     }

     // same logic loop
     for(int i = 0; i < numArr.length; i++){
        int start= i;
        for(int j = i; j < numArr.length; j++){
            int end = j;

           currSum = start == 0 ? preArr[end] : preArr[end] - preArr[start-1];

           if(maxSum < currSum){
            maxSum = currSum;
           } 
        }
     }

     System.out.println("Max of subarray sum is = " + maxSum);
    }
    

public static void kadaneAlgo(int numArr[]) { // Kadane algorithm 
    int maxSum = numArr[0];  // Initialize to first element
    int currSum = numArr[0];

    for (int i = 1; i < numArr.length; i++) {
        currSum = Math.max(numArr[i], currSum + numArr[i]); // include or start fresh
        maxSum = Math.max(maxSum, currSum); // track max
    }

    System.out.println("Maximum Subarray Sum = " + maxSum);
}
    
    public static void main(String args[]){
    int numArr[] = {-2, -3, -4, -1, -2, -1, -5, -3};

    // printMaxSubarrays(numArr);
    // maxSubArray(numArr);
    kadaneAlgo(numArr);
    }
}
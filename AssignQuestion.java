import java.util.*;

public class AssignQuestion{
    public static boolean repeatArr(int numsArr[]){
     boolean repeatedNumber = false;  // Considering that every number array is distinct and contains non-repetitive numbers
     int firstIndex = numsArr[0]; // To store firstIndex of an array 

     for(int i = 0; i < numsArr.length; i++){ // Time complexity O(n * n) space complexity O(1)
      int start = i;
      for(int j = start + 1; j < numsArr.length; j++){
        if(numsArr[i] == numsArr[j]){
            repeatedNumber = true;
            return repeatedNumber;
        }
      }
     }
     
      return repeatedNumber;
    }


    // public static int sortedArr(int numsArr[], int target){ // TC = O(n) 
    //     for(int i = 0; i < numsArr.length; i++){
    //         if(numsArr[i] == target){
    //             return i;
    //         }
    //     }

    //     return -1;
    // }

   public static int newSortedArr(int numsArr[], int target){
    int start = 0;
    int end = numsArr.length - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(numsArr[mid] == target){
            return mid;
        }

        // Check if left half is sorted
        if(numsArr[start] <= numsArr[mid]){
            // Target lies in left sorted half
            if(numsArr[start] <= target && target < numsArr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // Right half is sorted
        else {
            if(numsArr[mid] < target && target <= numsArr[end]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    return -1;
}

public static int buyAndSellStockProfit(int prices[]){
    int maxProfit =  Integer.MIN_VALUE;

    for(int i = 0; i < prices.length; i++){
        int buyPrice = prices[i];
        for(int j = i + 1; j < prices.length; j++){
           int profit = prices[j] - buyPrice;
           if(profit > 0){
            maxProfit = Math.max(maxProfit, profit);
           }
        }
    }

    if(maxProfit > 0){
        return maxProfit;
    } else {
    return 0;
    } 
}

public static int trappedRainWater(int rainArr[]){
    // calculate the left index -  auxiliary array
    int leftArr[] = new int[rainArr.length];
    leftArr[0] = rainArr[0];
    for(int i = 1; i < rainArr.length; i++){
        leftArr[i] = Math.max(rainArr[i], leftArr[i-1]);
    }
        // calculate the right index - auxiliary array
    int rightArr[] = new int[rainArr.length];
rightArr[rainArr.length - 1] = rainArr[rainArr.length - 1];
    for(int i = rainArr.length - 2; i >= 0; i--){
        rightArr[i] = Math.max(rainArr[i], rightArr[i+1]);
    }
    
    int trappedRainWater = 0; // Initializing with 0
    // loop
    for(int i = 0; i < rainArr.length; i++){
    // Calculate water level 
        int waterLevel = Math.min(leftArr[i], rightArr[i]);
    // Calculate trapped rain water
        trappedRainWater += waterLevel - rainArr[i];
    }

    return trappedRainWater;
}



    
    
    public static void main(String args[]){
     int numsArr[] = { 4,  5, 6, 7, 0, 1, 2};
     int target = 0;
     int prices[] = {7, 6, 4,  3, 1};
     int rainArr[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
     int newNum[] = {-1, 0,  1, 2, -1, -4};

    //  System.out.println(newSortedArr(numsArr, target));
    // System.out.println(buyAndSellStockProfit(prices));
    // System.out.println(trappedRainWater(rainArr));
    threeSumSubArr(newNum);
    }
}
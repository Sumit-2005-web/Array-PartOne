import java.util.*;

public class ImpQuestion{

   public static int trapWater(int height[]){
    //Calculate left-max boundary -  Auxiliary array
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for(int i = 1; i < height.length; i++){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
    // Calculate right-max boundary - Auxiliary Array
    int rightMax[] = new int[height.length];
    rightMax[height.length-1] = height[height.length-1];
    for(int i = height.length - 2; i >= 0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedRainWater = 0;

    //loop
for(int i = 0; i < height.length; i++){
     //Waterlevel = min(leftmaxboundary, rightmaxboundary)
    int waterLevel = Math.min(leftMax[i], rightMax[i]);  
    //Trapped Water = waterlevel - height[i]    
    trappedRainWater += waterLevel - height[i];  
}

return trappedRainWater;
   }

   // 2nd Question Best time to buy & sell stocks 
   public static int maxProfit(int prices[]){
    int minPrice = Integer.MAX_VALUE;  // For tracking min valuer of a stock
    int maxProfit = 0;

    for(int i = 0; i < prices.length; i++){
        if(prices[i] < minPrice){
            minPrice =  prices[i];
        } else {
             int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }   
    }

    if(maxProfit < 0){
        return 0;
    }

    return maxProfit;
   }



    public static void main(String args[]){
     int height[] = {4, 2, 0, 6, 3, 2, 5};
     int prices[] = {7, 1, 5, 3, 6, 4};

    //  System.out.println(trapWater(height));
     System.out.println(maxProfit(prices));
    }
}
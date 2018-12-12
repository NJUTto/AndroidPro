package com.ds.avare.utils;

public class Midnum {
   public static int median(int []num){
       if(num.length==0)
           return 0;
       int start = 0;
       int end = num.length - 1;
       int index = partition(num,start,end);
       if(num.length%2 == 0){
           while(index != num.length/2-1){
               if (index > num.length / 2 - 1) {
                   index = partition(num,start,index-1);
               }
               else{
                   index = partition(num,index+1,end);
               }
           }
       }
       else{
           while(index != num.length/2){
               if (index > num.length / 2 ) {
                   index = partition(num,start,index-1);
               }
               else{
                   index = partition(num,index+1,end);
               }
           }
       }
       return num[index];
   }
   private static int partition(int num[],int start,int end){
       int left = start;
       int right = end;
       int mid = num[left];
       while(left<right){
           while(left<right && num[right]>=mid)
               right--;
           if(left<right){
               num[left]=num[right];
               left++;
           }
           while(left<right && num[right]<=mid)
               left++;
           if(left<right){
               num[right]=num[left];
               right--;
           }
       }
       num[left] = mid;
       return left;
   }
}



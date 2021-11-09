/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab2;
import java.util.Scanner;
/**
 *
 * @author ECBME
 */
public class ProceduraAbstraction {
    
    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive intefer n for which n!
    //          (i.e. 1*2*3*...*n) is greater than or equal to x, for posotive integer x.
    //Otherwise returns 1.
    
    public static int reverseFactorial(int x){
        //code is to be written here
        int prod = 1;
        int i;
        if(x > 0){
            for(i = 1; i <= x ; i++)
            {
                prod = prod * i;
                if(prod >= x) return i;
            }
                }
        else System.out.println("Enter a positive number.");
        return 0;
    }
    
    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    //          returns ture. Otherwise returnes false.
    
    public static boolean isMatrixNice(int[][] arr){
        //code is to be written here
       //First we check if the array we input is null or not
          if(arr == null) return false;
     
          int sum = 0;
          
          
          for(int i = 0;i<arr.length;i++){
          //here we check if the matrix is square matrix or not
            if(arr[i].length != arr.length) return false;
            
          //lets find the sum of the elemnts in the current row
          int s = 0;
          for(int j = 0;j < arr[i].length ; j++) s = s +arr[i][j];
          
          //for the first row, setting s equal to sum
          if(i == 0) sum = s;
          //and since the very first line will run
          //this will set the sum to be the addition of first row
          //which we can use to compare to the rest of the rows
          //and checking for the remaining, if s not equal to sum return false
          else if(sum != s) return false;
          }
          
          //Now adding another for loop for checking up at the columns
          for(int i = 0; i < arr.length ; i++){
            int s = 0;
            for(int j = 0; j < arr[i].length ; j++) s = s + arr[j][i];
            
            if(s != sum) return false;
          }
          
          //lets code up for the diagnols sum now
          int sd1 = 0, sd2 = 0;
          
          for(int i = 0; i < arr.length ; i++){
              sd1 = arr[i][i] + sd1;
              sd2 = arr[arr.length - 1 - i ][i] + sd2;
          }
          
          // checking if any of the diagnoals sum match or not with the sum of the row
          if (sd1 != sum || sd2 != sum) return false;
          else { System.out.println(sum);
                 return true;
          }
    }
}

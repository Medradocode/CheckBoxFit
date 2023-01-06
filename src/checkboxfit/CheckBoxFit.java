/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkboxfit;

import java.util.Scanner;

/**
 *
 * @author renan
 */
public class CheckBoxFit {

   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      Box box1 = new Box();
   
      System.out.println("----- Checking Box 1 fits in Box 2 -----\n");
      
      System.out.println("Write BOX 1 data:     EX: 1 2 3....");
      box1.height = input.nextInt();
      box1.length = input.nextInt();
      box1.width = input.nextInt();
     
      Box box2 = new Box();
      System.out.println("Write BOX 2 data:     EX: 1 2 3....");
      box2.height = input.nextInt();
      box2.length = input.nextInt();
      box2.width = input.nextInt();
      
      if(canBox1FitinBox(box1,box2) == true){
          System.out.println("Box 1 will fit in Box 2 ");
        }else{
          System.out.println("Box 1 won't fit in Box 2 ");
      }
         
       
  }

    public static boolean canBox1FitinBox(Box box1, Box box2){
        boolean result;
        if(box1.getLongestSide()< box2.getShortestSide()){
            result = true;
            
        }else{
            result = false;
       
        }
    return result;
  }
}


class Box{
      int length = 0;
      int width = 0;
      int height = 0;
      
      public int getLongestSide(){
    
      int max = length;
      if(width > max){
        max = width;
      }
      if(height > max){
        max = height;
      }
      return max;
      }
      
      public int getShortestSide(){
          
          int min = length;
          if(width < min){
              min = width;
          }
          if(height < min){
              min = height;
          }
          return min;
      }
}


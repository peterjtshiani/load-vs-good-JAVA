/**************************

                 create a file name Main.java or give it any name. 
                but the file name and class name needs to be the same.

***************************/

import java.util.*;  
public class Main   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  

//   the input tage of the load capacity
System.out.print("Enter the Load capacity of the vehicle : ");  
int LoadCapacity= sc.nextInt();

//  the first load input tag
System.out.print("Enter the Load the First Good : ");  
int load1= sc.nextInt();  

//  the second load input tag
 System.out.print("Enter the Load the Second Good : ");  
int load2= sc.nextInt();  

//  the third load input tag
 System.out.print("Enter the Load the Third Good : ");  
int load3= sc.nextInt(); 

// calculating the sum of the load
int TotalLoad = load1+load2 +load3 ;

// getting the difference between the load capacity and the loads of Goods
int result = LoadCapacity - TotalLoad;

// setting up a condition to determine if the load of Good is greater than the load capacity

System.out.println("\nYour result are : \n");
if(TotalLoad < LoadCapacity){
    System.out.println("The load of Goods is less then the load capacity by : " +result+" kg");
}else{
    int resultPo = (~(result - 1));
    System.out.println("The load of Goods is greater then the load capacity by : " +result);
    System.out.println("The correct value is  : " +resultPo +" kg");
}  
}  
}
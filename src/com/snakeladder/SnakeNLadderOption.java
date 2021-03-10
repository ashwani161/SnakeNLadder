package com.snakeladder;
import java.lang.Math;   

public class SnakeNLadderOption{
     public static void main(String []args){
        int N=0;
        int count=0;
        do{
           count++;
           int option=(int) ((Math.random()*3)+1);
           System.out.println("option:"+ option);
           if(option==1)
           {
        	   System.out.println("No Play");
        	   continue;
           }
           int throwCount=(int) ((Math.random()*7)+1);
           if(option==2) {
        	   System.out.println("Moving Forward");
           }
           else if(option==3)
           {
        	   System.out.println("Moving Backward");
        	   throwCount= -throwCount;
           }
           System.out.println("Dice number is "+throwCount);
           if(N+throwCount<=100 && N+throwCount>0) {
        	   N=N+throwCount;
           }else {
        	   System.out.println("Could not move coin, you should get "+(100-N)+" to win");
        	   continue;
           }
           
           switch (N){
           		//ladders
           		case 2: 
           			N=38;
           			System.out.println("Ladder!");
           			break;
           		case 4:
           			N=14;
           			System.out.println("Ladder!");
           			break;
           		case 9:
           			N=31;
           			System.out.println("Ladder!");
           			break;
           		case 33:
           			N=85;
           			System.out.println("Ladder!");
           			break;
           		case 52:
           			N=88;
           			System.out.println("Ladder!");
           			break;
           		case 80:
           			N=99;
           			System.out.println("Ladder!");
           			break;
           		//snakes
           		case 51:
           			N=11;
           			System.out.println("Snake!");
           			break;
           		case 56:
           			N=15;
           			System.out.println("Snake!");
           			break;
           		case 62:
           			N=57;
           			System.out.println("Snake!");
           			break;
           		case 92:
           			N=53;
           			System.out.println("Snake!");
           			break;
           		case 98:
           			N=8;
           			System.out.println("Snake!");
           			break;
           		
           }
           System.out.println("Coin moved to "+N); 
            
            
        }while(N!=100 );
        
        System.out.println("You won after "+count+" dice throws");
        
        
        
     }
}
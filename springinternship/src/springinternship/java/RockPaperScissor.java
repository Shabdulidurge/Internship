package springinternship.java;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
       public static  String ROCK = "R";
       public static  String PAPER = "P";
       public static  String SCISSORS = "S";
        public static int user1 = 1;
        public static int user2 = 2;
        public static int user3 = 3;
        public static int user4 = 4;
	  
        public RockPaperScissor(String ROCK , String PAPER , String SCISSORS) {
		    super();
		  this.ROCK = ROCK;
		  this.PAPER = PAPER;
		  this.SCISSORS = SCISSORS;
		}
        
          static void show() {
        	  System.out.println(ROCK+" "+PAPER+"  "+SCISSORS);
          }
          
	     public static String getResult()
	     {
	    	  String moves = null;
	    	 for(int round = 0 ; round<50 ; round++) {
	    		 Random rand = new Random();
                int input = rand.nextInt(3) + 1;
                 if(input == 1)
                	 moves = RockPaperScissor.ROCK;
                 else if(input == 2)
                	 moves = RockPaperScissor.PAPER;
                 else
                	 moves = RockPaperScissor.SCISSORS;
                      show();
                	 System.out.println("User chose"+moves);
                	 System.out.println();
                	 }
			return moves;
			}
 
	        public static String Userchoice() {
	        	String userchoice = null;
	        	 Random r = new Random();
	        	 int u = r.nextInt(4) + 1;
	        	 if(u == 1)
	        	System.out.println("welcome" +user1+"Choose a move"+userchoice);	 
	        	 else if(u == 2)
	        		 System.out.println("welcome" +user2+"choose a move"+userchoice);
	        	 else if(u == 3)
	        		 System.out.println("welcome" +user3+"choose a move"+userchoice);
	        	 else 
	        		 System.out.println("welcome "+user4 + "choose a move"+userchoice);
				return userchoice;
	        	
	        }
	public static void main(String[] args) {
		System.out.println("Enter any one of the following inputs:  ");
	      System.out.println("ROCK");
	      System.out.println("PAPER");
	      System.out.println("SCISSORS");
	      System.out.println();
	          
	      String moves = getResult();
	      String userchoice = Userchoice();
	      
	      if (moves.equals(userchoice))
	            System.out.println("Game is Tie !!");
	      // if Move is ROCK         
	      else if (moves.equals(RockPaperScissor.ROCK))
	        System.out.println(moves.equals(RockPaperScissor.PAPER) ? "Computer Wins": "Player wins");   
	      // if Move is PAPER
	      else if (moves.equals(RockPaperScissor.PAPER))
	        System.out.println(moves.equals(RockPaperScissor.SCISSORS) ? "Computer Wins": "Player wins");   
	      // if Move is SCISSORS    
	      else
	        System.out.println(moves.equals(RockPaperScissor.ROCK) ? "Computer Wins": "Player wins");   
	    }
	    
	  
		
		
		
	}



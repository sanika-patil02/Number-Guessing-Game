import java.util.Random;                //Final Project File
import java.util.Scanner;
import java.util.*;

public class Game{
    public static void main (String args[]){
        int op;
        int ans=0;
        int ch=0;
        int GuessNumber=0;
        int round=1;
        

        Scanner sc =new Scanner(System.in);
        System.out.println("Choose the option from below dropdown");
        System.out.println("1.Start the Game\n"+"2.Exit");
        op=sc.nextInt();

        switch(op){

            case 1:
            do{
                Random rd=new Random();
                int RandomNumber=rd.nextInt(100)+1; //for range(1-100),If only 100 is written then its range is(0-99)
                // System.out.println("Random Number="+RandomNumber);

                System.out.println("Game is Starting....");
                    for(int trialcount=1;trialcount<=5;trialcount++){
                        
                        System.out.println("Enter Your Guess(1-100):");
                        GuessNumber=sc.nextInt();
                    
                    if(RandomNumber==GuessNumber){
                        System.out.println("Correct!!You Win..");
                        System.out.println("You guess the number "+RandomNumber+" in "+trialcount+" guesses");
                        if(trialcount==1){
                            System.out.println("Your score is 100");
                            System.out.println("---------------------------------------------");
                        }
    
                        else if(trialcount==2){
                            System.out.println("Your score is 90");
                            System.out.println("---------------------------------------------");

                        }
                        
                        else if(trialcount==3){
                            System.out.println("Your score is 80");
                            System.out.println("---------------------------------------------");

                        }

                        else if(trialcount==4){
                            System.out.println("Your score is 70");
                            System.out.println("---------------------------------------------");

                        }

                        else if(trialcount==5){
                            System.out.println("Your score is 60");
                            System.out.println("---------------------------------------------");

                        }
    
                        System.out.println("1.Next Round\n"+"2.Exit");
                        ch=sc.nextInt();
                        if(ch==1){
                            round=round+1;
                            System.out.println();
                            System.out.println("Congrats!!"+" You entered into round "+round);
                        }
    
                        break;
                    }
    
                    else if(RandomNumber > GuessNumber) {
                        System.out.println("No..The number is higher.");
                        System.out.println();

                    }
                
                    else if(RandomNumber < GuessNumber){
                        System.out.println("No..The number is lower.");
                        System.out.println();

                    }

                }
                if(RandomNumber!= GuessNumber){
                    System.out.println("You tried 5 times...\nYou lose the game!");
                    System.out.println();
                    System.out.println("Replay Game");
                    System.out.println("1.Yes\n"+"2.No");
                    ans=sc.nextInt();
                    System.out.println();

                    if (ans==2){
                        break;
                    }
                }
            }while(ch==1 ||ans==1);

                

        case 2:
            break;
        }
    
            
            
    
sc.close();
}

} 

    

  

        
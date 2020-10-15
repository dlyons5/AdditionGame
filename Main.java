import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); 
    
    System.out.println("choose a number between 1 and 5");
    int number = scan.nextInt();
  
    System.out.println("choose a number that adds to equal 12 (so like what + the number you choose = 12");
    int number2 = scan.nextInt();
    //now just make loops 

 boolean isCorrectAnswer =true;
     if (isCorrectAnswer)
     {
         System.out.println(" correct ");
     }
     else
     {
         System.out.println(" thats the wrong answer ");
     }
   }
}

int isCorrectAnswer = 
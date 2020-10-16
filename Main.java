import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
 
   Scanner scan = new Scanner(System.in);
  
   System.out.println("choose a number between 1 and 5");
   int number = scan.nextInt();
    System.out.println("choose a number that adds to equal 12 (so like what + the number you choose = 12");
   int number2 = scan.nextInt();
   //now just make loops
 
int correctAnswer = 5;
    if (1 < 5 && 8 + 4 == 12)
    {
        System.out.println(" correct ");
    }
    else
    {
        System.out.println(" thats the wrong answer ");
    
while(correctAnswer <= 5){
     //if the answer is less than 4 then
      System.out.println("The answer" + correctAnswer + "is correct because 8 + 4 = 12");
      correctAnswer++; 
      }
      
      System.out.print("That is why the answer is 4");
    
    }
  }
}



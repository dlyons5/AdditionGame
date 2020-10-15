import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
 
   Scanner scan = new Scanner(System.in);
  
   System.out.println("what is 12 - 8?");
   int number = scan.nextInt();
   
int correctAnswer = 4; 
    if (4 == 4)
    {
        System.out.println(" correct ");
    }
    else 
    {
        System.out.println(" thats the wrong answer ");
        
    while(correctAnswer >= 4){
     //if the answer is less than 4 then
      System.out.println("The answer" + correctAnswer + "is correct because 8 + 4 = 12");
      correctAnswer++; 
      }
    }
  }
}

import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int num, reminder, sum=0;
        System.out.println("enter a number");
        num = myobj.nextInt();
        while(num > 0){
            reminder = num%10;
            sum = sum + reminder;
            num = num / 10;
        }
        System.out.println(sum);
    }    
}

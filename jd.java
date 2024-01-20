//TASK 2
//STUDENT GRADE CALCULATOR
import java.util.Scanner;
import java.util.ArrayDeque;
class jd{
    public static void main(String args[]){
        int j,a,c,sum=0,x;
        float i;
        Scanner se = new Scanner(System.in);
        ArrayDeque <Integer> aw = new ArrayDeque <Integer>();
        System.out.println("Enetr the total subject : ");
        c=se.nextInt();
        for(a=1;a<=c;a++){
            System.out.println("Enter subject no"+a+" marks:");
            aw.push(j=se.nextInt());
            sum = j+sum;
        }
        System.out.println("Total Marks: "+sum);
        i=sum/c;
        System.out.println("percentage:"+i);
        if(i<=100 && i>= 80){
            System.out.println("A grade");
        }
        else if(i<=79 && i>=70){
            System.out.println("B grade");
        }
        else if(i<=69 && i>=60){
            System.out.println("C grade");
        }
        else if(i<=59 && i>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println(" Faill ");
        }
    }
}
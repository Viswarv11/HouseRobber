import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size=scanner.nextInt();
        System.out.println("Enter the array elements:");
        int array[]=new int[size];
        int cost=0;
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
            if(i%2==0){
                cost+=array[i];
            }
        }
        System.out.println("The total amount robbed is :"+cost);
    }
}

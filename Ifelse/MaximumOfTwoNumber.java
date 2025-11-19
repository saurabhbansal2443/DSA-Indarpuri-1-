import java.util.* ; 
public class MaximumOfTwoNumber{
    public static void main(String[] args){
        // Take input of two number and find the maximum of them 

        Scanner sc = new Scanner(System.in); 

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        if(a>b){
        System.out.println("A is greater "); 
        }else if ( b> a ){
            System.out.println("B is greater "); 
        }else {
             System.out.println("Both are equal "); 
        }
    }
}
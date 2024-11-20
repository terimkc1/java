import java.util.*;
public class GcdLcm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        int min=Math.min(a,b);
        int hcf=1,lcm=1;
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                hcf=i;
                break;
            }
        }
        
        lcm=(a*b)/hcf;
        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }
}
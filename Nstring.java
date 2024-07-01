import java.util.*;
class Nstring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String s1[]=new String[n];
        for(int i=0;i<n;i++)
        s1[i]=s.next();
                for(int i=0;i<n;i++)
        System.out.print(s1[i]+" ");
    }
}
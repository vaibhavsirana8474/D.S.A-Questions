import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0) n=-n;
        int ans = n%10;
        System.out.println(ans);
    }
}
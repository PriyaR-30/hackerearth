import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s =sc.next();
        char[] arr = s.toCharArray();
        for(int i = 0; i < n; i++){
            if(arr[i] == '.') arr[i] = 'B';
        }
        System.out.println("YES");
        System.out.println(new String(arr));
        
    }
}
Check the link https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/

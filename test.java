// import java.util.*;

// public class test {
//     public static boolean primeornot(int a){
//          if(a<=1){
//             return false  ;
//         }
//         else if(a==2){
//             return false;
//         }
//         else if(a%2==0){
//             return false;
//         }
//         else{
//             for(int i=2;i<=Math.sqrt(a);i++){
//                 if(a%i==0){
//                     return false;
//                 }
//             }

//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(primeornot(a));
    
//      sc.close();
//     }
// }
// import java.util.*;
// public class test{
//     public static int sumofdigits(int a){
//         if(a==0){
//             return 1;
//         }
//         int sum =0;
//         a=math.abs(a);
//             while(a!=0){
//                 int digit =a%10;
//                 sum+=digit;
//                 a=a/10;
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(sumofdigits(a));
//         sc.close();
//     }
    
// }
// import java.util.*;
// public class test{
//     public static boolean palindrome(int a){
//         if(a==0){
//             return false;
//         }
//         a=Math.abs(a);
//         int reversed=0;
//         int original=a;
//         while(a!=0){
//             int digit=a%10;
//             reversed=reversed*10+digit;
//             a=a/10;
//         }
//         return reversed==original;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a= sc.nextInt();
//         if(palindrome(a)){
//              System.out.println("palin");

//         }else{
//             System.out.println("not");
//         }
//         sc.close();
//     }
// }
// import java.util.*;
// public class test{
//     public static boolean palindrome(String a){
//         int left=0;
//         int right=a.length()-1; 
//         while(left<right){
//             if(a.charAt(left)!=a.charAt(right)){
//                 return false;
//             }
        
//         left++;
//         right--;
//         } 
//     return true;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String a=sc.nextLine();
//         if(palindrome(a)){
//         System.out.println("palin");
//         }else{
//             System.out.println("not");
//         }
//         sc.close();

//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.println("*");
//             }
//         }
//         sc.close();
//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int original=a;
//     int result=0;
//     int digits=String.valueOf(a).length();
//     while(a!=0){
//         int digit=a%10;
//         result+=Math.pow(digit,digits);
//         a=a/10;
//     }
//     if(result==original){
//         System.out.println("yes");
//     }
//     else{
//         System.out.println("no");
//     }
//     sc.close();

       
//     }
// }
// import java.util.*;
// public class test{
//     public static long factorial(int n){
//         if(n==1||n==0){
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         long result=factorial(n);
//         System.out.println(result);
//         sc.close();

//     }

// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         int a=321;
//         int rev=0;
//         while(a!=0){
//             int digit=a%10;
//             rev=rev*10+digit;
//             a=a/10;
            
//         }
//         System.out.println(rev);
//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         HashSet<Integer> set= new HashSet<>();
//         set.add(6);
//         set.add(6);
//         set.add(7);
//         set.add(8);
//         set.add(7);
//         set.remove(8);
//         System.out.println(set);
//         if(set.contains(9)){
//             System.out.println("it is present");
//         }else{
//             System.out.println("out of bound");
//         }
//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         HashMap<Integer,String> map= new HashMap<>();
//         map.put(10,"Ak");
//         map.put(20,"sh");
//         map.put(30,"ay");
//         System.out.println(map);
//         System.out.println(map.get(10));
//         map.put(30,"sr");
//         System.out.println(map);
//         if(map.containsKey(20)){
//             System.out.println("it is present");
//         }
//         else{
//             System.out.println("not");
//         }


//     }
// }
// import java.util.*;
// public class test{
//     public static int[] maxandmin(int[] arr){
//         int max=arr[0];
//         int min=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//             if(arr[i]< min){
//                 min=arr[i];
//             }
//         }
//         return new int[] {max,min};
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int[] arr=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] result=maxandmin(arr);
//        System.out.println(result[1]);
//        System.out.println(result[0]);
//            sc.close();
//     }
// }
import java.util.*;
public class test{
    public static int[] averageandsum(int[] arr){
        int sum=arr[0];
        int average=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        average=sum/arr.length;
        return new int[] {sum,average};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=averageandsum(arr);
        System.out.println(result[0]);
        System.out.println(result[1]); 
        sc.close();
    }
}
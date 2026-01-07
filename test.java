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
<<<<<<< HEAD
// AMSTRONG NUMBER
=======
>>>>>>> 13157322f2994971302974504c89fc46677b4735
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
// import java.util.*;
// public class test{
//     public static int[] averageandsum(int[] arr){
//         int sum=arr[0];
//         int average=arr[0];
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//         average=sum/arr.length;
//         return new int[] {sum,average};
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int[] arr=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] result=averageandsum(arr);
//         System.out.println(result[0]);
//         System.out.println(result[1]); 
//         sc.close();
//     }
// }
<<<<<<< HEAD
// import java.util.*;
=======
//import java.util.*;
>>>>>>> 13157322f2994971302974504c89fc46677b4735
// public class test{
//     public static int[] evenOrOdd(int[] arr){
//         int counteven=0;
//         int countodd=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
<<<<<<< HEAD
//                 counteven++
=======
//                 counteven++;
>>>>>>> 13157322f2994971302974504c89fc46677b4735
//             }
//             if(arr[i]%2!=0){
//                 countodd++;
//             }
//         }
//         return new int[] {counteven,countodd};
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//         int[] arr=new int[a];
//         for(int i=0;i<a;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] result=evenOrOdd(arr);
//         System.out.println(result[0]);
//         System.out.println(result[1]);

//         sc.close();

//     }
// }
//import java.util.*;
// public class test{
// public static int findelement(int[] arr){
//     int x=44;
//     for(int i=0;i<=arr.length;i++){
//         if(arr[i]==x){
//             return i;
//         }
//     }
//     return 1;
// }
// public static void main(String[] args){
//     int[] arr={10,11,22,33,44};
//     System.out.println(findelement(arr));
// }
// }

// import java.util.*;
// public class test{
//     public static int[] reverseArray(int[] arr){
//         int start=0;
//         int last=arr.length-1;
//         int temp;
//         while(start<last){
//             temp=arr[start];
//             arr[start]=arr[last];
//             arr[last]=temp;
            
//             start++;
//             last--;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] arr={5,4,3,2,1};
//         int[] result=reverseArray(arr);
//         System.out.println(Arrays.toString(result));
//     }
// }
// import java.util.*;
// public class test{
// public static int secondhighest(int[] arr){
//     int highest=0;
//     int secondhighest=0;
//     for(int i=0;i<arr.length;i++){
//        if(arr[i]>highest){
//         secondhighest=highest;
//         highest=arr[i];
//        }
//        else if(arr[i]>secondhighest && arr[i]!=highest){
//         secondhighest=arr[i];
//        }
//     }
//     return secondhighest;
// }
// public static void main(String[] args){
//     int[] arr={3,4,5,6,7,8};
//     int result=secondhighest(arr);
//     System.out.println(result);
// }
// }
// import java.util.*;
// public class test{
//     public static ArrayList<Integer> removeDuplicate(int[] a){
//         ArrayList<Integer> uniqueval=new ArrayList<>();
//         for(int i:a){
//             if(!uniqueval.contains(i)){
//                 uniqueval.add(i);
//             }
//         }
//         return uniqueval;
//     }
//     public static void main(String[] args){
//         int[] a={1,2,3,3,4,4,5,5};

//         ArrayList <Integer> result=removeDuplicate(a);
//         System.out.println(result);
       
//     }
// }
// import java.util.*;
// public class test{
//     public static LinkedHashMap<Integer,Integer> frequncyOfNumber(int[] a){
//         LinkedHashMap<Integer,Integer> arr=new LinkedHashMap<>();
//         for(int num:a){
//             arr.put(num,arr.getOrDefault(num,0)+1);
//         }
//         return arr;
//     }
//     public static void main(String[] args){
//         int[] a={1,2,2,3,3,4,4,4,5};
//         LinkedHashMap<Integer,Integer> result=frequncyOfNumber(a);
//         System.out.println(result);
        
// }
// }
//  for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
//             System.out.println(entry.getKey() + " : " + entry.getValue());
// import java.util.*;
// public class test{
//     public static LinkedHashMap<String,Integer> countwords(String[] users){
//         LinkedHashMap<String,Integer> arr= new LinkedHashMap<>();
//         for(String words:users){
//             arr.put(words,arr.getOrDefault(words,0)+1);
//         }
//         return arr;
//     }
//     public static void main(String[] args){
//         // String line="turtle never won for speed, but for won never patience";
//         String[] users={"akshay","turtle","won","for","speed","never"};
//         LinkedHashMap<String,Integer> result=countwords(users);
//         System.out.println(result);
//         System.out.println("hello");
//     }
// }
// import java.util.*;
// public class test{
//     public static LinkedHashMap<String,Integer> countwords(String[] users){
//         LinkedHashMap<String,Integer> arr= new LinkedHashMap<>();
//         for(String words:users){
//             arr.put(words,arr.getOrDefault(words,0)+1);
//         }
//         return arr;
//     }
//     public static void main(String[] args){
//         // String line="turtle never won for speed, but for won never patience";
//         String[] users={"akshay","turtle","won","for","speed","never"};
//         LinkedHashMap<String,Integer> result=countwords(users);
//         System.out.println(result);
//         System.out.println("hello");
//         System.out.println("hello");
//         System.out.println("hello");
//         System.out.println("hello");
        
//     }
// }
// import java.util.*;
// public class test{
//     public static int reversenumber(int a){
//         if(a==0){
//             return 0;
//         }
//         int sum=0;
//         a=Math.abs(a);
//         while(a!=0){
//             int digit=a%10;
//             sum+=digit;
//             a=a/10;
//         }
//         return sum;

//     }
//     public static void main(String[] args){
//         Scanner sc =new Scanner (System.in);
//         int a=sc.nextInt();
//         int result=(reversenumber(a));
//         System.out.println(result);
//     }
// }
// import java.util.*;

// public class test {
//     public static int reversenumber(int a){
//     if(a==0){
//         return 0;
//     }
//     int reversed=0;
//     a=Math.abs(a);
//     while(a!=0){
//         int digit=a%10;
//         reversed=reversed*10+digit;
//         a=a/10;
//     }
//     return reversed;
// }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         int a =sc.nextInt();
//         int result=(reversenumber(a));
//         System.out.println(result);
//     }
// }
// import java.util.*;

// public class test {
//     public static String reversestring(String a){
//         char[] b= a.toCharArray();
//         String reversed="";
//         for(int i=b.length-1;i>=0;i--){
//             reversed+=b[i];
//         }
//         return reversed;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         String a=sc.nextLine();
//         String result=(reversestring(a));
//         System.out.println(result);
//     }
// }
// import java.util.*;

// public class test {
//     public static int factorial(int a){
//         if(a==0){
//             return 1;
//         }
//         return a*factorial(a-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         int a=sc.nextInt();
//         int result=(factorial(a));
//         System.out.println(result);
//     }
// }
// import java.util.*;

// public class test {
//     public static String palindrome(String a){
//         char [] b=a.toCharArray();
//         int i=0;
//         int j=a.length()-1;
//         while(i<j){
//             if(a.charAt(i)!=a.charAt(j)){
//                 return "not a palin";
//             }
//             i++;
//             j--;
//         }
//         return "palin";
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         String a=sc.nextLine();
//         String result=(palindrome(a));
//         System.out.println(result);
//     }
// }
// import java.util.*;

// public class test {
//     // Sorting the array using bubble sort
//     public static void sort(int[] b) {
//         int c = b.length;
//         int temp = 0;
//         for (int i = 0; i < c - 1; i++) {
//             for (int j = 0; j < c - i - 1; j++) {
//                 if (b[j] > b[j + 1]) {
//                     temp = b[j];
//                     b[j] = b[j + 1];
//                     b[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         sort(a);
//         for (int i = 0; i < n; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }
// import java.util.*;

// public class test {
//     public static int secondhighest(int[] b){
//        int highest=0;
//        int secondhighest=0;
//        for(int i:b){
//         if(i>highest){
//             secondhighest=highest;
//             highest=i;
//         }
//         if(i<highest&&i>secondhighest){
//             secondhighest=i;
//         }
//        }
//        return secondhighest;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int[] b =new int[a];
//         for (int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         int result=secondhighest(b);
//         System.out.println(result);

//     }
// }
// import java.util.*;

// public class test {
//     public static void fibanocci(int a){
//         if(a==0){
//             System.out.println("0");
//         }
//         int b=0,c=1,d=0;
//         for(int i=0;i<a;i++){
//             System.out.println(b);
//             d=b+c;
//             b=c;
//             c=d;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         fibanocci(a);
//     }
// }
// import java.util.*;

// public class test {
//     public static int fibonaccirecursive(int n) {
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return fibonaccirecursive(n-1)+fibonaccirecursive(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int result=fibonaccirecursive(n);
//         System.out.println(result);
//     }
// }
// import java.util.*;

// public class test {
//     public static String binarytodecimal(String a){
//         int power=0;
//         int decimal=0;
//         for(int i=a.length()-1;i>=0;i--){
//             if(a.charAt(i)=='1'){
//                 decimal+=Math.pow(2,power);
//             }
//             power++;
//         }
//         return String.valueOf(decimal);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a =sc.nextLine();
//         String result=(binarytodecimal(a));
//         System.out.println(result);

//     }
// }

// import java.util.*;

// public class test {
//     public static String decimaltobinary(int a){
//         if(a==0){
//             return "0";
//         }
//         String binary="";
//         while(a>0){
//             binary=(a%2)+binary;
//             a=a/2;
//         }
//         return binary;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         String result=(decimaltobinary(a));
//         System.out.println(result);

//     }
// }
// import java.util.*;

// public class test {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("a"+a+",b"+b);
//     }
// }
// import java.util.*;

// public class test {
//     public static LinkedHashMap<Character,Integer> count(String[] a){
//         LinkedHashMap<Character,Integer> count=new LinkedHashMap<>();
//         for (String word : a) {
//             for (char c : word.toCharArray()) {
//                 count.put(c, count.getOrDefault(c, 0) + 1);
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] a ={"hello","world"};
//         LinkedHashMap<Character,Integer> result=count(a);
//         System.out.println(result);
//     }
// }
//selection sort
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         int[] arr={1,4,2,6,8};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             int minvalue=i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[minvalue]){
//                     minvalue=j;
//                 }
//             }
//             int temp=arr[i];
//             arr[i]=arr[minvalue];
//             arr[minvalue]=temp;
//         }
//         for(int k=0;k<n;k++){
//         System.out.println(arr[k]);
//         }
//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         int[] arr={1,3,2,6,4,8};
//         int n=arr.length;
//         for(int i=1;i<n;i++){
//             int key=arr[i];
//             int j=i-1;
//             while(j>=0&&arr[j]>key){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=key;
//         }
//         for(int k=0;k<n;k++){
//             System.out.println(arr[k]);
//         }
//     }
// }
// import java.util.*;
// public class test {
// public static void main(String[] args){
//     int[] a={1,4,2,6,8,3};
//     int target=3;
//     int result=findingelement(a, target);
//     System.out.println(result);
// }
// static int findingelement(int[] a, int target){
//     if(a.length==0){
//         return 0;
//     }
//         for(int i=0;i<=a.length;i++){
//             int element=a[i];
//             if(element==target){
//                 return i;
//             }
//         }
//         return -1;
// }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         String a="abcdefg";
//         char target='g';
//         int result=findinginString(a, target);// (0,5)
//         System.out.println(result);

// }
// static int findinginString(String a, char target){ //(int start, int end)
//     if(a==null){
//         return 0;
//     }
//     // char targetchar= target.charAt(0);
//     for(int i=0;i<a.length();i++){ //for(int i=start;i<end;i++)
//     if(a.charAt(i)==target){
//         return i;
//     }
// }
// return -1;

// }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//        int[][] a={
//             {1,2,3,4},
//             {5,6},
//             {7,8,9}
//        };
//        int target=sc.nextInt(); 
//         int[] result=search(a, target);
//         System.out.println(Arrays.toString(result));

//     }
//     static int[] search(int[][] a, int target){
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a[i].length;j++){
//             if(a[i][j]==target){
//                 return new int[]{i,j};
//             }
//         }
//         }
//         return new int[]{-1,-1};
//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         int[] a={1,9,3,4,5,6};
//         int[] result=even(a);
//         System.out.println(Arrays.toString(result));
//     }
//     static int[] even(int[] a){
//         if(a.length==0){
//             return new int[]{0};
//         }
//         int count=0;
//         for(int i:a){
//             if(i%2==0){
//                 count++;
//             }
//         }
//         return new int[]{count};
//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         int[] a={2,45,123,4325};
//         int result=evencount(a);
//         System.out.println(result);
//     }
//     static int evencount(int[] a){
//         if(a.length==0){
//             return 0;
//         }
//         int count=0;
//         for(int i:a){
//             String str=Integer.toString(i);
//             if(str.length()%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }
// }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         int[][] a={
//             {1,2,4},
//             {4,5,6},
//             {7,8,9}
//         };
//         int result=sumofrow(a);
//         System.out.println(result);
//     }
//     static int sumofrow(int[][] a){
//         int max=0;
//         for(int i=0;i<a.length;i++){
//             int sum=0;
//             for(int j=0;j<a[i].length;j++){
//                 sum+=a[i][j];
//             }
//             if(sum>max){
//                 max=sum;
//             }
//         }
//         return max;
//     }
// }
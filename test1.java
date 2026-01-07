// public class test1 {
//     public static void main(String[] args){
//         int[] arr={-12,-10,-2,0,2,4,8,12,14,16,26,47,67,87};
//         int target=14;
//         int result=binarysearch(arr, target);
//         System.out.println(result);
//     }
//     static int binarysearch(int[] arr, int target){
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target<arr[mid]){
//                 end=mid-1;
//             }else if(target>arr[mid]){
//                 start=mid+1;
//             }else{
//                 return mid;
//             }
//     }
//     return -1;

//     }
// }
// public class test1 {
//     public static void main(String[] args){
//         int[] arr={-12,-10,-2,0,2,4,8,12,14,16,26,47,67,87};
//         //int[] arr={87,67,46,33,29,14,8,4,1,-1,-19,-20};
//         int target=14;
//         int result=binarysearch(arr, target);
//         System.out.println(result);
//     }
//     static int binarysearch(int[] arr, int target){
//         int start=0;
//         int end=arr.length-1;
//         boolean isac=arr[start]<arr[end];
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             if(isac){
//                 if(target<arr[mid]){
//                 end=mid-1;
//                 }else {
//                 start=mid+1;
//             }
//             }
//             else{
//                 if(target>arr[mid]){
//                 end=mid-1;
//                 }else {
//                 start=mid+1;
//             }
//         }
//     }
//             return -1;
// }
// }
// import java.util.*;
// public class test1{
//     public static void main(String[] args){
//         int[] arr={-12,-10,-2,0,2,4,8,12,14,16,26,47,67,87};
//         int target=-1;
//         int result=ceilingnumber(arr, target);
//         System.out.println(result);
//     }
//     static int ceilingnumber(int[] arr, int target){
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target<arr[mid]){
//                 end=mid-1;
//             }else if(target>arr[mid]){
//                 start=mid+1;
//             }else{
//                 return mid;
//             }
//     }
//         return end;  //retruning the #start will give the ceiling and #end will give the flooring.
//     }
// }
// import java.util.*;
// public class test1{
//     public static void main(String[] args){
//         char[] letter={'a','d','f','h','j'};
//         char target='j';
//         char result=letters(letter, target);
//         System.out.println(result);

//     }
//     static char letters(char[] letter, char target){
//         int start=0;
//         int end=letter.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target < letter[mid]){
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }

//         }
//         return letter[start%letter.length];
//     }
// }
// public class test1{
//     public static void main(String[] args){
//         int[] arr={-12,-10,-2,0,2,4,8,12,14,16,26,47,67,87,88,90,93,94,98,101,105};
//         int target=88;
//         System.out.println(ans(arr, target));
//     }
//     static int ans(int[] arr, int target){
//         int start=0;
//         int end=1;
//         while(target>arr[end]){
//             int newstart=end+1;
//             end=end+(end-start+1)*2;
//             start=newstart;
//         }
//         return search(arr, target, start, end);
//     }
//     static int search(int[] arr, int target, int start, int end){
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target<arr[mid]){
//                 end=mid-1;
//             }else if(target>arr[mid]){
//                 start=mid+1;
//             }else{
//                 return mid;
//             }
//     }
//     return -1;
//     }
// }
// public class test1{
//     public static void main(String[] args){
//         int[] arr={6,8,7,5,4,3,2};
//         System.out.println(bitonicarray(arr));
//     }
//     static int bitonicarray(int[] arr){
//         int start=0;
//         int end=arr.length-1;
//         while(start<end){
//             int mid=start+(end-start)/2;
//         //     if(arr[mid]<arr[mid-1]){
//         //         end=mid-1;
//         //     }else if(arr[mid]<arr[mid+1]){
//         //         start=mid+1;
//         //     }
//         //     else if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
//         //         return mid;
//         //     }else{
//         //         return -1;
//         //     }
//         // }
//         // return -1;
//         if(arr[mid]>arr[mid+1]){
//             end=mid;
//         }else{
//             start=mid+1;
//         }
//     }
//     return start;
// }
// }
// public class test1{
//     public static void main(String[] args){
//         int [] arr={2,3,4,5,7,6,4,3};
//         int target=4;
//         System.out.println(search(arr, target));

//     }
//     static int search(int[] arr, int target){
//         int peak=peakarray(arr);
//         int firsttry=binarysearch(arr, target, 0, peak);
//         int secondtry=binarysearch(arr, target, peak+1, arr.length-1);
//         if(firsttry!=-1 && secondtry!=-1){
//             return Math.min(firsttry, secondtry);
//         }
//         else if(firsttry!=-1){
//             return firsttry;
//         }else{
//             return secondtry;
//         }
// }
//     static int peakarray(int[] arr){
//         int start=0;
//         int end=arr.length-1;
//         while(start<end){
//             int mid=start+(end-start)/2;
//         if(arr[mid]>arr[mid+1]){
//             end=mid;
//         }else{
//             start=mid+1;
//         }
//     }
//     return start;
// }
//     static int binarysearch(int[] arr, int target, int start, int end){
//         boolean isac=arr[start]<arr[end];
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             if(isac){
//                 if(target<arr[mid]){
//                 end=mid-1;
//                 }else {
//                 start=mid+1;
//             }
//             }
//             else{
//                 if(target>arr[mid]){
//                 end=mid-1;
//                 }else {
//                 start=mid+1;
//             }
//         }
//     }
//             return -1;
// }
// }
// public class test1{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5,6,7,8};
//         int target=8;
//         int result=search(arr, target, 0, arr.length-1);
//         System.out.println(result);
//     }
//     static int search(int[] arr,int target, int s, int e){
//         if(s>e){
//             return -1;
//         }
//         int mid=s+(e-s)/2;
//         if(target==arr[mid]){
//             return mid;
//         }
//         if(target<arr[mid]){
//             return search(arr, target, s, mid-1);
//         }
//         return search(arr, target, mid+1, e);
//     }
// }
// #best time complexity for the fibonacci number.
// public class test1{
//     public static void main(String[] args){
//         int n=20;
//         int result=fibonumber(n);
//         System.out.println(result);
//     }
//     static int fibonumber(int n){
//         return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
//     }
// //     static int fibo(int n){
// //         if(n<2){
// //             return n;
// //         }
// //         return fibo(n-1)+fibo(n-2);
// //     }
// }
// public class test1{
//     public static void main(String[] args){
//         int a=5;
//         int b=10;
//         // if (!(a>0&&b<0)){
//         //     System.out.println("same");
//         // }else{
//         //     System.out.println("not");
//         // }
//         String binary="";
//         while(a>0){
//             binary=a%2+binary;
//             a=a/2;
//         }
//         System.out.println(binary);
//     }
// }
// ***********************************************************************************
//import java.util.*;
// public class test1{
//     public static String check(int a){
//         if(a<=0){
//             return "invalid";
//         }
//         else if(a%2==0){
//             return "Even";
//         }
//         else{
//             return "Odd";
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(check(a));
//     }
// }

// public class test1{
//     public static int add(int a){
//         int sum=0;
//         while(a!=0){
//             int digit=a%10;
//             sum+=digit;
//             a=a/10;
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(add(a));
//     }
// }
// import java.util.*;
// public class test1{
//     public static String check(int a){
//         String b=Integer.toString(a);
//         int left=0;
//         int right=b.length()-1;
//         while(left<right){
//             if(b.charAt(left)!=b.charAt(right)){
//                 return "Not Palindrome";
//             }
//             left++;
//             right--;
//         }
//         return "Palindrome";
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(check(a));
//     }
// }
// import java.util.*;
// public class test1{
// public static int check(int[] a){
//     int max=a[0];
//     for(int i=0;i<a.length;i++){
//        if(a[i]>max){
//         max=a[i];
//        }
//     }
//     return max;
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a= new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         System.out.println(check(a));
//     }
// }

// import java.util.*;
// public class test1{
//     public static int count(String a, char[] b){
//         int count=0;
//         for(int ch:b){
//             for(int i=0;i<a.length();i++){
//             if(Character.toLowerCase(a.charAt(i))==Character.toLowerCase(ch)){
//                 count++;
//             }
//             }
//         }
//         return count;
//     }
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     char[] b={'a','e','i','o','u'};
//     String a=sc.nextLine();
//     System.out.println(count(a,b));
// }
// }
// import java.util.*;
// public class test1{
//     public static int check(int[] b){
//         int largest=Integer.MIN_VALUE;
//         int secondlargest=Integer.MIN_VALUE;
//         for(int c:b){
//             if(c>largest){
//                 secondlargest=largest;
//                 largest=c;
//             }
//             else if(c>secondlargest && c<largest){
//                 secondlargest=c;
//             }
//         }
//         return secondlargest;
//     }
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int[] b=new int[a];
//     for(int i=0;i<a;i++){
//         b[i]=sc.nextInt();
//     }
//     System.out.println(check(b));
// }
// }
// import java.util.*;
// public class test1{
//     public static int balance(int[] b){
//         int sum=0;
//         for(int i:b){
//             if(i!=0){
//                 sum+=i;
//             }
//             else{
//                 i++;
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int[] b=new int[a];
        // for(int i=0;i<a;i++){
        //     b[i]=sc.nextInt();
        // }
        // System.out.println(balance(b));
//     }
// }
// import java.util.*;
// public class test1{
//     public static int unique(int[] b){
//         HashSet<Integer> c=new HashSet<>();
//         for(int d:b){
//             c.add(d);
//         }
//         return c.size();
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int[] b=new int[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         System.out.println(unique(b));
//     }
// }
// import java.util.*;
// public class test1{
//     public static void series(int[] b){
//         int maxlen=1;
//         int  endindex=0; 
//         int curlen=1;
//         for(int i=1;i<b.length;i++){
//             if(b[i]>b[i-1]){
//                 curlen++;
//             }else{
//                 curlen=1;
//             }
//             if (curlen > maxlen) {
//                maxlen = curlen;
//                endindex = i;
//             }
//         }
//         System.out.println(maxlen);
//         int start=endindex-maxlen+1;
//         for(int i=start;i<=endindex;i++){
//             System.out.println(b[i]);
//         }
//     }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //      int a=sc.nextInt();
    //     int[] b=new int[a];
    //     for(int i=0;i<a;i++){
    //         b[i]=sc.nextInt();
    //     }
//         series(b);

//     }
// }
// import java.util.*;
// public class test1{
//     public static int sum(int[] b){
//         int sum=0;
//         for(int c:b){
//             if(c>0){
//                 sum+=c;
//             }
//         }
//         return sum;
//     }
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//         int[] b=new int[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         System.out.println(sum(b));
    
// }
// }
// import java.util.*;
// public class test1{
//     public static int count(int[] b){
//         int count=0;
//         for(int i=1;i<b.length;i++){
//             if(b[i]>b[i-1]){
//                 count++;
//             }
//         }
//         return count;
//     }
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//         int[] b=new int[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         System.out.println(count(b));
    
// }
// }

// import java.util.*;
// public class test1{
//     public static void streak(int[] b){
//         int curlen=1;
//         int maxlen=1;
//         int endindex=0;
//         for(int i=1;i<b.length;i++){
//             if(b[i]>b[i-1] && b[i]>0){
//                 curlen++;
//             }
//             else {
//                 curlen=0;
//             }
//             if (curlen>maxlen){
//                 maxlen=curlen;
//                 endindex=i;
//             }
//         }
//         // System.out.println(maxlen);
//         int start=endindex-maxlen+1;
//         for(int i=start;i<=endindex;i++){
//             System.out.println(b[i]);
//         }
//     }
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//         int[] b=new int[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         streak(b);
    
// }
// }
// import java.util.*;
// public class test1 {
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 5, 2, 8, 7};
//         int k = 3;
//         int windowSum = 0;
//         for (int i = 0; i < k; i++) {
//             windowSum += arr[i];
//         }
//         System.out.println(windowSum);
//         for (int i = k; i < arr.length; i++) {
//             windowSum = windowSum - arr[i - k] + arr[i];
//             System.out.println(windowSum);
//         }
//     }
// }


// import java.util.*;
// public class test1{
// public static void passorfail(int[] b){
//     int count=0;
//     int start=0;
//     int maxlen=1;
//     for(int end=0;end<b.length;end++){ //dynamic sliding window
//         if(b[end]==500){
//             count++;
//         }
//             while(count>1){
//                 if(b[start]==500){
//                     count--;
//                 }
//                 start++;
//             }
//             maxlen=Math.max(maxlen, end-start+1);
//     }
//     System.out.println(maxlen);
// }
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//         int[] b=new int[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         passorfail(b);
    
// }
// }
// import java.util.*;
// public class test1{
//     public static void passorfail(int[] b){
//         int count=0;
//         int maxlen=1;
//         int start=0;
//         int countzero=0;
//         for(int i=0;i<b.length;i++){
//             if(b[i] == 0){
//             countzero++;
//             }
//         }
//         for(int end=0;end<b.length;end++){
//             if(b[end]==0){
//                 count++;
//             }
//             while(count>1){
//                 if(b[start]==0){
//                     count--;
//                 }
//                 start++;
//             }
//             maxlen=Math.max(maxlen, (end-start+1)-count);
//         }
//         if(countzero == 0 && maxlen>0){
//             maxlen--;
//         }
//         System.out.println(maxlen);
//     }
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//         int[] b=new int[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         passorfail(b);
    
// }
// }
// import java.util.*;
// public class test1{
//     public static void checking(String a){
//         int count=0;
//         int maxlen=0;
//         int countreport=0;
//         int start=0;
//         for(int i=0;i<a.length();i++){
//             if(a.charAt(i)=='R'){
//                 countreport++;
//             }
//         }
//         for(int end=0;end<a.length();end++){
//             if(a.charAt(end)=='R'){
//                 count++;
//             }
//             while(count>1){
//                 if(a.charAt(start)=='R'){
//                     count--;
//                 }
//                 start++;
//             }
//             maxlen=Math.max(maxlen, (end-start+1)-count);
//         }
//         if(countreport==0 && maxlen>0){
//             maxlen--;
//         }
//         System.out.println(maxlen);
//     }
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String a=sc.nextLine();
//         checking(a);
    
// }
// }


// import java.util.*;
// public class test1{
//     public static void statetrack(int[] b){
//         int donoflip=b[0];
//         int doflip=-b[0];
//         int ans=Math.max(donoflip, doflip);
//         for(int end=1;end<b.length;end++){
//             doflip=Math.max(doflip+b[end], donoflip-b[end]);
//             donoflip=Math.max(donoflip+b[end], b[end]);
//             ans=Math.max(ans,Math.max(doflip, donoflip));
//         }
//         System.out.println(ans);
//     }
// public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int[] b =new int[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.nextInt();
//         }
//         statetrack(b);
// }
// }

import java.util.*;
public class test1{
    public static void statetrack(int[] b){
        int count=0;
        int start=0;
        int maxlen=0;
        for(int end=0;end<b.length;end++){
            if(b[end]<0){
                count++;
            }
            while(count>1){
                if(b[start]<0){
                    count--;
                }
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
            if(count==0){
                maxlen--;
            }
        }
        System.out.println(maxlen);
    }
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b =new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        statetrack(b);
}
}
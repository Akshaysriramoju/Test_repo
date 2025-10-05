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
import java.util.ArrayList;

// public class BasicJavaTest{
//     public static void main(String[] args){
//         ArrayList<Integer> myArray = new ArrayList<Integer>();
//         int i = 0;
//         do {
//             myArray.add(i);
//             i++;
//         } while (i < 256);
//     System.out.println(myArray);
//     }
// }

// public class BasicJavaTest{
//     public static void main(String[] args){
//         for (int i = 1; i <= 255; i+=2){
//             System.out.println(i);
//         }
//     }
// }

// public class BasicJavaTest{
//     public static void main(String[] args){
//         int sum = 0;
//         for (int i = 0; i <= 256; i++){
//             System.out.println("New number: "+ i);
//             System.out.println("Sum is: "+ sum);
//             sum += i;
//         }
//     }
// }

// public class BasicJavaTest{
//     public static void main(String[] args){
//         int[] myArray = {1,3,5,7,9,13};
//         for (int i = 0; i <= myArray.length; i++){
//             System.out.println(myArray[i]);
//         }
//     }
// }

// public class BasicJavaTest{
//     public static void main(String[] args){
//         int[] myArray = {1,3,5,7,9,13};
//         // int[] myArray2 = {0};
//         int max = 0;
//         for (int i = 0; i <= myArray.length; i++){
//             if (max < myArray[i]){
//                 max = myArray[i];
//                 // myArray2[0] = myArray[i];
//             }
//             System.out.println(Math.max(myArray));
//         } 
//     }
// } // not complete


// public class BasicJavaTest{
//     public static void main(String[] args){
//         int sum = 0;
//         int[] myArray = {1,3,5,7,9,13};
//         int average = 0;
//         for (int i = 1; i <= myArray.length; i++){
//             System.out.println("New number: "+ i);
//             System.out.println("Sum is: "+ sum);
//             System.out.println("Average is: "+ average);
//             sum += myArray[i];
//             average = sum / i;
//         }
//     }
// } // didnt catch first value?

// public class BasicJavaTest{
//     public static void main(String[] args){
//         ArrayList<Integer> myArray = new ArrayList<Integer>();
//         for (int i = 1; i <= 255; i+=2){
//             myArray.add(i);
//         }
//     System.out.println(myArray);
//     }
// }

// public class BasicJavaTest{
//     public static void main(String[] args){
//         ArrayList<Integer> myArray = new ArrayList<Integer>();
//         int[] myArray1 = {1,3,5,7,9,13};
//         int y = 5;
//         int x = myArray.size();
//         for (int i = 0; i <= myArray1.length; i++){
//             if (y < myArray1[i]){
//                 myArray.add(i);
//             }
//         System.out.println(x);
//         } 
//     }
// } // prints 000123


// public class BasicJavaTest{
//     public static void main(String[] args){
//         ArrayList<Integer> myArray = new ArrayList<Integer>();
// int[] ArrayX = {1,3,5,7,9,13};
//         for (int i = 0; i <= ArrayX.length; i++){
//             int x = ArrayX[i];
//             int y = x * x;
//             Math.sqrt(x);
//             myArray.add(y);
//             System.out.println(myArray);
//         }
//     }
// }

// public class BasicJavaTest{
//     public static void main(String[] args){
//         ArrayList<Integer> myArray = new ArrayList<Integer>();
//         int[] ArrayX = {1,3,-5,7,-9,13};
//         for (int i = 0; i <= ArrayX.length; i++){
//             int y = ArrayX[i];
//             if ( y < 0){
//                 y = 0;
//                 myArray.add(y);
//                 System.out.println(myArray);
//             }
//         else {
//             myArray.add(y);
//         }
//         }
//     }
// }
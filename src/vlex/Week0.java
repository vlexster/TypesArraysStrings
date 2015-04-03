/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlex;

/**
 *
 * @author Vlex
 */
public class Week0 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        /*Scanner input = new Scanner(System.in);
//         *int test = input.nextInt();
//         *System.out.println(isPrime(test)); */
//        int[] arr = {1,2,3,1,2,3,2,3,3,2,3};
//        //System.out.println(getAverage(arr));
//        System.out.println(reverseWords("!tihs siht kcuF"));
//    }
    public static boolean isOdd(int n){
        if (n%2==1) {
            return true;
        } else return false;
    }
    
    public static boolean isPrime(int n){
        boolean b = true;
        switch (n){
            case 0: b = false;
                break;
            case 1: b = true;
                break;
            case 2: b = true;
                break;
            default:
                for (int i=2; i<n; i++){
                    if (n%i==0) {
                        b = false;
                    }
                }
            break;
        }
        return b;
    }
    
    public static int min(int[] arr){
        int min_val = 9^9^9^9;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min_val) min_val = arr[i];
        }
        return min_val;
    }
    
    public static int kthMin(int k, int[] array){
        int kth_min_val = 9^9^9^9;
        for (int i=0; i<k; i++){
            min(array);
        }
        return kth_min_val;
    }
    
    public static int getAverage(int[] array){
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum +=array[i];
        }
        int avg = sum/array.length;
        return avg;
    }
    
    public static long doubleFac(int n){
        long first =1;
        for (int i=1; i<=n; i++){
            first *=i;
        }
        long doubleFac=1;
        for (int j=1; j<=first; j++){
            doubleFac *=j;
        }
        return doubleFac;
    }
    
    public static long kthFac(int k, int n){
        long result=1;
        for (int i=1; i<=k;i++){
            for (int j=1; j<=n; j++){
                System.out.println(result);
                result *=j;
                
            }
        }
        return result;
    }
    
    public static long getSmallestMultiple (int upperBound){
        return 0;
    }
    
    public static long getLargestPalindrome(long n){
        long result = 0;
        for (long i=1; i<=n;i++){
            long reversed_i = 0;
            while (i != 0) {
                reversed_i = reversed_i * 10 + i % 10;
                i = i / 10;   
            }
            System.out.println(reversed_i);
                if (i == reversed_i) {
                result = i;
                }
        }
        return result;
    }
    
    public static int[] histogram (short[][] image){
        int[] result;
        result = new int[255];
        for (int i=0; i<256; i++){
            int count = 0;
            for (int j=0; j<256; j++){
                for (int k=0; k<256; k++){
                    if (image[j][k] == i) count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
    
    public static long pow(int a, int b){
        long result=1;
        for (int i=0;i<b;i++){
            result *=a;
        }
        return result;
    }
    
    public static int getOddOccurrence(int[] array){
        int result=0;
        for (int i=0; i< array.length; i++){
            int count = 0;
            for (int j=0; j<array.length; j++){
                if (array[i]==array[j]) count++;
            }
            if (count%2==1) result=array[i];
        }
        return result;
    }
    
    public static long maximalScalarSum(int[] a, int[] b){
        long result=0;
        for (int i=0; i<a.length; i++){
            long biggest=0;
            for (int j=0; j<b.length; j++){
                // TODO find the biggest scalar product and permuation
            }
            result += a[i]*b[i];
        }
        return result;
    }
    
    public static int maxSpan(int[] array){
        int maxSpan = 0;
        for (int i=0; i< array.length; i++){
            int span = 0;
            for (int j=i; j<array.length; j++){
                if (array[i]==array[j] && span < j-i+1) span = j-i+1;
            }
            if (span>maxSpan) maxSpan = span;
        }
        return maxSpan;
    }
    
    public static boolean canBalance(int[] array){
        boolean result = false;
        for (int i=0; i<array.length; i++){
            int before = 0;
            int after = 0;
            for (int j=0; j<array.length; j++){
                if (j<=i) before += array[j];
                else after += array[j];
            }
            if (before == after) result = true;
        }
        return result;
    }
    
    public static int[][] rescale(int[][] original, int newWidth, int newHeight){
        int[][] result = new int[newWidth][newHeight];
        float xScale = original.length/newWidth;
        float yScale = original[0].length/newHeight;
        for (int i=0; i<newWidth; i++){
            for (int j=0; j<newHeight; j++){
                result[i][j] = original[(int) (i*xScale)][(int) (j*xScale)];
            }
        }
        return result;
    }
    
    public static String stringReverse(String argument){
        String result = "";
        for (int i=1; i<=argument.length(); i++){
            result += (argument.charAt(argument.length()-i));
        }
        return result;
    }
    
    public static String reverseWords(String arg){
        
        for (int i=0; i<arg.length(); i++){
            if (arg.charAt(i) == ' '){}
        }
        int aInd = 0;
        int bInd = 0;
        String dummy = "";
        if (aInd == 0){
            dummy = arg.substring(bInd);
        } else {
            dummy = arg.substring(aInd, bInd);
        }
        String result = "";
        while (dummy.length()!=0){
            int ind = dummy.indexOf(" ");
            System.out.println(result);
            result += stringReverse(arg.substring(0, ind));
            result += " ";
            dummy = dummy.substring(ind, dummy.length()-1);
            
        }
        return result;
    }
}

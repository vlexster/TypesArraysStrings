package vlex;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import sun.nio.cs.StandardCharsets;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        boolean result = false;
        if (number%2==1 || number%2 == -1) {
            result = true;
        } else result = false;
        return result;
    }

    @Override
    public boolean isPrime(int number) {
        boolean b = true;
        switch (number){
            case 0: b = false;
                break;
            case 1: b = true;
                break;
            case 2: b = true;
                break;
            default:
                for (int i=2; i<number; i++){
                    if (number%i==0) {
                        b = false;
                    }
                }
            break;
        }
        return b;
    }

    @Override
    public int min(int... array) {
        Arrays.sort(array);
        return array[0];
    }

    @Override
    public int kthMin(int k, int[] array) {
        Arrays.sort(array);
        return array[k-1];
    }

    @Override
    public float getAverage(int[] array) {
        float sum = 0;
        for (int i=0; i<array.length; i++){
            sum +=array[i];
        }
        float avg = sum/array.length;
        return avg;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        long result = upperBound;
        for (int i=1; i<upperBound; i++){
            if (result%i != 0){
                for (int j=2; j<=i; j++){
                    if ((result*j)%i == 0) {
                        result *= j;
                        break;
                    }
                }
            }
        }
        return result;
    }

    @Override
    public long getLargestPalindrome(long N) {
        long result = 0;
        for (long i=0; i<N; i++){
            String str = String.valueOf(i);
            if (isPalindrome(str))result=i;
        }
        return result;
    }

    @Override
    public int[] histogram(short[][] image) {
        int[] result;
        result = new int[256];
        for (int i=0; i<256; i++){
            int count = 0;
                for (int j=0; j<image.length; j++){
                    for (int k=0; k<image[0].length; k++){
                        if (image[j][k] == i) count++;
                    }
                }
            result[i] = count;
        }
        return result;
    }

    @Override
    public long doubleFac(int n) {
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

    @Override
    public long kthFac(int k, int n) {
        long result=1;
        for (int i=1; i<=k;i++){
            for (int j=1; j<=n; j++){
                result *=j;
                
            }
        }
        return result;
    }

    @Override
    public int getOddOccurrence(int[] array) {
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

    @Override
    public long pow(int a, int b) {
        long result=1;
        for (int i=0;i<b;i++){
            result *=a;
        }
        return result;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        long result=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i=0; i<a.length; i++){
            result += a[i]*b[i];
        }
        return result;
    }

    @Override
    public int maxSpan(int[] array) {
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

    @Override
    public boolean canBalance(int[] array) {
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

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
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

    @Override
    public String reverseMe(String argument) {
        String result = "";
        for (int i=1; i<=argument.length(); i++){
            result += (argument.charAt(argument.length()-i));
        }
        return result;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        String result = "";
        for (int i=0; i<input.length(); i++){
            for (int j=0; j<k; j++){
                result += input.charAt(i);
            }
        }
        return result;
    }

    @Override
    public String reverseEveryWord(String arg) {
        String result="";
        String[] splitArr = arg.split(" ");
        for (int i=0; i<splitArr.length; i++){
            splitArr[i] = reverseMe(splitArr[i]);
            result +=splitArr[i];
            if (i<splitArr.length-1) result+=" ";
        }
        return result;
    }

    @Override
    public boolean isPalindrome(String argument) {
        boolean result = true;
        for (int i=0; i<argument.length();i++){
            if (argument.charAt(i)!= argument.charAt(argument.length()-i-1)) result= false;
        }
        return result;
    }

    @Override
    public boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        return isPalindrome(str);
    }

    @Override
    public int getPalindromeLength(String input) {
        int result =0;
        int index = input.indexOf('*');
        int incr = 0;
        if (incr< input.length()-index){
            incr=index;
        } else incr=input.length()-index;
        for (int i=1; i <= incr; i++){
            if (input.charAt(index-i) == input.charAt(index+i)){
                result++;
            } else break;
        }
        return result;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        return haystack.split(needle, -1).length-1;
    }

    @Override
    public String decodeURL(String input) {
        return java.net.URLDecoder.decode(input);
    }
    
    @Override
    public int sumOfNumbers(String input) {
        int result =0;
        String replaceAll = input.replaceAll("[a-zA-Z]", " ");
        String[] arr = replaceAll.split("\\s+");
        for (int i=0; i<arr.length; i++){
            if (!"".equals(arr[i])){
            result +=Integer.parseInt(arr[i]);
            }
        }
        return result;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        char[] charArrA = A.replaceAll("[\\s]", "").toCharArray();
        char[] charArrB = B.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(charArrA);
        Arrays.sort(charArrB);
        return Arrays.equals(charArrA, charArrB);
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        boolean result = false;
        for (int l=0; l< string2.length()-string.length()+1; l++){
            if (areAnagrams(string, string2.substring(l, l+string.length()))){
                result= true;
            }
        }
        return result;
    }

    public void convertToGrayscale(String imgPath){
        try {
            BufferedImage img = ImageIO.read(new File (imgPath));
            for (int i=0; i<img.getWidth(); i++){
                for (int j=0; j<img.getHeight(); j++){
                    Color c = new Color(img.getRGB(i,j));
                    int red = c.getRed();
                    int blue = c.getBlue();
                    int green = c.getGreen();
                    int gray = (int)(0.2126*red + 0.7152*green + 0.0722*blue);
                    img.setRGB(i,j,gray);
                    ImageIO.write(img, "png", new File(imgPath));
                }
            }
        } catch (IOException e){
        }

}
}



public class ArrayUtility {


    public static void print(int[] ar){
        for (int x:ar) System.out.print(x);
    }
    public static int sum(int[] ar){
        int sum = 0;
        for (int x: ar) sum += x;
        return sum;
    }
    public static int average(int[] ar){
        int sum = 0;
        for (int x: ar) sum += x;
        return sum/ar.length;
    }
    public static int minimum(int[] ar){
        int min = ar[0];
        for (int x: ar){
            if (x<min) min = x;
        }
        return min;
    }
    public static int maximum(int[] ar){
        int max = ar[0];
        for (int x:ar){
            if (x>max) max = x;
        }
        return max;
    }
    public static int evenCount(int[] ar){
        int count = 0;
        for (int x: ar){
            if (x%2==0) count +=1;
        }
        return count;
    }
    public static int[] reverseOne(int[] ar){
        int[] newAr = new int[ar.length];
        for (int i=0; i<ar.length; i++){
            newAr[i] = ar[ar.length-i-1];
        }
        return newAr;
    }
    public static void reverseTwo(int[] ar){
        for (int i=0; i<ar.length/2; i++){
            int temp = ar[i];
            ar[i] = ar[ar.length-1-i];
            ar[ar.length-1-i] = temp;
        }
    }
    public static boolean linearSearchInt(int[] ar, int n){
        for (int x: ar){
            if (x==n) return true;
        }
        return false;
    }
    public static boolean linearSearchString(String[] ar, String str){
        for (String x: ar){
            if (x.equals(str)) return true;
        }
        return false;
    }
    public static void multiplyByTwo(int[] ar){
        for (int i = 0; i<ar.length; i++){
            ar[i] *=2;
        }
    }
    public static void multiplyByN(int[] ar, int n){
        for (int i = 0; i<ar.length; i++){
            ar[i] *=n;
        }
    }
    public static String toString(int[] ar){
        String newStr = "";
        for (int i=0; i<ar.length-1; i++){
            newStr += Integer.toString(ar[i]) + ", ";
        }
        newStr += Integer.toString(ar[ar.length-1]);
        return newStr;
    }

    public static boolean twoSum(int[] ar, int n){
        for (int i=0; i<ar.length; i++){
            for (int j=0; j<i; j++){
                if (ar[i] + ar[j] == n) return true;
            }
            for (int j = i+1; j<ar.length; j++){
                if (ar[i] + ar[j] == n) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] ar){
        int last = ar[ar.length-1];
        int temp = ar[0];
        for (int i = 0; i<ar.length-1; i++){
            int temp_0 = ar[i+1];
            ar[i+1] = temp;
            temp = temp_0;
        }
        ar[0] = last;
    }

    public static void shiftLeft(int[] ar){
        int first = ar[0];
        int temp = ar[ar.length-1];
        for (int i=ar.length-1; i>0; i--){
            int temp_0 = ar[i-1];
            ar[i-1] = temp;
            temp = temp_0;
        }
        ar[ar.length-1] = first;
    }

    public static void shiftRightNTimes(int[] ar, int n){
        int[] lastN = new int[n];
        for (int i = 0; i < n; i++){
            lastN[n-1-i] = ar[ar.length-1-i];
        }
        for (int i = ar.length-n-1; i>=0; i--){
            ar[i+n] = ar[i];
        }
        for (int i = 0; i<n; i++){
            ar[i] = lastN[i];
        }
    }

    public static void shiftLeftNTimes(int[] ar, int n){
        int[] firstN = new int[n];
        for (int i =0; i<n; i++){
            firstN[i] = ar[i];
        }
        for (int i = n; i<ar.length; i++){
            ar[i-n] = ar[i];
        }
        for (int i = 0; i<n; i++){
            ar[ar.length-n+i] = firstN[i];
        }
    }


}

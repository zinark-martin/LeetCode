package LeetCode;

public class _852 {
    public int peakIndexMountainArray(int [] A){
        for (int i = 0; i <A.length - 1; i++ ){
            if (A [i] > A [i+1]) return i;
            return A.length - 1;
        }
        return 0;
    }
}

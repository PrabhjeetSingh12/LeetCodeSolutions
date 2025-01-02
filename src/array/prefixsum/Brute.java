package array.prefixsum;

public class Brute {

    int[] data;
    public Brute(int[] nums){
        data = nums;
    }

    public int sumRange(int i,int j){
        int sum =0;
        for(int k=i;k<= j;k++){
            sum = sum + data[k];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] a ={1,2,3,4};

        Brute obj = new Brute(a);

        System.out.println("Sum of range (0, 2): " + obj.sumRange(0, 2));
    }
}

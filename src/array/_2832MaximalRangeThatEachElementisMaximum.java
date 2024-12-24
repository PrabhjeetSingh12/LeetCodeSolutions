package array;

import java.util.Arrays;

public class _2832MaximalRangeThatEachElementisMaximum {

    public int[] method(int[] arr){

        int ans[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int count =1;
            for(int k =i-1;k>=0;k--){
                if(arr[i]>=arr[k]){
                    count++;
                }
            }
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>=arr[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }

    public static void main(String[] args){
        int array[]= {1,5,4,3,6};
        _2832MaximalRangeThatEachElementisMaximum object = new _2832MaximalRangeThatEachElementisMaximum();
        System.out.println(Arrays.toString(object.method(array)));
    }

}

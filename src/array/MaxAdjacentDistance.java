package array;

public class MaxAdjacentDistance {

        public int maxAdjacentDistance(int[] nums) {
            int distance=Math.abs(nums[0]-nums[nums.length-1]);
            for(int i =0;i<nums.length-1;i++){
                int finddistance=Math.abs(nums[i]-nums[i+1]);
                distance = Math.max(distance,finddistance);
            }
            return distance;
        }

        public static void main(String[] args) {
            MaxAdjacentDistance obj=new MaxAdjacentDistance();
            System.out.println(obj.maxAdjacentDistance(new int[]{1,2,3}));
        }
    }



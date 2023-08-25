package class8;

public class E7EnhancedLoop {
    public static void main(String[] args) {
        int [] nums={10,77,5,56,60,20};
        int largest=nums[0];
        for (int t:nums){
            if (t%2==0){
                if (largest<t)
                    largest=t;

            }
        }System.out.println("largest even number: "+largest);


    }
}

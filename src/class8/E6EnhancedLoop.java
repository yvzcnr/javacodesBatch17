package class8;

public class E6EnhancedLoop {
    public static void main(String[] args) {
        int [] nums={-10,-23,-5,-56,-45,-20};
        int largest=nums[0];
        for (int t:nums){
            if (t>largest){
                largest=t;
            }
        }
        System.out.println(largest);

    }
}

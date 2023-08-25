package class8;

public class E8EnhancedLoop {
    public static void main(String[] args) {
        int [] nums={10,77,25,56,60,20,-10,-5};
        int smallest=nums[0];
        for (int t:nums){
            if (t<smallest){
                smallest=t;
            }
        }
        System.out.println("smallest number: "+smallest);

    }
}

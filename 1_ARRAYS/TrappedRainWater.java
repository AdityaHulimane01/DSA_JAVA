public class TrappedRainWater {
    public static int TrappedWaterCalculator(int Heights[]){

        int n = Heights.length;
        // step 1 = make Auxiliry array leftMax[]
        int leftMax[] = new int[n];
        leftMax[0] = Heights[0];
        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Integer.max(Heights[i], leftMax[i-1]);
        }

        // step 2 = make Auxiliry array rightMax[]
        int rightMax[] = new int[n];
        rightMax[n-1] = Heights[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            rightMax[i]= Integer.max(Heights[i], rightMax[i+1]);
        }

        // step 3 = compare both leftMax[i] and rightMax[i] and take minimum of them and assign to the waterLevel
        int TrappedWater = 0;
        for(int i = 0 ; i < n ; i++){
         int waterLevel =  Integer.min(leftMax[i], rightMax[i]);

         // step 4 = Substract Height of each Bar from waterLevel and Also Parallaly add it to the TrappedWater to 
         //calculate total TrappedWater
         TrappedWater += waterLevel - Heights[i];
        }

        return TrappedWater;
    }
    public static void main(String[] args) {
        int Heights[] = {4 , 2 , 0 , 6 , 3 , 2 , 5};
        System.out.print("The total Amount of Trapped Rain water is : " + TrappedWaterCalculator(Heights));
    }    
}

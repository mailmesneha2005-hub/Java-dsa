public class container {
    public static void main(String args[])
    {}
    public int maxArea(int [] height){
        int st=0;
        int end=height.length-1;
        int maxCap=0;
        while(st<end){
            int h=Math.min(height[st],height[end]);
            int weight=end-st;
             int currCap=h*weight;
             if(height[st]<height[end]){
            st++;
              }else{
            end--;
         maxCap=Math.max(currCap,maxCap);
         }
    }
    return maxCap;
}
}
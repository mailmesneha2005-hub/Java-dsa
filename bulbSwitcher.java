class Solution{
    public static void main(String args[])
    {}
    public int bulbSwitch(int n) {
        int count=0;
        int i=1;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
}
}

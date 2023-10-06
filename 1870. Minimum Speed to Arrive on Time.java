class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 1;
        int right = 10000000;
        int min_speed = -1;
        while(left<=right){
            int mid = (left+right)/2;

            if(timerequired(dist,mid)<=hour){
                min_speed = mid;
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return min_speed;
    }
    double timerequired(int[]dist,int speed){
        double time = 0.0;
        for(int i = 0;i<dist.length;i++){
            double t = (double)dist[i]/(double)speed;
            time += (i== dist.length-1? t : Math.ceil(t));
        }
        return time;
    }
}
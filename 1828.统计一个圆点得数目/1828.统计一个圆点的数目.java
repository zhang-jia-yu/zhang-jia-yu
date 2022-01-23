class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
            int[] ans = new int[queries.length];
            for(int i = 0; i < queries.length; i++){
                for(int j = 0; j < points.length; j++){
                    int x = points[j][0] - queries[i][0];
                    int y = points[j][1] - queries[i][1];
                    int r = queries[i][2];
                    if((x*x + y*y) <= (r*r)){
                        ans[i]++;
                    }
                }
            }
            return ans;

    }
}

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
         double maxDiagonal = 0;
        int maxArea = 0;
        
        for (int[] rectangle : dimensions) {
            int w = rectangle[0], h = rectangle[1];
            double diagonal = Math.sqrt(w*w + h*h); 
            int area = w * h;

            
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
           
            else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
        
    }
}
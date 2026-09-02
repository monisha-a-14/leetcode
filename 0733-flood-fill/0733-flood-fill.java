class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) return image;
        
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    
    private void dfs(int[][] image, int i, int j, int originalColor, int newColor) {
        int m = image.length;
        int n = image[0].length;
        
        if (i < 0 || j < 0 || i >= m || j >= n) return;
        
        if (image[i][j] != originalColor) return;
        
        image[i][j] = newColor;
        dfs(image, i + 1, j, originalColor, newColor);
        dfs(image, i - 1, j, originalColor, newColor);
        dfs(image, i, j + 1, originalColor, newColor);
        dfs(image, i, j - 1, originalColor, newColor);
    }
}
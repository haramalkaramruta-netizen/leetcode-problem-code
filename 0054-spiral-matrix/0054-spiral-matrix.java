
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        int k=matrix[0].length * matrix.length;
        List<Integer> numbers = new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i = left;  i<=right && k!=0; i++){
                numbers.add(matrix[top][i]);
                k--;
            }
            top++;
            for(int i = top; i<=bottom&& k!=0 ; i++){
                numbers.add(matrix[i][right]);
                k--;
            }
            right--;
            for(int i = right;  i>=left&& k!=0; i--){
                numbers.add(matrix[bottom][i]);
                k--;
            }
            bottom--;
            for(int i = bottom; i>=top&& k!=0 ; i--){
                numbers.add(matrix[i][left]);
                k--;
            }
            left++;
        }
        return numbers;
    }
}
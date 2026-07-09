// Last updated: 7/9/2026, 9:11:31 AM
class Solution {
    public String convert(String s, int numRows) {
        char[][] matrix = new char[numRows][1001];

        int idx = 0;
        int col = 0;

        while(idx < s.length()){
            int row = 0;

            while(idx < s.length() && row < numRows){
                matrix[row++][col] = s.charAt(idx++);
            }

            row = numRows - 2;
            col++;

            while(idx < s.length() && row > 0){
                matrix[row--][col++] = s.charAt(idx++);
            } 
        }

        String res = "";

        for(int i=0;i<numRows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]!='\0'){
                    res+=matrix[i][j];
                }
            }
        }
        
        return res; 
    }
}
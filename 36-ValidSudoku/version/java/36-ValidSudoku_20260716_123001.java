// Last updated: 7/16/2026, 12:30:01 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3       boolean row[][]=new boolean[9][9];
4       boolean col[][]=new boolean[9][9];
5       boolean box[][]=new boolean[9][9];
6       for(int i=0;i<9;i++){
7        for(int j=0;j<9;j++){
8            if(board[i][j]!='.'){
9               int num=board[i][j]-'1';
10               int bi=(i/3)*3+(j/3);
11               if(row[i][num]||col[j][num]||box[bi][num]){
12                return false;
13               }
14               row[i][num]=col[j][num]=box[bi][num]=true;
15            }
16        }
17       }
18       return true;
19    }
20}
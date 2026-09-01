// Last updated: 9/1/2026, 2:39:51 PM
class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int startR = 0, startC = 0;
        int litterCount = 0;
        int[][] litterId = new int[m][n];
        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);
                if (ch == 'S') {
                    startR = i;
                    startC = j;
                } else if (ch == 'L') {
                    litterId[i][j] = litterCount++;
                }
            }
        }
        int allCollected = (1 << litterCount) - 1;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][][] visited =
                new boolean[m][n][energy + 1][1 << litterCount];
        queue.offer(new int[]{startR, startC, energy, 0, 0});
        visited[startR][startC][energy][0] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int e = curr[2];
            int mask = curr[3];
            int moves = curr[4];
            if (mask == allCollected) {
                return moves;
            }
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }
                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }
                if (e == 0) {
                    continue;
                }
                int newEnergy = e - 1;
                char cell = classroom[nr].charAt(nc);
                if (cell == 'R') {
                    newEnergy = energy;
                }
                int newMask = mask;
                if (cell == 'L') {
                    int id = litterId[nr][nc];
                    newMask = mask | (1 << id);
                }
                if (!visited[nr][nc][newEnergy][newMask]) {
                    visited[nr][nc][newEnergy][newMask] = true;
                    queue.offer(new int[]{
                        nr,
                        nc,
                        newEnergy,
                        newMask,
                        moves + 1
                    });
                }
            }
        }
        return -1;
    }
}
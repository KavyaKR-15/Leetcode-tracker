// Last updated: 9/1/2026, 2:38:58 PM
1class Solution {
2    public int minMoves(String[] classroom, int energy) {
3        int m = classroom.length;
4        int n = classroom[0].length();
5        int startR = 0, startC = 0;
6        int litterCount = 0;
7        int[][] litterId = new int[m][n];
8        for (int[] row : litterId) {
9            Arrays.fill(row, -1);
10        }
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                char ch = classroom[i].charAt(j);
14                if (ch == 'S') {
15                    startR = i;
16                    startC = j;
17                } else if (ch == 'L') {
18                    litterId[i][j] = litterCount++;
19                }
20            }
21        }
22        int allCollected = (1 << litterCount) - 1;
23        Queue<int[]> queue = new LinkedList<>();
24        boolean[][][][] visited =
25                new boolean[m][n][energy + 1][1 << litterCount];
26        queue.offer(new int[]{startR, startC, energy, 0, 0});
27        visited[startR][startC][energy][0] = true;
28        int[] dr = {-1, 1, 0, 0};
29        int[] dc = {0, 0, -1, 1};
30        while (!queue.isEmpty()) {
31            int[] curr = queue.poll();
32            int r = curr[0];
33            int c = curr[1];
34            int e = curr[2];
35            int mask = curr[3];
36            int moves = curr[4];
37            if (mask == allCollected) {
38                return moves;
39            }
40            for (int d = 0; d < 4; d++) {
41                int nr = r + dr[d];
42                int nc = c + dc[d];
43                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
44                    continue;
45                }
46                if (classroom[nr].charAt(nc) == 'X') {
47                    continue;
48                }
49                if (e == 0) {
50                    continue;
51                }
52                int newEnergy = e - 1;
53                char cell = classroom[nr].charAt(nc);
54                if (cell == 'R') {
55                    newEnergy = energy;
56                }
57                int newMask = mask;
58                if (cell == 'L') {
59                    int id = litterId[nr][nc];
60                    newMask = mask | (1 << id);
61                }
62                if (!visited[nr][nc][newEnergy][newMask]) {
63                    visited[nr][nc][newEnergy][newMask] = true;
64                    queue.offer(new int[]{
65                        nr,
66                        nc,
67                        newEnergy,
68                        newMask,
69                        moves + 1
70                    });
71                }
72            }
73        }
74        return -1;
75    }
76}
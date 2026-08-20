// Last updated: 8/20/2026, 3:02:31 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> ans = new HashMap<>();
4        for (String s : strs) {
5            char[] chars = s.toCharArray();
6            Arrays.sort(chars);
7            String key = new String(chars);
8            if (!ans.containsKey(key)) {
9                ans.put(key, new ArrayList<>());
10            }
11            ans.get(key).add(s);
12        }
13        return new ArrayList<>(ans.values());        
14    }
15}
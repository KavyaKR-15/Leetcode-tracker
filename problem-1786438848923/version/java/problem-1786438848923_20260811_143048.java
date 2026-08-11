// Last updated: 8/11/2026, 2:30:48 PM
1class Solution {
2    public String simplifyPath(String path) {
3        String com[]=path.split("/");
4        Stack <String> st=new Stack<>();
5        for(String s:com){
6            if(s.equals("")||s.equals(".")){
7                continue;
8            }
9            if(s.equals("..")){
10                if(!st.isEmpty()){
11                    st.pop();
12                }
13            }
14            else{
15                st.push(s);
16            }
17        }
18        StringBuilder sb=new StringBuilder();
19        while(!st.isEmpty()){
20            sb.insert(0,"/" + st.pop());
21        }
22        return sb.length()==0?"/":sb.toString();
23    }
24}
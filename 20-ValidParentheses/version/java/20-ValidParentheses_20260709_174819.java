// Last updated: 7/9/2026, 5:48:19 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack=new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(ch=='{' || ch=='(' || ch=='['){
6                stack.push(ch);
7            }
8            else{
9                if(stack.isEmpty()) return false;
10                char top=stack.pop();
11                if(ch=='}' && top!='{' || ch==')' && top!='(' ||ch==']'&& top!='[') return false;
12            }
13        }
14        return stack.isEmpty();
15    }
16}
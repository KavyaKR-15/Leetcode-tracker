// Last updated: 7/25/2026, 4:14:33 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if(ch=='}' && top!='{' || ch==')' && top!='(' ||ch==']'&& top!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}
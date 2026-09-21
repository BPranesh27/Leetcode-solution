class Solution {
    public int minAddToMakeValid(String s) {
        int missing=0;
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') stack.push(ch);
            else{
                if(!stack.isEmpty()) stack.pop();
                else missing++;
            }
        }
        while(!stack.isEmpty()){
            missing++;
            stack.pop();
        }
        return missing;
    }
}
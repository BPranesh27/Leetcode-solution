class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        helper(n,0,0,result,"");
        return result;
    }
    void helper(int n,int open,int close,List<String> list,String cur){
        if(cur.length()==n*2){
            list.add(cur);
            return;
        }
        if(open<n) helper(n,open+1,close,list,cur+"(");
        if(close<open) helper(n,open,close+1,list,cur+")");
    }
}
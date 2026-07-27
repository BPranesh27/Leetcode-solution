class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr=new ArrayList<>();
        System.out.println(arr);
        for(int i=0;i<=rowIndex;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) temp.add(1);
                else{
                    temp.add((arr.get(i-1).get(j-1))+(arr.get(i-1).get(j)));
                }
            }
            arr.add(temp);
        }
        // System.out.println(arr);
        return arr.get(rowIndex);
    }
}
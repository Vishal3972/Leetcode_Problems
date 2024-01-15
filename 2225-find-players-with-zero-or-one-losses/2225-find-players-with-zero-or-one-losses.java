class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int j=0;
            if(map.containsKey(matches[i][j])){
                map.put(matches[i][j+1],map.getOrDefault(matches[i][j+1],0)+1);
            }
            else{
                map.put(matches[i][j],0);
                map.put(matches[i][j+1],map.getOrDefault(matches[i][j+1],0)+1);
            }
        } 
        for(int i :map.keySet()){
            if(map.get(i)==0){
                ls1.add(i);
            }
            else if(map.get(i)==1){
                ls2.add(i);
            }
        }
        Collections.sort(ls1);
        Collections.sort(ls2);
        ls.add(ls1);
        ls.add(ls2);
        return ls;
    }
}
class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> graph=new HashMap<>();
        for(int i=0; i<n; i++){
            graph.compute(manager[i],(k,v)-> v==null ? new ArrayList<>() : v).add(i);
        }
        return dfs(graph, informTime, headID);
    }
    
    private int dfs(Map<Integer, List<Integer>> graph, int[] informTime, int cur){
        if(!graph.containsKey(cur)){
            return 0;
        }
        
        int temp=0;
        for(int i=0; i<graph.get(cur).size(); i++){
            temp=Math.max(temp, dfs(graph,informTime,graph.get(cur).get(i)));
        }
        return temp+informTime[cur];
    }
}
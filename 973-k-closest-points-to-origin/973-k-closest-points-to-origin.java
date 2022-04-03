class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Coordination> pq = new PriorityQueue<>();
        for(int[] point : points){
            pq.add(new Coordination(point));
            if(pq.size()==k+1){
                pq.poll();
            }
        }

        int[][] answer = new int[k][];
        int index=0;
        while (!pq.isEmpty()){
            answer[index++] = pq.poll().point;
        }
        return answer;
    }

    static class Coordination implements Comparable<Coordination>{
        private int[] point;

        public Coordination(int[] point) {
            this.point = point;
        }

        @Override
        public int compareTo(Coordination o) {
            int sqrt1 = point[0] * point[0] + point[1] * point[1];
            int sqrt2 = o.point[0] * o.point[0] + o.point[1] * o.point[1];

            return Integer.compare(sqrt2, sqrt1);
        }
    }
}
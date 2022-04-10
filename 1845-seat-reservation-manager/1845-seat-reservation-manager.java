class SeatManager {

    private final PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        pq=IntStream.rangeClosed(1,n).boxed()
            .collect(Collectors.toCollection(PriorityQueue::new));
    }

    public int reserve() {
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
func maximumWealth(accounts [][]int) int {
    ret := math.MinInt32
    
	for _, account := range accounts {
        sumCh := make(chan int)
        go sumOfArray(account, sumCh)
        tempSum := <-sumCh
		if tempSum > ret {
			ret = tempSum
		}
	}

	return ret
}

func sumOfArray(array []int, sumCh chan int) {
	sum := 0
	for _, val := range array {
		sum += val
	}
	sumCh <- sum
}
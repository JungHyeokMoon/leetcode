func maximumWealth(accounts [][]int) int {
	ret := math.MinInt32

	for _, account := range accounts {
		tempSum := sumOfArray(account)
		if tempSum > ret {
			ret = tempSum
		}
	}

	return ret
}

func sumOfArray(array []int) int {
	sum := 0
	for _, val := range array {
		sum += val
	}
	return sum
}
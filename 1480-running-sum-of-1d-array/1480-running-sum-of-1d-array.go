func runningSum(nums []int) []int {
    ret :=make([]int, len(nums))
    sum :=0
    for idx, value := range nums{
        sum=sum+value
        ret[idx]=sum
    }
    return ret
}


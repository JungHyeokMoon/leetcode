func fizzBuzz(n int) []string {
    ret := make([]string, n)
    for i:=0; i<len(ret); i++ {
        
        if temp:=i+1; temp%15==0 {
            ret[i]="FizzBuzz"
        }else if temp%3==0{
            ret[i]="Fizz"
        }else if temp%5==0{
            ret[i]="Buzz"
        }else{
            ret[i]=strconv.Itoa(temp)
        }
    }
    
    return ret
}
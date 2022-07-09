func finalValueAfterOperations(operations []string) int {
    ans := 0
    
    for _, op := range operations {
        if(op[0]=='+' || op[2]=='+'){
            ans++
        }

		if(op[0]=='-' || op[2]=='-'){
			ans--
		}
    }

	return ans
}
func firstPalindrome(words []string) (ret string) {
    for _, word := range words{
		if(isPalindrome(word)){
			return word
		}
	}

	return
}

func isPalindrome(word string) bool {
	wordLength := len(word)
	lo, hi :=0, wordLength-1

	for lo<=hi{
		if(word[lo]!=word[hi]){
			return false
		}
		lo++
		hi--
	}

	return true
}
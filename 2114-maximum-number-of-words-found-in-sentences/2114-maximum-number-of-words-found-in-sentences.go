func mostWordsFound(sentences []string) (ret int) {
	c := make(chan int)
	for _, sentence := range sentences {
		go getWordCount(sentence, c)
		tempWordCount := <-c
		if tempWordCount > ret {
			ret = tempWordCount
		}
	}
	return
}

func getWordCount(sentence string, c chan int) {
	c <- len(strings.Split(sentence, " "))
}
func prefixCount(words []string, pref string) (ret int) {
    for _, word := range words{
		if(strings.HasPrefix(word,pref)){
			ret++
		}
	}

	return
}
func defangIPaddr(address string) string {
    ip := strings.Split(address,".")
    return strings.Join(ip,"[.]")
}
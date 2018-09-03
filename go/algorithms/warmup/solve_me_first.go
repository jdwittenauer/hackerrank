package main

import "fmt"

func add(a uint32, b uint32) uint32 {
	return (a + b)
}

func main() {
	var a, b, res uint32
	fmt.Scanf("%v\n%v", &a, &b)
	res = add(a, b)
	fmt.Println(res)
}

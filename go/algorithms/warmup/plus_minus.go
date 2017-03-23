package main

import (
	"fmt"
	"os"
	"bufio"
	"strings"
	"strconv"
)

func ConvertToInt(sa []string) ([]int) {
	si := make([]int, 0, len(sa))
	for _, a := range sa {
		i, err := strconv.Atoi(a)
		if err != nil {
			panic(err)
		}
		si = append(si, i)
	}

	return si
}

func main() {
	var n int
	fmt.Scanf("%v\n", &n)
	var s = bufio.NewScanner(os.Stdin)
	s.Scan()
	var a = ConvertToInt(strings.Split(s.Text(), " "))

	var pos, neg, zero = 0, 0, 0
	for x := 0; x < n; x++ {
		if a[x] > 0 {
			pos++
		} else if a[x] < 0 {
			neg++
		} else {
			zero++
		}
	}

	fmt.Println(float32(pos) / float32(n))
	fmt.Println(float32(neg) / float32(n))
	fmt.Println(float32(zero) / float32(n))
}

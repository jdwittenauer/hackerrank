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
	var s = bufio.NewScanner(os.Stdin)
	s.Scan()
	var a_str = strings.Split(s.Text(), " ")
	s.Scan()
	var b_str = strings.Split(s.Text(), " ")

	var a = ConvertToInt(a_str)
	var b = ConvertToInt(b_str)

	var a_score, b_score = 0, 0
	for x := 0; x < len(a); x++ {
		if a[x] > b[x] {
			a_score++
		} else if b[x] > a[x] {
			b_score++
		}
	}

	fmt.Printf("%d %d", a_score, b_score)
}

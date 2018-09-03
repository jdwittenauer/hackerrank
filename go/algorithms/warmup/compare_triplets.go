package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func ConvertToInt(sa []string) []int {
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
	var aStr = strings.Split(s.Text(), " ")
	s.Scan()
	var bStr = strings.Split(s.Text(), " ")

	var a = ConvertToInt(aStr)
	var b = ConvertToInt(bStr)

	var aScore, bScore = 0, 0
	for x := 0; x < len(a); x++ {
		if a[x] > b[x] {
			aScore++
		} else if b[x] > a[x] {
			bScore++
		}
	}

	fmt.Printf("%d %d", aScore, bScore)
}

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

func Abs(n int) (int) {
	if n < 0 {
		n = -n
	}

	return n
}

func main() {
	var n int
	fmt.Scanf("%v\n", &n)
	var s = bufio.NewScanner(os.Stdin)
	var a = [][]int{}

	for i:= 0; i < n; i++ {
		s.Scan()
		var nums = ConvertToInt(strings.Split(s.Text(), " "))
		a = append(a, nums)
	}

	var diag_1, diag_2 = 0, 0
	for x:= 0; x < n; x++ {
		diag_1 += a[x][x]
		diag_2 += a[x][(n - 1) - x]
	}

	fmt.Println(Abs(diag_1 - diag_2))
}

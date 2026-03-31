package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (arr.isEmpty()) return intArrayOf()

    var min = arr[0]
    var max = arr[0]

    for (num in arr) {
        if (num < min) min = num
        if (num > max) max = num
    }

    return intArrayOf(min, max)
}

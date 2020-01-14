class PaaValidator {

    var upperCaseAlphabets = arrayOf(
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z'
    )

    var lowerCaseAlphabets = arrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )

    var digits = arrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

    var symbols = arrayOf(
        '@', '%', '#', '&', '!', '$', '^', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']',
        ':', ':', '"', '<', '>', '?', '.', '/', ',', '|'
    )

    fun checkPass(word: String) {
        var pass = word
        var size = word.length
        var temp = ""
        var count = 0

        for (i in pass) {

            for (j in upperCaseAlphabets)
                if (i == j) {
                    count++
                    temp += j
                }


            for (k in lowerCaseAlphabets)
                if (i == k) {
                    count++
                    temp += k
                }


                for (l in digits)
                    if (i == l) {
                        count++
                        temp += l
                    }

                for (m in symbols)
                    if (i == m) {
                        count++
                        temp += m
                    }
        }
        if (count == size) {
            println("Matched $temp")
        } else {
            print("Unmatched")
        }
    }
}

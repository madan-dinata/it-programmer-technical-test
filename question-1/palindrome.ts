function isPalindrome(word: string): boolean {
  const reversedWord = word.split("").reverse().join("")

  return word === reversedWord
}

console.log(isPalindrome("katak")) // true
console.log(isPalindrome("level")) // true
console.log(isPalindrome("mobil")) // false

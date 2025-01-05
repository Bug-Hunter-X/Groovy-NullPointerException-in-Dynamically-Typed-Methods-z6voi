```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 // Or handle nulls appropriately
  }
  return a + b
}

println calculate(5, null) // Prints 5
println calculate(null, 10) // Prints 10
println calculate(null,null) // Prints 0
```
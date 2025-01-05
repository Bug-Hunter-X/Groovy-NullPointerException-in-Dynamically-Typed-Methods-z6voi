```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    throw new NullPointerException("Arguments cannot be null")
  }
  return a + b
}

println calculate(5, null) // Throws NullPointerException
```
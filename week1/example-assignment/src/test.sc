val nums: List[Int] = List(1, 2, 3, 4, 1, 5, 6, 0, 10)
nums.head
nums.tail

def sum(xs: List[Int]) :Int = {
  if (xs.isEmpty) 0
  else xs.head + sum(xs.tail)
}

val answer = sum(nums)

@throws(classOf[NoSuchElementException])
def max(xs: List[Int]): Int = {

  try {
      val head = xs.head
      val tail = xs.tail
      if (tail.isEmpty) head
      else {
        val m = max(tail)
        if (head >= m) head else m
      }
  } catch {
    case nsee: NoSuchElementException => throw (nsee)
  }
}

val answer2 = max(nums)

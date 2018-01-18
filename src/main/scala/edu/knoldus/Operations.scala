package edu.knoldus

class Operations {


 def calculateLength[A](inputlist: List[A]): Int = {
  inputlist.foldRight(0)((_, b) => b + 1)
 }

 def concatList[A](first: List[A], second: List[A]): List[A] = {
  second match {
   case head :: tail => concatList(first :+ head, tail)
   case _ => first
  }
 }

 def splitList[A](first: List[A], f: A => Boolean): (List[A], List[A]) = {
  def separateList[A](first: List[A], firsthalf: List[A], secondhalf: List[A]): (List[A], List[A]) = {
   first match {
    case head :: tail => {
     if (splitMethod(head.asInstanceOf[Int])) {
      val updatedfirsthalf = firsthalf :+ head
      separateList(tail, updatedfirsthalf, secondhalf)
     }
     else {
      val updatedsecondhalf = secondhalf :+ head
      separateList(tail, firsthalf, updatedsecondhalf)
     }
    }
    case _ => (firsthalf, secondhalf)
   }
  }

  separateList(first, List(), List())
 }

  def splitMethod(input: Int): Boolean = {
  if (input % 2 == 0) {true}
  else {false}
 }

/* def hasSubsequence[A](inputlist: List[A],sub: List[A]): Boolean = {
  def checkSubsequence[A](inputList: List[A],subarray: Array[Int],subarraylength: Int,check: Int): Boolean= {
   inputlist match {
    case head :: tail => {if (head == sub(check))
    checkSubsequence(tail,sub.toArray,subarraylength,check+1)
   }
  }
  checkSubsequence(inputlist,sub.toArray,sub.length,0)
 }

}*/
}

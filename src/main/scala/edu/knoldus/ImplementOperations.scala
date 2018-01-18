package edu.knoldus

import org.apache.log4j.Logger.getLogger


object ImplementOperations extends App {
 val log = getLogger(this.getClass)
 val inputlist1 = (1 to 10).toList
 val inputlist2 = (11 to 14).toList
 val perform = new Operations

 def splitMethod(input: Int): Boolean = if (input % 2 == 0) {true}
 else {false}

 log.debug(perform.calculateLength(inputlist1) + " is the length of your list \n")
 log.debug("after concatenation list is now : " + perform.concatList(inputlist1, inputlist2) + "\n")
 log.debug(perform.splitList(inputlist1, splitMethod))
}

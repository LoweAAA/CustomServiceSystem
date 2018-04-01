import java.io.File

import scala.collection.immutable.{List, Set}

object hello {
  /* 这是我的第一个 Scala 程序
   * 以下程序将输出'Hello World!'
   */
  def main(args: Array[String]) {

    var sf=new AprioriAlgorithm()
    sf.runApriori()
    var res:(Set[Int], Set[Int], Double)=(Set(),Set(),0)
    var  str1,str2:Int=(-1);
    for(res<-sf.associationRules){
      print("向购买")
      for(str1<-res._1) print(str1+";")
      print("的人推荐")
      for(str2<-res._2) printf(str2+";")
      print("可信度为")
      println(res._3)
    }


  }
}

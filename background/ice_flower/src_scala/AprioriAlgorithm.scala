
import scala.io.Source
import scala.collection.immutable.List
import scala.collection.immutable.Set
import java.io.File
import scala.collection.mutable.Map

class AprioriAlgorithm() {
  var transactions : List[Set[Int]] =List(Set(0,2,4),Set(1,2,4),Set(0,1,2,4),Set(1,4))
  var itemSet : Set[Int] = Set(0,1,2,3,4)

  var toRetItems : Map[Set[Int], Double] = Map()
  var associationRules : List[(Set[Int], Set[Int], Double)] = List()

  def getSupport(itemComb : Set[Int]) : Double = {
    def withinTransaction(transaction : Set[Int]) : Boolean = itemComb //A,B
      .map( x => transaction.contains(x))
      .reduceLeft((x1, x2) => x1 && x2)
    val count = transactions.filter(withinTransaction).size
    count.toDouble / transactions.size.toDouble
  }

  def runApriori(minSupport : Double = 0.15, minConfidence : Double = 0.6) = {
    //itemCombs is 1 frequent item
    var itemCombs = itemSet.map( word => (Set(word), getSupport(Set(word))))
      .filter( wordSupportPair => (wordSupportPair._2 > minSupport))
    var currentLSet : Set[Set[Int]] = itemCombs.map( wordSupportPair => wordSupportPair._1).toSet
    var k : Int = 2
    while (currentLSet.size > 0) {
      val currentCSet : Set[Set[Int]] = currentLSet.map( wordSet => currentLSet.map(wordSet1 => wordSet | wordSet1))
        .reduceRight( (set1, set2) => set1 | set2)
        .filter( wordSet => (wordSet.size==k))
      val currentItemCombs = currentCSet.map( wordSet => (wordSet, getSupport(wordSet)))
        .filter( wordSupportPair => (wordSupportPair._2 > minSupport))
      currentLSet = currentItemCombs.map( wordSupportPair => wordSupportPair._1).toSet
      itemCombs = itemCombs | currentItemCombs
      k += 1
    }
    for (itemComb<-itemCombs) {
      toRetItems += (itemComb._1 -> itemComb._2)
    }
    calculateAssociationRule(minConfidence)
  }

  def calculateAssociationRule(minConfidence : Double = 0.6) = {
    toRetItems.keys.foreach(item =>
      item.subsets.filter( wordSet => (wordSet.size<item.size & wordSet.size>0))
        .foreach( subset => {associationRules = associationRules :+ (subset, item diff subset,
          toRetItems(item).toDouble/toRetItems(subset).toDouble)
        }
        )
    )
    associationRules = associationRules.filter( rule => rule._3>minConfidence)
  }
}
import collection.mutable.Map
class Recom {
  var item= Array(Array[Int](3,4,0,0,5),
    Array[Int](1,2,0,3,0),
    Array[Int](0,3,0,1,2),
    Array[Int](3,5,0,2,2),
    Array[Int](3,0,1,0,0),
  )
  def Recom(){}
  def Recom(ar: Array[Array[Int]]){item=ar;}
  def aver(u:Int):Double={
    val effectItem=for(i<-item(u) if(i!=0)) yield i
    effectItem.sum.toDouble/effectItem.length
  }
  def sim(i:Int,j:Int):Double={
    val comItem=for(k<-0 to item(i).length-1 if(item(i)(k)*item(j)(k)!=0)) yield k
    if(comItem.size==0) return 0
    val iAver=aver(i)
    val jAver=aver(j)
    var si,sj,sij:Double=0
    for(k<-comItem){
      sij+=(item(i)(k)-iAver)*(item(j)(k)-jAver)
      si+=(item(i)(k)-iAver)*(item(i)(k)-iAver)
      sj+=(item(j)(k)-jAver)*(item(j)(k)-jAver)
    }
    (sij+0.2)/Math.sqrt(si+0.2)/Math.sqrt(sj+0.2)
  }
  def getItems(u:Int)={
    val userSimMap= for(i<-0 until item.length if(i!=u)) yield(i,sim(i,u))
    var resItem:Map[Int,Double]=Map()
    val uaver=aver(u)
    for(t<- 0 until item(u).length if(item(u)(t)==0)) {
      var numerator,denominator:Double=0
      for((k,v)<-userSimMap) {
        denominator+=Math.abs(v)
        numerator+=v*(item(k)(t)-aver(k))
      }
      resItem+=((t,uaver+numerator/denominator))
    }
    val value=0.8*resItem.values.max+0.2*resItem.values.min
    val res=for((k,v)<-resItem if(v>=value)) yield k
    res
  }
}
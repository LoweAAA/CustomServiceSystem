
class ad  (val adid:Int ,val comid:Int,val param1:Int,param2:Int){
  val socre={param1*1+param2*1}
}

class adrecom(ads: Array[ad]){
  val alist:List[ad]=ads.toList
  def getadid:Array[Int]= {
    import  ad.adorder._
    val res=alist.sorted
    val i=res(0).adid
    var j= -1
    for(it<-res) if(it.comid!=res(0).comid) j=it.adid
    Array(i,j)
  }
}
object ad {
  def apply(adid: Int,comid: Int,param1: Int,param2: Int): ad = new ad(adid, comid, param1, param2)
  implicit object adorder extends Ordering[ad]{
    override def compare(x: ad, y: ad): Int ={
      y.socre.compareTo(x.socre)
    }
  }

}

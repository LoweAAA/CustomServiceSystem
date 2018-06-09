public class tt {
    public static void main(String[] args)
    {
       Apriori ap=new Apriori();
       ap.runApriori(0.15,0.6); //支持度和置信度，不知道不用改
        //ap.readRules(); 当已经计算过一次 可以用 readRules()方法替代
      System.out.println(ap.getItems(2));
    }
}

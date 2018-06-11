public class tt {
    public static void main(String[] args)
    {
        adrecom ad1=new adrecom(new ad[]{
                new ad(1,2,3,4),
                new ad(2,3,4,5),
                new ad(3,3,1,4)
        });
        int []b=ad1.getadid();
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}

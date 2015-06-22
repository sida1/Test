/**
 * Created by IntelliJ IDEA.
 * User: sidath
 * Date: Jun 22, 2015
 * Time: 10:11:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {


    public static void main (String args[]){

        String ss=null;
        try {
             System.out.println("Errors");
             if(ss.equals("test")){
                System.out.println("1");
             }
             System.out.println("2");

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            System.out.println("3");
        } finally {
        }

        System.out.println("4");


        

    }
}

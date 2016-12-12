package jp.ac.uryukyu.ie.e145741;

/**
 * Created by e145741 on 2016/12/12.
 */
public class report5 {

    public static void main(String[] args) {
        try{
            String str = "3．14";
            Double value = Double.parseDouble(str);
            System.out.println(str.length());
        } catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました");
            e.printStackTrace();
        }
    }
}

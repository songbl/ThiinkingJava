package sample.thirteen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Format {
    public static void main(String[] args) {
        String str=String.format("%d元%.2f斤",100,45.567); //100元45.57斤  .3f保留小数位数,四舍五入
        String str2=String.format("%11f斤",145.5);//控制位数，小数点也占一位
        System.out.println(str);
        System.out.println(str2);

        String str5=String.format("%,d",12345);//结果为：12,345
        String str6=String.format("%+,d",12345);//结果为：+12,345
        System.out.println(str5);
        System.out.println(str6);

        String str3=String.format("%6d",123);//结果为：   123
        String str4=String.format("%-6d%f",123,456.1);//结果为：123   456
        String str7=String.format("%.3f",123.4567);//结果为：123.456
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str7);

        Date date=new Date();
        String str8=String.format(Locale.CHINA,"%tF",date);//结果为：Jan
        System.out.println(str8);

        Date date2 = new Date();                //分配 Date 对象并初始化此对象
        //用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
        SimpleDateFormat date1  = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss E");
        String str9 =date1.format(date2);
        System.out.println(str9);

    }
}

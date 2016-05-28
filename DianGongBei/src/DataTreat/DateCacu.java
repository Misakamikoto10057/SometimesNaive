package DataTreat;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by ZNing on 16/5/28.
 */
public class DateCacu {
    public static void main(String[] args) throws Exception{

        String f="Hi.csv";

        InputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        while((str = br.readLine()) != null){
            System.out.println(str);
            int year = Integer.parseInt(str.substring(0,4));
            int month = Integer.parseInt(str.substring(4,6));
            int day = Integer.parseInt(str.substring(6,8));
            //获取星期情况
            GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);//建立对象
            int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;// 获取这一天是星期几
            if(startDay == 6 || startDay == 0)//6:Saturday 0:Sunday
            {
                BufferedWriter out = new BufferedWriter(new FileWriter("JieJiaRi.csv",true));//去掉true可以覆盖读写文件
                out.write(str);
                out.newLine();
            }
            else
            {
                BufferedWriter out = new BufferedWriter(new FileWriter("GongZuoRi.csv",true));//去掉true可以覆盖读写文件
                out.write(str);
                out.newLine();
            }

        }





    }
}





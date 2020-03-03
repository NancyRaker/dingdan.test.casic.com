package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 日期的工具类
 * 
 */
public class DateUtil {
	//把字符串转成日期
	public static Date toDate(String dateFormat,String date) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			return	sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//把日期转换成字符串
	public static String dateToString(String dateFormat,Date date) {
		return new SimpleDateFormat(dateFormat).format(date);
	}
}

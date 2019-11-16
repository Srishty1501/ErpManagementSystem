package Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateUtils {
		
		public static java.util.Date acceptDate() {
			java.util.Date dt = null;
			Scanner in = new Scanner(System.in);
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String str = in.nextLine();
			try {
				dt = df.parse(str);
			} catch (ParseException e) {
				System.out.println("invalid format");
			} 
			in.close();
			return dt;
		}

		public static java.util.Date convertDate(String date) {
			String[] month= {"xyz","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			String dd=date.substring(0,2);
			String mm=date.substring(3,6);

			String Str1;
			String Str2;
			String finalDate=new String();
			for(int i=1; i<=12;i++) {
				if(mm.equals(month[i])) {
					if(i<10) {
					 Str1=String.valueOf(i);
					Str2="0"+Str1;
					finalDate=dd+"-"+Str2+"-2019";
					}
					else {
						Str1=String.valueOf(i);
						finalDate=dd+"-"+"-2019";
					}
					break;
				}
				else
					continue;
			}
			
			java.util.Date dt = null;
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			try {
				dt = df.parse(finalDate);
			} catch (ParseException e) {
				System.out.println("invalid format");
			}
			return dt;
		}
		
		public static void main(String[] args) {
			
			
			
		}
}

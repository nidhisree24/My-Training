package excelread;

import java.io.IOException;

public class ExcelMain 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		ExcelCode ec=new ExcelCode ();//Aggregation
		String s=ec.read(0, 1);
		System.out.println(s);
		String s1=ec.read(0, 0);
		System.out.println(s1);

	}

}

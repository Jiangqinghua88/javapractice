public class Demo2 {
	public static void main(String[] args) {
		int lay;
		lay = 7;
		
		for (int m = 1;m<=(lay+1)/2;m++)  //正序输出上半部分
		{
			for (int b =1 ; b<= (2- m +2);b++)//输出空格
			{
				System.out.print(" ");
			}
			
			for  (int c =1; c<= m*2-1;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int d = 0;d<3;d++)  ////倒序输出下半部分
		{
			for (int b =0; b<d+1; b++) //输出空格
			{
				System.out.print(" ");
			}
			
			for (int c =0; c< 4-2*d +1;c++ ) // ;输出下半个三角形
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
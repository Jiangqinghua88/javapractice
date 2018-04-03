public class ContentEquals{
	public static void main(String[] args){
		String str1 = "String1";
		String str2 = "String2";
		StringBuffer str3 = new StringBuffer("String1");
		
		boolean result = str1.contentEquals(str3);  //contentEquals() 方法用于将此字符串与指定的 StringBuffer 比较。返回值如字符串与指定 StringBuffer 表示相同的字符序列，则返回 true；否则返回 false。
		System.out.println(result);
		
		result = str2.contentEquals(str3);
		System.out.println(result);
	}

}

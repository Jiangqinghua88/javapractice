
public class CompareTo {
	public static void main(String[] args){
		String str1 = "Strings";
		String str2 = "Strings";
		String str3 = "Strings123";
		
		int result = str1.compareTo(str2);  //如果参数字符串等于此字符串，则返回值 0；
		System.out.println(result);
		
		result = str1.compareTo(str3); //如果此字符串小于字符串参数，则返回一个小于 0 的值；
		System.out.println(result);
		
		result = str3.compareTo(str1);如果此字符串大于字符串参数，则返回一个大于 0 的值。
		System.out.println(result);
	}

}

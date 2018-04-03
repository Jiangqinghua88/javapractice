
public class Intern {
	public static void main(String[] args){
		String Str1 = new String("www.runoob.com");
		String Str2 = new String("WWW.RUNOOB.COM");
		
		System.out.print("规范化表示");
		System.out.println(Str1.intern());
		
		
		System.out.print("规范表示");
		System.out.println(Str2.intern());  //intern() 方法返回字符串对象的规范化表示形式。
		
		String greeting = "Hello";
		String s = greeting.substring(0,3);  //String 类的substring 方法可以从一个较大的字符串提取出一个子串
		
		System.out.println(s);
		
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + PG13; //Java 语言允许使用+ 号连接（拼接）两个字符串。
		
		System.out.println(message);
	}

}

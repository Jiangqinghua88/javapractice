
public class Intern {
	public static void main(String[] args){
		String Str1 = new String("www.runoob.com");
		String Str2 = new String("WWW.RUNOOB.COM");
		
		System.out.print("�淶����ʾ");
		System.out.println(Str1.intern());
		
		
		System.out.print("�淶��ʾ");
		System.out.println(Str2.intern());  //intern() ���������ַ�������Ĺ淶����ʾ��ʽ��
		
		String greeting = "Hello";
		String s = greeting.substring(0,3);  //String ���substring �������Դ�һ���ϴ���ַ�����ȡ��һ���Ӵ�
		
		System.out.println(s);
		
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + PG13; //Java ��������ʹ��+ �����ӣ�ƴ�ӣ������ַ�����
		
		System.out.println(message);
	}

}

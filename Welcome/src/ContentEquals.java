public class ContentEquals{
	public static void main(String[] args){
		String str1 = "String1";
		String str2 = "String2";
		StringBuffer str3 = new StringBuffer("String1");
		
		boolean result = str1.contentEquals(str3);  //contentEquals() �������ڽ����ַ�����ָ���� StringBuffer �Ƚϡ�����ֵ���ַ�����ָ�� StringBuffer ��ʾ��ͬ���ַ����У��򷵻� true�����򷵻� false��
		System.out.println(result);
		
		result = str2.contentEquals(str3);
		System.out.println(result);
	}

}

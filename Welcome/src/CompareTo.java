
public class CompareTo {
	public static void main(String[] args){
		String str1 = "Strings";
		String str2 = "Strings";
		String str3 = "Strings123";
		
		int result = str1.compareTo(str2);  //��������ַ������ڴ��ַ������򷵻�ֵ 0��
		System.out.println(result);
		
		result = str1.compareTo(str3); //������ַ���С���ַ����������򷵻�һ��С�� 0 ��ֵ��
		System.out.println(result);
		
		result = str3.compareTo(str1);������ַ��������ַ����������򷵻�һ������ 0 ��ֵ��
		System.out.println(result);
	}

}

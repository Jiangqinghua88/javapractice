//valuof //����ֵɾ��ͷβ�հ׷����ַ���
public class ValueOf {
	public static void main(String[] args){
		double d = 1100.00;
		boolean b = true;
		long l = 1234567890;
		char[] arr = {'r','u','n','o','o','b'};
		
		System.out.println("����ֵ��"+ String.valueOf(d));//���� double �������ַ�����ʾ��ʽ��
		System.out.println("����ֵ��"+ String.valueOf(b)); //���� boolean �������ַ�����ʾ��ʽ
		System.out.println("����ֵ��"+ String.valueOf(l));//���� long �������ַ�����ʾ��ʽ
		System.out.println("����ֵ��"+ String.valueOf(arr));// ���� char �������ַ�����ʾ��ʽ��
	}

}

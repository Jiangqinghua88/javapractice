
public class StringBufferTest {
	public static void main(String[] args){
		StringBuffer sBuffer = new StringBuffer("����̳̹�����");  //StringBuffer �� StringBuilder ��Ķ����ܹ�����ε��޸ģ����Ҳ������µ�δʹ�ö���
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		sBuffer.reverse();
		int s =1;
		sBuffer.insert(int offset,int s);
		System.out.println(sBuffer);
	}

}

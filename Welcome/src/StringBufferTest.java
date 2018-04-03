
public class StringBufferTest {
	public static void main(String[] args){
		StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");  //StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		sBuffer.reverse();
		int s =1;
		sBuffer.insert(int offset,int s);
		System.out.println(sBuffer);
	}

}

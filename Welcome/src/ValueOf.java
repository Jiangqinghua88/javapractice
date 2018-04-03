//valuof //返回值删除头尾空白符的字符串
public class ValueOf {
	public static void main(String[] args){
		double d = 1100.00;
		boolean b = true;
		long l = 1234567890;
		char[] arr = {'r','u','n','o','o','b'};
		
		System.out.println("返回值："+ String.valueOf(d));//返回 double 参数的字符串表示形式。
		System.out.println("返回值："+ String.valueOf(b)); //返回 boolean 参数的字符串表示形式
		System.out.println("返回值："+ String.valueOf(l));//返回 long 参数的字符串表示形式
		System.out.println("返回值："+ String.valueOf(arr));// 返回 char 参数的字符串表示形式。
	}

}

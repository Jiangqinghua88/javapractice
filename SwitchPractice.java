package test;

public class SwitchPractice {
   public static void main(String args[]){
	   char grade = 'C';
	   
	   switch(grade)
	   {
	     case 'A' :
	    	 System.out.println("����");
	    	 break;
	     case 'B' :
	    	 System.out.println("����");
	    	 break;
	     case 'C' :
	    	 System.out.println("����");
	    	 break;
	     case 'D' :
	         System.out.println("����Ҫ��Ŭ��");
	         break;
	     case 'F' :
	         System.out.println("�ӱ�Ŭ��");
	         break;
	     default :
	    	 System.out.println("δ֪�ȼ�");
	   
	   }
	   System.out.println("��ĵȼ���"+ grade);
	   
	   }
}

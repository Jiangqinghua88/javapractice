package test;
//���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ�� 
import java.io.*;
public class ExampleOne {
	public String name;
	public int score;
	//String grade;
	public ExampleOne(String getname){
		name = getname;
	}
	public void setGrade(int getscore){
		score = getscore;
		if(score >= 90){
			System.out.println(name + "ͬѧ�ĳɼ��ǣ�"+ score + "�����ѧϰ�ȼ�Ϊ��A");}
		else if(score>=60){
			System.out.println(name + "ͬѧ�ĳɼ��ǣ�"+ score + "�����ѧϰ�ȼ�Ϊ��B");}
		else{
			System.out.println(name + "ͬѧ�ĳɼ��ǣ�"+ score + "�����ѧϰ�ȼ�Ϊ��C");}
	}
	public static void main(String args[]){
	    ExampleOne sduOne = new ExampleOne("����");
	    sduOne.setGrade(55);
	    ExampleOne sduTwo = new ExampleOne("����");
	    sduTwo.setGrade(95);
	}

}

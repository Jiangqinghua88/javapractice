package test;
//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 
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
			System.out.println(name + "同学的成绩是："+ score + "。因此学习等级为：A");}
		else if(score>=60){
			System.out.println(name + "同学的成绩是："+ score + "。因此学习等级为：B");}
		else{
			System.out.println(name + "同学的成绩是："+ score + "。因此学习等级为：C");}
	}
	public static void main(String args[]){
	    ExampleOne sduOne = new ExampleOne("张三");
	    sduOne.setGrade(55);
	    ExampleOne sduTwo = new ExampleOne("李四");
	    sduTwo.setGrade(95);
	}

}

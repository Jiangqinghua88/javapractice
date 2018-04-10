
public class InstanceCounter {
	private static int numInstance = 0;
	protected static int getCount(){
		return numInstance;
	}
	
	private static void addInstance(){
		numInstance++;
	}
	
	InstanceCounter(){
		InstanceCounter.addInstance();
	}
	
	public static void main(String[] args){
		System.out.println("Start with " + InstanceCounter.getCount()+ " instances");
		for (int i=0; i<500;++i){
			InstanceCounter inst =	new InstanceCounter(); //创建一个对象
		}
		System.out.println("Created "+InstanceCounter.getCount()+" instances");
	}

}

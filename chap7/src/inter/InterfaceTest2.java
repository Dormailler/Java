package inter;

interface Volume{
	void volUp(int level);
	void volDown(int level);
}
class Speaker implements Volume{
	int VolLevel;
	@Override
	public void volUp(int level) {
		VolLevel += level;
		if(VolLevel > 100) VolLevel = 100;
		System.out.println("현재 스피커 볼륨 = "+ VolLevel);
	}
	@Override
	public void volDown(int level) {
		VolLevel -= level;
		if(VolLevel < -100) VolLevel = -100;
		System.out.println("현재 스피커 볼륨 = "+ VolLevel);
	}
}
class Radio implements Volume{
	int VolLevel;
	public void volUp(int level) {
		VolLevel += level;
		System.out.println("현재 라디오 볼륨 = "+ VolLevel);
	}
	public void volDown(int level) {
		VolLevel -= level;
		System.out.println("현재 라디오 볼륨 = "+ VolLevel);
	}
}
class TV implements Volume{
	int VolLevel;
	public void volUp(int level) {
		VolLevel += level;
		System.out.println("현재 TV 볼륨 = "+ VolLevel);
	}
	public void volDown(int level) {
		VolLevel -= level;
		if(VolLevel < 0) VolLevel = 0;
		System.out.println("현재 TV 볼륨 = "+ VolLevel);
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		Volume[] v = new Volume[3];
		v[0] = new Speaker();
		v[1] = new Radio();
		v[2] = new TV();
		for(int i = 0 ; i<v.length; i++) {
			v[i].volUp(100);
			v[i].volDown(200);
			v[i].volUp(50);
			v[i].volDown(50);
		}

	}

}

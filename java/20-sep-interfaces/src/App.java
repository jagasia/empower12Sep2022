
public class App {

	public static void main(String[] args) {
		MobilePhone phone=new MobilePhone();
		
//		phone.playMusic(new JBL());
//		phone.playMusic(new Boat());
//		phone.playMusic(new Sony());
		
		ThreePointFiveMmJack.alarm();
//		ThreePointFiveMmJack.music();
		Sony sony=new Sony();
		sony.music();
		
		ThreePointFiveMmJack x=new Sony();
	}

}

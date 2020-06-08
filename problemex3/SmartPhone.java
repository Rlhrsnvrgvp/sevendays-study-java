package problemex3;

public class SmartPhone extends Computer {

	public SmartPhone() {
		super("タブレットPC");
	}
	
	public void input() {
		System.out.println("タッチパネルディスプレイをタップして操作");
	}
	
	public void output() {
		System.out.println("タッチパネルディスプレイに出力");
	}
    public void communication(){
        System.out.println("インターネットと電話回線で通信");
    }
}

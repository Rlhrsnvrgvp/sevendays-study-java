package problemex3;
 
//  ���L�C���饹
public class FighterAiracraft extends AirPlane {
//public class FighterAiracraft {
/*
    //  �w�ЙC�Υ�����
    private String type = "���L�C";
    //  �����פ�ȡ��
    public String getType() {
        return type;
    }
*/

	public FighterAiracraft() {
		super("���L�C");
	}
	
    //  �w�Ф���
    public void fly(){
        System.out.println(getType() + " : ���Ĥ˳��뤿����w�Ф��ޤ���");
    }
    //  ���L����
    public void fight(){
        System.out.println("���L���ޤ���");
    }
}
package problemex3;
 
//  ���L�C���饹
public class PassengerPlane extends AirPlane {
/*
    //  �w�ЙC�Υ�����
	private String type = "�ÿ͙C";
    //  �����פ�ȡ��
    public String getType(){
        return type;
    }
*/
	public PassengerPlane() {
		super("�ÿ͙C");
	}
    //  �w�Ф���
    public void fly(){
        System.out.println(getType() + " : �\�ͤ�\����Ŀ�ĵؤޤ��w�Ф��ޤ���");
    }
    //  ���L����
    public void carryPassengers(){
        System.out.println("�\�ͤ�Ŀ�ĵؤޤ��\�Ӥޤ���");
    }
}
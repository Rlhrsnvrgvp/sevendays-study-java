package problemex3;
 
public class Problemex3_1 {
 
    public static void main(String[] args) {
        //  ���L�C���饹�Υ��󥹥��󥹤�����
        FighterAiracraft fighter = new FighterAiracraft();
        PassengerPlane airlinear = new PassengerPlane();
        //  ���L�C���饹�΄I��
        fighter.fly();                  //  �w�Ф���
        fighter.fight();                //  ���L����
        //  �ÿ͙C���饹�΄I��
        airlinear.fly();                //  �w�Ф���
        airlinear.carryPassengers();    //  �\�ͤ��\��
 
    }
 
}
package problemex2;
 
public class Problemex2_1 {
 
    public static void main(String[] args) {
        Fighter f = new Fighter();      //  ���L�C���饹
        Airplane a = new Airplane();    //  �w�ЙC���饹
        //  �w�ЙC���w�Ф���
        a.fly();
        //  ���L�C���w�Ф���
        f.fly();
        //  ���L�C�����L����
        f.fight();
 
    } 
}
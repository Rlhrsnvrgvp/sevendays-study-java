package problemex4;
 
//  ����`��Ĥ��rӋ���饹
public class AlarmClock implements IClock,IAlarm{
    public void alarm(){
        System.out.println("����`����Q�餹");
    }
    public void setAlarm(){
        System.out.println("����`��򥻥åȤ���");
    }
    public void stopAlarm(){
        System.out.println("����`���ֹ���");
    }
    public void showTime(){
        System.out.println("�r�̤�֪��");
    }
    public void adjustTime(){
        System.out.println("�r�̤���������");
    }
 
}
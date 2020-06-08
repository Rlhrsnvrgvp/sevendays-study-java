package problemex4;
 
//  ¥¢¥é©`¥à¤Ä¤­•rÓ‹¥¯¥é¥¹
public class AlarmClock implements IClock,IAlarm{
    public void alarm(){
        System.out.println("¥¢¥é©`¥à¤òøQ¤é¤¹");
    }
    public void setAlarm(){
        System.out.println("¥¢¥é©`¥à¤ò¥»¥Ã¥È¤¹¤ë");
    }
    public void stopAlarm(){
        System.out.println("¥¢¥é©`¥à¤òÖ¹¤á¤ë");
    }
    public void showTime(){
        System.out.println("•r¿Ì¤òÖª¤ë");
    }
    public void adjustTime(){
        System.out.println("•r¿Ì¤òÐÞÕý¤¹¤ë");
    }
 
}
package problemex4;
 
public class CellPhone implements IPhone,IMailer,IComputer{
    //  ��`������Ť���
    public void sendMail(){
        System.out.println("��`����ͤ�");
    }
    //  ��`������Ť���
    public void recieveMail(){
        System.out.println("��`������Ť���");
    }
    //  web����E����
    public void borwseWeb(){
        System.out.println("�����֤���E����");
    }
    //  ���`��򤹤�
    public void playGame(){
        System.out.println("���`��򤹤�");
    }
    //  �Ԓ�򤫤���
    public void callPhone(){
        System.out.println("�Ԓ��줱��");
    }
    //  �Ԓ���ܤ���
    public void recievePhone(){
        System.out.println("�Ԓ���ܤ���");
    }
 
}
package problemex3;
 
public class Problemex3_2 {
 
    public static void main(String[] args) {
        Computer[] cp = new Computer[3];
        cp[0] = new PersonalComputer();     //  �ѩ`���ʥ륳��ԥ�`��
        cp[1] = new TabletPC();             //  ���֥�å�PC
        cp[2] = new SmartPhone();           //
        for(Computer c:cp){
            c.showType();
            c.input();
            c.output();
            c.communication();
            System.out.println("--------------------------------------");
        }
 
    }
 
}
package problemex3;

//  ����ԥ�`���γ��󥯥饹
public abstract class Computer {
    //  ����ԥ�`���Υ�����
    private String type;
    //  ���󥹥ȥ饯��
    public Computer(String type){
        this.type = type;
    }
    //  �����I��
    public abstract void input();
    //  �����I��
    public abstract void output();
    //  ͨ�ńI��
    public abstract void communication();
    //  �����פγ���
    public void showType(){
        System.out.println("����ԥ�`���ηN�:" + type);
    }
}
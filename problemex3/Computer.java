package problemex3;

//  コンピュータの抽象クラス
public abstract class Computer {
    //  コンピュータのタイプ
    private String type;
    //  コンストラクタ
    public Computer(String type){
        this.type = type;
    }
    //  入力処理
    public abstract void input();
    //  出力処理
    public abstract void output();
    //  通信処理
    public abstract void communication();
    //  タイプの出力
    public void showType(){
        System.out.println("コンピュータの種類:" + type);
    }
}
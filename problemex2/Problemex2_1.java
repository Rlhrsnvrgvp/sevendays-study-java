package problemex2;
 
public class Problemex2_1 {
 
    public static void main(String[] args) {
        Fighter f = new Fighter();      //  戦闘機クラス
        Airplane a = new Airplane();    //  飛行機クラス
        //  飛行機が飛行する
        a.fly();
        //  戦闘機が飛行する
        f.fly();
        //  戦闘機が戦闘する
        f.fight();
 
    } 
}
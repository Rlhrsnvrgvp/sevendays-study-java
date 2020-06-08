package problemex3;
 
//  戦闘機クラス
public class FighterAiracraft extends AirPlane {
//public class FighterAiracraft {
/*
    //  飛行機のタイプ
    private String type = "戦闘機";
    //  タイプの取得
    public String getType() {
        return type;
    }
*/

	public FighterAiracraft() {
		super("戦闘機");
	}
	
    //  飛行する
    public void fly(){
        System.out.println(getType() + " : 攻撃に出るために飛行します。");
    }
    //  戦闘する
    public void fight(){
        System.out.println("戦闘します。");
    }
}
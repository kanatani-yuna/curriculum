//Taiyakiクラスを作成
class Taiyaki {
    //コンストラクタ
    constructor(nakami) {
        this.nakami = nakami;
    }

    //中身出力するメソッド（関数）作成
    type() {
        console.log('中身は' + this.nakami +'です');
    }
}
//インスタンス化
let anko = new Taiyaki('あんこ');
let cream = new Taiyaki('クリーム');
let cheese = new Taiyaki('チーズ');

anko.type();
cream.type();
cheese.type();

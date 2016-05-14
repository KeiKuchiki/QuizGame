package quizgame.test.com.quizgame;

/**
 * Created by Ke on 2016/04/28.
 */
        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {

        /*
            ここで任意のデータベースファイル名と、バージョンを指定する
            データベースファイル名 = MyTable.db
            バージョン = 1
         */
        super(context, "MyTable.db", null, 1);
    }

    //onCreateメソッド
    /*
    onCreateメソッドはデータベースを初めて使用する時に実行される処理
    ここでテーブルの作成や初期データの投入を行う
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // テーブルの作成
        db.execSQL("CREATE TABLE MyTable " +
                "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", WordA TEXT" +
                ", WordB TEXT" +
                ", CorrectCount INTEGER" +
                ", DisplayCount INTEGER" +
                ")");

        // 初期データ投入
        db.execSQL("INSERT INTO MyTable(WordA,WordB, CorrectCount, DisplayCount) values ('English','英語',0,0);");
        db.execSQL("INSERT INTO MyTable(WordA,WordB, CorrectCount, DisplayCount) values ('Japanese','日本語',0,0);");
    }

    /*
     * onUpgradeメソッド
     * onUpgrade()メソッドはデータベースをバージョンアップした時に呼ばれる
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // とりあえず今回は空でOK
    }
}
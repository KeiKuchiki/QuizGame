package quizgame.test.com.quizgame;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class EtoJ extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //タイトルバーを非表示にする（必ずsetContentViewの前にすること）
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトをセットする
        setContentView(R.layout.activity_main);

    }

    // ボタンがタッチされた時の処理
    public void onClick(View v){
        switch (v.getId()) {
            // タッチされたボタンがノーマルの場合
            case R.id.button_normal:
                Toast.makeText(this, "English to Japanese" , Toast.LENGTH_SHORT).show();
                break;
            // タッチされたボタンがランダムの場合
            case R.id.button_random:
                Toast.makeText(this, "Japanese to English", Toast.LENGTH_SHORT).show();
                break;
            // タッチされたボタンがタイムアタックの場合
            case R.id.button_time:
                Toast.makeText(this, "Add New Word", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
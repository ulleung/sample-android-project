package kr.kro.jhseo1107.ulleungandroidtest;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import kr.kro.jhseo1107.EncryptBuilder1107;
import kr.kro.jhseo1107.EncryptMethod;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {
    public static EncryptBuilder1107 ㄱ = new EncryptBuilder1107();

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
    }

    public void 클릭시(View ㅂ) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        int 입력창id = R.id.입력창;
        EditText 입력 = (EditText)super.findViewById(입력창id);;

        String 내용문자열 = "";
        내용문자열 = 입력.getText().toString();

        ㄱ.setPlainText(내용문자열);
        String 사용할암호화방식 = EncryptMethod.SHA_256;
        ㄱ.setEncryptMethod(사용할암호화방식);

        String 결과문자열 = ㄱ.build();

        int 결과id = R.id.결과;
        TextView 결과 = (TextView)super.findViewById(결과id);;

        결과.setText(결과문자열);
    }
}
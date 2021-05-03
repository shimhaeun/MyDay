package org.ict.myday;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

//        // 레이아웃 생성
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//
//        // 레이아웃 파라미터 생성
//        LinearLayout.LayoutParams linearLayoutParams =
//                new LinearLayout.LayoutParams(
//                        LinearLayout.LayoutParams.MATCH_PARENT,
//                        LinearLayout.LayoutParams.MATCH_PARENT
//                );
//
//        // EditText를 생성한 후 파라미터 설정
//        EditText editText = new EditText(this);
//        editText.setHint("제목");
    }
}

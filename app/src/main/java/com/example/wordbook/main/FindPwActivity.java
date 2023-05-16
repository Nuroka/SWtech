package com.example.wordbook.main;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.wordbook.BaseActivity;
import com.example.wordbook.R;

import org.json.JSONException;
import org.json.JSONObject;


public class FindPwActivity extends AppCompatActivity {
    private EditText et_id;
    private Button btn_findpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputid);

        et_id = findViewById(R.id.et_id);

        btn_findpw = findViewById(R.id.btn_findpw2);


        //추가
        //비밀번호 찾기 버튼을 클릭 시 수행
        btn_findpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindPwActivity.this, PwanswerActivity.class);
                startActivity(intent);
            }
        });

    }
}

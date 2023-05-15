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


public class FindPw extends AppCompatActivity {
    private EditText et_id;
    private Button btn_findpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputid);

        et_id = findViewById(R.id.et_id);

        btn_findpw = findViewById(R.id.btn_findpw2);

        // 비밀번호 찾기 버튼을 클릭 시 수행
        btn_findpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindPw.this, BaseActivity.class);
                startActivity(intent);
            }
        });

        btn_findpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // EditText에 현재 입력되어있는 값을 get(가져온다)해온다.
                String userID = et_id.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            // TODO : 인코딩 문제때문에 한글 DB인 경우 로그인 불가
                            System.out.println("inhyuk" + response);
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success) { // 로그인에 성공한 경우
                                String userID = jsonObject.getString("userID");

                                Toast.makeText(getApplicationContext(),"등록된 ID입니다.",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(FindPw.this, BaseActivity.class);
                                intent.putExtra("userID", userID);
                                startActivity(intent);
                            } else { // 로그인에 실패한 경우
                                Toast.makeText(getApplicationContext(),"등록되지 않은 ID입니다.",Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest(userID, responseListener);
                RequestQueue queue = Volley.newRequestQueue(FindPw.this);
                queue.add(loginRequest);
            }
        });

    }
}
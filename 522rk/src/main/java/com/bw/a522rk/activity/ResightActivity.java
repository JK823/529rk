package com.bw.a522rk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bw.a522rk.MainActivity;
import com.bw.a522rk.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * date:2020/5/22
 * author:王成虎(13671)
 * month:五月
 * function:
 */
public class ResightActivity extends AppCompatActivity {

    @BindView(R.id.edit_register_phone)
    EditText editRegisterPhone;
    @BindView(R.id.edit_register_pwd)
    EditText editRegisterPwd;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        ButterKnife.bind(this);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResightActivity.this, MainActivity.class));
            }
        });

    }
}

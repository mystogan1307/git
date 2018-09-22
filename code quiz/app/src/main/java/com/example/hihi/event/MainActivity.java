package com.example.hihi.event;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void btn_tong2so (View view)
    {
        EditText edita=(EditText)
                findViewById(R.id.editsoa);
//        lấy giá trị từ edit a
        int a=Integer.parseInt(edita.getText()+"");
//        ép kiểu
        EditText editb=(EditText)
                findViewById(R.id.editsob);
        int b=Integer.parseInt(editb.getText()+"");
        TextView kq=(TextView) findViewById(R.id.kq);
        kq.setText((a+b)+"");
//        tính tổng
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}

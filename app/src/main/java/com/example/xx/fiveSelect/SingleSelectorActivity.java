package com.example.xx.fiveSelect;


import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class SingleSelectorActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_selector);
        mTextView= (TextView) findViewById(R.id.tv_result);
        Intent intent=getIntent();
        Bundle bun=intent.getExtras();
        mTextView.setText(bun.getString("pos")+"色鼠标已选择");
        Button btnn= (Button) findViewById(R.id.btnn);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}



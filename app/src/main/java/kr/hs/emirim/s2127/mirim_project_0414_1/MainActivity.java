package kr.hs.emirim.s2127.mirim_project_0414_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Switch checkStart;
    ImageView imgv;
    LinearLayout LinearSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearSub = findViewById(R.id.Linear_sub);
        rg = findViewById(R.id.rg);
        checkStart = findViewById(R.id.check_start);
        imgv = findViewById(R.id.imgv);
        Button btnDone = findViewById(R.id.btn_done);
        btnDone.setOnClickListener(btnListener);
        checkStart.setOnCheckedChangeListener(checkListener);
        Button btnFinish = findViewById(R.id.btn_finish);
        btnFinish.setOnClickListener(btnListener);
        Button btnFirst=findViewById(R.id.btn_first);
        btnFirst.setOnClickListener(btnListener);
        View.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn_finish:
                        finish();
                        break;
                    case R.id.btn_first:
                        LinearSub.setVisibility(view.INVISIBLE);
                        break;
                }

            }

        };

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (rg.getCheckedRadioButtonId()){
                case R.id.rb_dog:
                    imgv.setImageResource(R.drawable.dogpt);
                    break;
                case R.id.rb_cat:
                    imgv.setImageResource(R.drawable.catpt);
                    break;
                case R.id.rb_rabbit:
                    imgv.setImageResource(R.drawable.bunnypt);
                    break;
            }

        }
    };
    CompoundButton.OnCheckedChangeListener checkListener = new CompoundButton.OnCheckedChangeListener(){
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if(isChecked){
            LinearSub.setVisibility(View.VISIBLE);
        }
        else{
            LinearSub.setVisibility(View.INVISIBLE);
        }

        }
    };
}
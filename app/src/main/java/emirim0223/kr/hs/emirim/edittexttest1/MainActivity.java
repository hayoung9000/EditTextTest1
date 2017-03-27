package emirim0223.kr.hs.emirim.edittexttest1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText)findViewById(R.id.edit1);
        Button butok=(Button)findViewById(R.id.but_ok);
        textresult=(TextView)findViewById(R.id.text_result);

        butok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name=edit1.getText().toString();
                textresult.setText("입력한 성명은 "+name+"입니다.");
            }
        });
    }
}

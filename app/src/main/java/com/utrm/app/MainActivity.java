package com.utrm.app;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //VARIBALES
    boolean buttonStatus;
    Button boton;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //START
        buttonStatus = true;
        boton = findViewById(R.id.button1);
        text = findViewById(R.id.textView1);
    }

 //comentario test github
    //SET THE METHODS
    public void clickbutton(View view){
        if(buttonStatus == true){
            text.setText("Hello, this is a button");
            buttonStatus = false;
        }else{
            text.setText("The button has changed!");
            buttonStatus = true;
        }
    }
}
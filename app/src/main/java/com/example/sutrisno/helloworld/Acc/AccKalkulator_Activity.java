package com.example.sutrisno.helloworld.Acc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

import com.example.sutrisno.helloworld.R;

public class AccKalkulator_Activity extends Activity implements  TextWatcher {

    public String str ="";
    Character op = 'q';
    float i,num,numtemp;
    EditText showResult;
    TextView txtBinary,txtOctal,txtHexadecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acc_activity_kalkulator);

        showResult = (EditText)findViewById(R.id.editText_decimal);
        txtBinary=(TextView)findViewById(R.id.tV_binary);
        txtOctal=(TextView)findViewById(R.id.tV_okt2);
        txtHexadecimal=(TextView)findViewById(R.id.tV_hex2);
        showResult.addTextChangedListener(this);
    }

    public void btn1_click(View view) {
        insert(1);
    }

    public void btn2_click(View view) {
        insert(2);
    }

    public void btn3_click(View view) {
        insert(3);
    }

    public void btn4_click(View view) {
        insert(4);
    }

    public void btn5_click(View view) {
        insert(5);
    }

    public void btn6_click(View view) {
        insert(6);
    }

    public void btn7_click(View view) {
        insert(7);
    }

    public void btn8_click(View view) {
        insert(8);
    }
    public void btn9_click(View view) {
        insert(9);
    }

    public void btn0_click(View view) {
        insert(0);
    }
    public void btn_delete_click(View view) {
        reset();
    }

    private void insert(int j) {
        str = str + Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);
    }
    private void reset() {
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }

    public void beforeTextChanged(CharSequence sequence,int start,int count,int after) {

    }
    public void afterTextChanged(Editable editable)
    {

    }

    public void onTextChanged(CharSequence sequence,int start,int before,int count)
    {
        calculate(2,txtBinary);        // for base 2 (binary)
        calculate(8,txtOctal);        // for base 8 (octal)
        calculate(16,txtHexadecimal);    // for base 16 (hexadecimal)
    }
    public void calculate(int base,TextView txtView)
    {
        if(showResult.getText().toString().trim().length()==0)
        {
            txtView.setText("");
            return;
        }
        try
        {
            Stack<Object> stack=new Stack<Object>();
            int number=Integer.parseInt(showResult.getText().toString());
            while (number>0)
            {
                int remainder=number%base; // find remainder
                if(remainder<10)
                // for remainder smaller than 10
                {
                    stack.push(remainder);
                    // push remainder in stack
                }
                else
                {
                    switch (remainder)
                    // for remainder larger than 9 (for hexadecimal values)
                    {
                        case 10:
                            stack.push("A");
                            break;
                        case 11:
                            stack.push("B");
                            break;
                        case 12:
                            stack.push("C");
                            break;
                        case 13:
                            stack.push("D");
                            break;
                        case 14:
                            stack.push("E");
                            break;
                        case 15:
                            stack.push("F");
                            break;
                    }
                }
                number/=base;
            }
            StringBuffer buffer=new StringBuffer();
            while (!stack.isEmpty())
            {
                buffer.append(stack.pop().toString());
            }
            txtView.setText(buffer.toString());
        }
        catch (Exception e)
        {
            txtView.setText(e.getMessage());
        }
    }

}

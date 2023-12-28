package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvsec,tvMain;
    Button bac,bc,bbrac1,bbrac2,bsin,bcos,btan,blog,bln,bfact,bsquare,bsqrt,binv,b0,b9,b8,b7,b6,b5,b4;
    Button b3,b2,b1,bpi,bmul,bminus,bplus,bequal,bdot,bdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvsec = findViewById(R.id.idTVSecondary);
        tvMain = findViewById(R.id.idTVprimary);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bbrac1 = findViewById(R.id.bbrac1);
        bbrac2 = findViewById(R.id.bbrac2);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        binv = findViewById(R.id.binv);
        b0 = findViewById(R.id.b0);
        b9 = findViewById(R.id.b9);
        b8 = findViewById(R.id.b8);
        b7 = findViewById(R.id.b7);
        b6 = findViewById(R.id.b6);
        b5 = findViewById(R.id.b5);
        b4 = findViewById(R.id.b4);
        b3 = findViewById(R.id.b3);
        b2 = findViewById(R.id.b2);
        b1 = findViewById(R.id.b1);
        bpi = findViewById(R.id.bpi);
        bmul = findViewById(R.id.bmul);
        bminus = findViewById(R.id.bminus);
        bplus = findViewById(R.id.bplus);
        bequal = findViewById(R.id.bequal);
        bdot = findViewById(R.id.bdot);
        bdiv = findViewById(R.id.bdiv);

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + ".");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "+");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "/");
            }
        });

        bbrac1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "(");
            }
        });

        bbrac2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + ")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "3.142");
                tvsec.setText(bpi.getText().toString());
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "sin");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "cos");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "tan");
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "^(-1)");
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "ln");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText().toString() + "log");
            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if (!str.endsWith("-")) {
                    tvMain.setText(tvMain.getText().toString() + "-");
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if (!str.endsWith("*")) {
                    tvMain.setText(tvMain.getText().toString() + "*");
                }
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    String str = tvMain.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(str));
                    String result = Double.toString(r);
                    tvMain.setText(result);
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                double result = evaluate(str);
                String r = Double.toString(result);
                tvMain.setText(r);
                tvsec.setText(str);
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText("");
                tvsec.setText("");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                if (!str.equals("")) {
                    str = str.substring(0, str.length() - 1);
                    tvMain.setText(str);
                }
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    double d = Double.parseDouble(tvMain.getText().toString());
                    double square = d * d;
                    tvMain.setText(Double.toString(square));
                    tvsec.setText(d + "²");
                }
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    int value = Integer.parseInt(tvMain.getText().toString());
                    int fact = factorial(value);
                    tvMain.setText(Integer.toString(fact));
                    tvsec.setText(value + "!");
                }
            }
        });

    }

    public int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public double evaluate(String str) {
        return new Object() {
            int pos = -1;
            int ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') {
                    nextChar();
                }
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+')) {
                        x += parseTerm();
                    } else if (eat('-')) {
                        x -= parseTerm();
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*')) {
                        x *= parseFactor();
                    } else if (eat('/')) {
                        x /= parseFactor();
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (eat('+')) {
                    return parseFactor();
                }
                if (eat('-')) {
                    return -parseFactor();
                }

                double x;
                int startPos = pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startPos, pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') {
                        nextChar();
                    }
                    String func = str.substring(startPos, pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) {
                        x = Math.sqrt(x);
                    } else if (func.equals("sin")) {
                        x = Math.sin(Math.toRadians(x));
                    } else if (func.equals("cos")) {
                        x = Math.cos(Math.toRadians(x));
                    } else if (func.equals("tan")) {
                        x = Math.tan(Math.toRadians(x));
                    } else if (func.equals("log")) {
                        x = Math.log10(x);
                    } else if (func.equals("ln")) {
                        x = Math.log(x);
                    } else {
                        throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) {
                    x = Math.pow(x, parseFactor());
                }

                return x;
            }
        }.parse();
    }
}
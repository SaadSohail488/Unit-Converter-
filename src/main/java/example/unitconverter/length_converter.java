package com.example.unitconverter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Arrays;

public class length_converter extends AppCompatActivity {
    CardView convertfromUnit, converttoUnit, convert;
    RelativeLayout mCLayout;
    String fromUnit = "inch";
    String toUnit = "Inch";
    TextView textfromUnit, testtoUnit;
    EditText editfromUnit, edittoUnit;
    final String[] values = new String[]{
            "Inch",
            "Foot",
            "Yard",
            "Mile",
            "CM",
            "KM",
    };

    //Inch
    private String inFoot(double in) {
        double f = in / 12;
        return String.valueOf(f);
    }

    private String inYard(double in) {
        double y = in / 36;
        return String.valueOf(y);
    }

    private String inMile(double in) {
        double m = in / 63360;
        return String.valueOf(m);
    }

    private String inCM(double in) {
        double c = in * 2.54;
        return String.valueOf(c);
    }

    private String inKM(double in) {
        double k = in / 39370;
        return String.valueOf(k);
    }


    //Foot
    private String foInch(double f) {
        double in = f * 12;
        return String.valueOf(in);
    }

    private String foYard(double f) {
        double y = f / 3;
        return String.valueOf(y);
    }

    private String foMile(double f) {
        double m = f / 5280;
        return String.valueOf(m);
    }

    private String foCM(double f) {
        double c = f * 30.48;
        return String.valueOf(c);
    }

    private String foKM(double f) {
        double k = f / 3281;
        return String.valueOf(k);
    }


    //Yard
    private String YaInch(double y) {
        double in = y * 36;
        return String.valueOf(in);
    }

    private String YaFoot(double y) {
        double f = y * 3;
        return String.valueOf(f);
    }

    private String YaMile(double y) {
        double m = y / 1760;
        return String.valueOf(m);
    }

    private String YaCM(double y) {
        double c = y * 91.44;
        return String.valueOf(c);
    }

    private String YaKM(double y) {
        double k = y / 1094;
        return String.valueOf(k);
    }


    //Mile
    private String miInch(double m) {
        double in = m * 63360;
        return String.valueOf(in);
    }

    private String miFoot(double m) {
        double f = m * 5280;
        return String.valueOf(f);
    }

    private String miYard(double m) {
        double y = m * 1760;
        return String.valueOf(y);
    }

    private String miCM(double m) {
        double c = m * 160900;
        return String.valueOf(c);
    }

    private String miKM(double m) {
        double k = m * 1.609344;
        return String.valueOf(k);
    }


    //CM
    private String cmInch(double c) {
        double in = c / 2.54;
        return String.valueOf(in);
    }

    private String cmFoot(double c) {
        double f = c / 30.48;
        return String.valueOf(f);
    }

    private String cmYard(double c) {
        double y = c / 91.44;
        return String.valueOf(y);
    }

    private String cmmile(double c) {
        double m = c / 160900;
        return String.valueOf(m);
    }

    private String cmKM(double c) {
        double k = c / 100000;
        return String.valueOf(k);
    }


    //KM
    private String kmInch(double k) {
        double in = k * 39370.1;
        return String.valueOf(in);
    }

    private String kmFoot(double k) {
        double f = k * 3280.8;
        return String.valueOf(f);
    }

    private String kmYard(double k) {
        double y = k * 1094;
        return String.valueOf(y);
    }

    private String kmMile(double k) {
        double m = k / 1.609;
        return String.valueOf(m);
    }

    private String kmCM(double k) {
        double c = k * 100000;
        return String.valueOf(c);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);

        convertfromUnit = findViewById(R.id.fromUnit);
        converttoUnit = findViewById(R.id.toUnit);
        convert = findViewById(R.id.convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        textfromUnit = findViewById(R.id.textfromUnit);
        testtoUnit = findViewById(R.id.testtoUnit);

        textfromUnit.setText(values[0]);
        testtoUnit.setText(values[0]);

        editfromUnit = findViewById(R.id.editfromUnit);
        edittoUnit = findViewById(R.id.edittoUnit);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = editfromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    editfromUnit.setError("Please enter some value");
                } else {
                    if (textfromUnit.getText().toString().equals(values[0])) {
                        if (testtoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(tempInput);
                        } else if (testtoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(inFoot(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(inYard(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(inMile(Double.parseDouble(tempInput)));
                        }  else if (testtoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(inCM(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[5])) {
                            edittoUnit.setText(inKM(Double.parseDouble(tempInput)));
                        }

                    } else if (textfromUnit.getText().toString().equals(values[1])) {
                        if (testtoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(foInch(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(tempInput);
                        } else if (testtoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(foYard(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(foMile(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(foCM(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[5])) {
                            edittoUnit.setText(foKM(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[2])) {
                        if (testtoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(YaInch(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(YaFoot(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(tempInput);
                        } else if (testtoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(YaMile(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(YaCM(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[5])) {
                            edittoUnit.setText(YaKM(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[3])) {
                        if (testtoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(miInch(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(miFoot(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(miYard(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(tempInput);
                        } else if (testtoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(miCM(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[5])) {
                            edittoUnit.setText(miKM(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[4])) {
                        if (testtoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(cmInch(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(cmFoot(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(cmYard(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(cmmile(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(tempInput);
                        } else if (testtoUnit.getText().toString().equals(values[5])) {
                            edittoUnit.setText(cmKM(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[5])) {
                        if (testtoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(kmInch(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(kmFoot(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(kmYard(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(kmMile(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(kmCM(Double.parseDouble(tempInput)));
                        } else if (testtoUnit.getText().toString().equals(values[5])) {
                            edittoUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        converttoUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(length_converter.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Inch",
                        "Foot",
                        "Yard",
                        "Mile",
                        "CM", "KM"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                testtoUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

        convertfromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(length_converter.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Inch",
                        "Foot",
                        "Yard",
                        "Mile",
                        "CM", "KM"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                textfromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

    }

}
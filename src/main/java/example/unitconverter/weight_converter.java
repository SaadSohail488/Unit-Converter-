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

public class weight_converter extends AppCompatActivity {

    CardView convertfromUnit, converttoUnit, convert;
    RelativeLayout mCLayout;
    String fromUnit = "Kilogram";
    String toUnit = "Kilogram";
    TextView textfromUnit, texttoUnit;
    EditText editfromUnit, edittoUnit;
    final String[] values = new String[]{
            "Kilogram",
            "Gram",
            "Pound ",
            "Ounce",
            "Ton",
    };

    //Kilogram

    private String kiloGram(double kilo) {
        double gr = kilo * 1000;
        return String.valueOf(gr);
    }

    private String kiloPound(double kilo) {
        double po = kilo * 2.20462;
        return String.valueOf(po);
    }

    private String kiloOunce(double kilo) {
        double ou = kilo * 35.274;
        return String.valueOf(ou);
    }

    private String kiloTon(double kilo) {
        double ton = kilo / 1000;
        return String.valueOf(ton);
    }


    //Gram
    private String grKiloGram(double gr) {
        double kilo = gr * 0.001;
        return String.valueOf(kilo);
    }

    private String grPound(double gr) {
        double po = gr / 453.6;
        return String.valueOf(po);
    }

    private String grOunce(double gr) {
        double ou = gr / 28.35;
        return String.valueOf(ou);
    }

    private String grTon(double gr) {
        double ton = gr / 1000000;
        return String.valueOf(ton);
    }


    //Pound
    private String poKiloGram(double po) {
        double kilo = po * 0.453592;
        return String.valueOf(kilo);
    }

    private String PoGRAM(double po) {
        double gr = po * 453.59237;
        return String.valueOf(gr);
    }

    private String PoOunce(double po) {
        double ou = po * 16;
        return String.valueOf(ou);
    }

    private String PoTon(double po) {
        double ton = po / 2205;
        return String.valueOf(ton);
    }


    //Ounce
    private String OuKiloGram(double ou) {
        double kilo = ou / 35.274;
        return String.valueOf(kilo);
    }

    private String OuGram(double ou) {
        double gr = ou * 28.3495;
        return String.valueOf(gr);
    }

    private String OuPound(double ou) {
        double po = ou / 16;
        return String.valueOf(po);
    }

    private String OuTon(double ou) {
        double ton = ou / 35270;
        return String.valueOf(ton);
    }


    //Ton
    private String TonKiloGram(double t) {
        double kilo = t * 1000;
        return String.valueOf(kilo);
    }

    private String TonGram(double t) {
        double gr = t * 907184.74;
        return String.valueOf(gr);
    }

    private String TonPound(double t) {
        double po = t * 2205;
        return String.valueOf(po);
    }

    private String TonOunce(double t) {
        double ou = t * 35270;
        return String.valueOf(ou);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_converter);

        convertfromUnit = findViewById(R.id.fromUnit);
        converttoUnit = findViewById(R.id.toUnit);
        convert = findViewById(R.id.convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        textfromUnit = findViewById(R.id.textfromUnit);
        texttoUnit = findViewById(R.id.texttoUnit);

        textfromUnit.setText(values[0]);
        texttoUnit.setText(values[0]);

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
                        if (texttoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(tempInput);
                        } else if (texttoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(kiloGram(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(kiloPound(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(kiloOunce(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(kiloTon(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[1])) {
                        if (texttoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(grKiloGram(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(tempInput);
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(grPound(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(grOunce(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(grTon(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[2])) {
                        if (texttoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(poKiloGram(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(PoGRAM(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(tempInput);
                        } else if (texttoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(PoOunce(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(PoTon(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[3])) {
                        if (texttoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(OuKiloGram(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(OuGram(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(OuPound(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(tempInput);
                        } else if (texttoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(OuTon(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[4])) {
                        if (texttoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(TonKiloGram(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(TonGram(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(TonOunce(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[3])) {
                            edittoUnit.setText(TonPound(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[4])) {
                            edittoUnit.setText(tempInput);
                        }
                    }
                }
            }
        });


        converttoUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_converter.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "Pound ",
                        "Ounce",
                        "Ton",

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
                                texttoUnit.setText(toUnit);

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

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_converter.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "Pound ",
                        "Ounce",
                        "Ton",


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
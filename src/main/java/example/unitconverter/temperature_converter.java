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

public class temperature_converter extends AppCompatActivity {

    CardView convertfromUnit, converttoUnit, convert;
    RelativeLayout mCLayout;
    String fromUnit = "Celcius";
    String toUnit = "Farenheit";
    TextView textfromUnit, texttoUnit;
    EditText editfromUnit, edittoUnit;
    final String[] values = new String[]{
            "Celcius",
            "Fahrenheit",
            "Kelvin",

    };

    //celcius
    private String celKelvin(double cel) {
        double kel = cel + 273.15;
        return String.valueOf(kel);
    }

    private String celFarenheit(double cel) {
        double fah = (cel * 9 / 5) + 32;
        return String.valueOf(fah);
    }

    //fahrenheit
    private String fahKelvin(double fah) {
        double kel = 273.5 + ((fah - 32.0) * (5.0 / 9.0));
        return String.valueOf(kel);
    }

    private String fahCelcius(double fah) {
        double cel = (fah - 32) * 5 / 9;
        return String.valueOf(cel);
    }

    //Kelvin


    private String kelCelcius(double kel) {
        double cel = kel - 273.15;
        return String.valueOf(cel);
    }

    private String kelFahrenheit(double kel) {
        double fah = (kel - 273.15) * 1.8 + 32;
        return String.valueOf(fah);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

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
                            edittoUnit.setText(celFarenheit(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(celKelvin(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[1])) {
                        if (texttoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(fahCelcius(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(tempInput);
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(fahKelvin(Double.parseDouble(tempInput)));
                        }
                    } else if (textfromUnit.getText().toString().equals(values[2])) {
                        if (texttoUnit.getText().toString().equals(values[0])) {
                            edittoUnit.setText(kelCelcius(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[1])) {
                            edittoUnit.setText(kelFahrenheit(Double.parseDouble(tempInput)));
                        } else if (texttoUnit.getText().toString().equals(values[2])) {
                            edittoUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        converttoUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(temperature_converter.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Celcius",
                        "Fahrenheit",
                        "Kelvin",
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(temperature_converter.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Celcius",
                        "Fahrenheit",
                        "Kelvin",

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
package com.example.user.grafic;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;

public class MainActivity extends AppCompatActivity {

//    LineGraphSeries lineGraphSeries;
    private SensorManager mSensorManger;
    Sensor sensor;
    GraphView graph;
    private double graph2LastXValue = 5d;
    private double graph2LastYValue = 5d;
    private double graph2LastZValue = 5d;
    private Double[] dataPoints;
    LineGraphSeries<DataPoint> series;
    LineGraphSeries<DataPoint> seriesX;
    LineGraphSeries<DataPoint> seriesZ;
    LineGraphSeries<DataPoint> seriesXX;
    LineGraphSeries<DataPoint> seriesYY;
    LineGraphSeries<DataPoint> seriesZZ;
    private Thread thread;
    private boolean plotData = true;
    float xx;
    float yy;
    float zz;

    private float On_1 = 1;
    private float altha = 0.1f;
Spinner spinner;
    String [] acxios={"Ускорение по оси Х","Ускорение по оси Y", "Ускорение по оси Z "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=  findViewById(R.id.spinner);
        mSensorManger=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, acxios);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)parent.getItemAtPosition(position);
//                System.out.println(position +"!!!!!!!!!!!!!!!!");
//                System.out.println(id);
                switch ((int) id){
                    case 0: System.out.println("x");
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Ускорение по оси ОХ!", Toast.LENGTH_SHORT);
                        toast.show();
                        break;
                    case 1: System.out.println("y");
                        Toast toasts = Toast.makeText(getApplicationContext(),
                                "Ускорение по оси ОY!", Toast.LENGTH_SHORT);
                        toasts.show();
                        break;
                    case 2: System.out.println("z");
                        Toast toastss = Toast.makeText(getApplicationContext(),
                                "Ускорение по оси ОZ!", Toast.LENGTH_SHORT);
                        toastss.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
    }
}


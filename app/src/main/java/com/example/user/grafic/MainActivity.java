package com.example.user.grafic;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//     2 график/*************
//        GraphView line_graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        line_graph.addSeries(series);
//        series.setOnDataPointTapListener(new OnDataPointTapListener() {
//            @Override
//            public void onTap(Series series, DataPointInterface dataPoint) {
//                Toast.makeText(MainActivity.this, "Series: On Data Point clicked: &quot; + dataPoint",  Toast.LENGTH_SHORT);
//
//            }
//        });
//    }
//    }************************************


//      *************************  1график
//        GraphView graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        graph.addSeries(series);
//********************************3 график
//       GraphView line_graph = (GraphView) findViewById(R.id.graph);
//       LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
//               new DataPoint(0, 1),
//                new DataPoint(1, 5),
//               new DataPoint(2, 3),
//                new DataPoint(3, 2),
//               new DataPoint(4, 6)
//       });
//        line_graph.addSeries(series);
//       series.setThickness(20);
//        series.setOnDataPointTapListener(new OnDataPointTapListener() {
//            @Override
//           public void onTap(Series series, DataPointInterface dataPoint) {
//               Toast.makeText(MainActivity.this, "Series: On Data Point clicked: &quot; + dataPoint",  Toast.LENGTH_SHORT);
//
//          }
//        });
//    }
//   }
//   3 график************************************

//    GraphView line_graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
//        new DataPoint(0, 1),
//        new DataPoint(1, 5),
//        new DataPoint(2, 3),
//        new DataPoint(3, 2),
//        new DataPoint(4, 6) });
//        line_graph.addSeries(series);
//        series.setDrawBackground(true); // activate the background feature<br />
//        series.setBackgroundColor(Color.BLUE); // below the line fill with color<br />
//        series.setOnDataPointTapListener(new OnDataPointTapListener() {
//        @Override
//            public void onTap(Series series, DataPointInterface dataPoint) {
//        Toast.makeText(MainActivity.this, "Series: On Data Point clicked: &quot; + dataPoint",  Toast.LENGTH_SHORT);
//        }
//        });
//        }
//        }

        //4 график ********************************
//        GraphView line_graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        line_graph.addSeries(series);
//        series.setDrawDataPoints(true);
//        series.setDataPointsRadius(10);
//        series.setOnDataPointTapListener(new OnDataPointTapListener() {
//            @Override
//            public void onTap(Series series, DataPointInterface dataPoint) {
//                Toast.makeText(MainActivity.this, "Series: On Data Point clicked:" +dataPoint, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}

///*********5 график***************************************//


//        GraphView line_graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        line_graph.addSeries(series);
//        // custom paint to make a dotted line<br />
//        Paint paint = new Paint();
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(10);
//        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
//        series.setCustomPaint(paint);
//        series.setOnDataPointTapListener(new OnDataPointTapListener() {
//            @Override
//            public void onTap(Series series, DataPointInterface dataPoint) {
//                Toast.makeText(MainActivity.this, "Series: On Data Point clicked:" + dataPoint, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}


////////////// 6 график************************

//        GraphView line_graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        line_graph.addSeries(series);
//        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(line_graph);
//        staticLabelsFormatter.setHorizontalLabels(new String[]{"Jan", "Feb", "March"});
//        staticLabelsFormatter.setVerticalLabels(new String[]{"Sun", "Mon","Tue"});
//        line_graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);
//        series.setOnDataPointTapListener(new OnDataPointTapListener() {
//            @Override
//            public void onTap(Series series, DataPointInterface dataPoint) {
//                Toast.makeText(MainActivity.this, "Series:On Data Point clicked:" +dataPoint, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}


/////////////////////7 график////************* 3.5.1.6
//        GraphView line_graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        line_graph.addSeries(series);
//        line_graph.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter() {
//            @Override
//            public String formatLabel(double value, boolean isValueX) {
//                if (isValueX) {
//                    // show normal x values<br />
//                    return super.formatLabel(value, isValueX);
//                } else {
//                    // show currency for y values<br />
//                    return super.formatLabel(value, isValueX) + "&";
//                }
//            }
//        });
//        series.setOnDataPointTapListener(new OnDataPointTapListener() {
//            @Override
//            public void onTap(Series series, DataPointInterface dataPoint) {
//                Toast.makeText(MainActivity.this, "Series:On Data Point clicked:" +dataPoint, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//    }


//3.5.1.7
        GraphView line_graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        line_graph.addSeries(series);
        // set manual X bounds<br />
        line_graph.getViewport().setXAxisBoundsManual(true);
        line_graph.getViewport().setMinX(0.5); // set the min value of the viewport of x axis<br />
        line_graph.getViewport().setMaxX(3.5); // set the max value of the viewport of x-axix</p>
        // set manual Y bounds<br />
        line_graph.getViewport().setYAxisBoundsManual(true);
        line_graph.getViewport().setMinY(0.5);  // set the min value of the viewport of y axis<br />
        line_graph.getViewport().setMaxY(8);    // set the max value of the viewport of y-axis<br />
        line_graph.getViewport().setScrollable(true);
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(MainActivity.this, "Series:On Data Point clicked:" + dataPoint, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
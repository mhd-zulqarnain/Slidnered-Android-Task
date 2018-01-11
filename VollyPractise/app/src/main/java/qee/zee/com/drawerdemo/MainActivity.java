package qee.zee.com.drawerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    StringRequest request;
    RequestQueue requestQueue;
    ImageView imgView;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.test_View);
        imgView = (ImageView) findViewById(R.id.std_img);
        requestQueue = VolleySingleton.getsInstance().getmRequestQueue();

        sendJsonRequest();
    }

    private void sendJsonRequest() {
        request = new StringRequest(Request.Method.GET, "https://api.myjson.com/bins/a3jmh", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                parseJSONResponse(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Messege.messege(getApplicationContext(), "failure " + error);

            }
        });

        requestQueue.add(request);
    }


    public void parseJSONResponse(String json) {

        Student students[] = new Gson().fromJson(json, Student[].class);
        Messege.messege(this, students[0].first_name);
        tv.setText(students[0].first_name);
        VolleySingleton.getsInstance().getImageLoader().get(students[0].img_url, new ImageLoader.ImageListener() {
            @Override
            public void onResponse(ImageLoader.ImageContainer response, boolean isImmediate) {
                imgView.setImageBitmap(response.getBitmap());
            }

            @Override
            public void onErrorResponse(VolleyError error) {
                Messege.messege(getApplicationContext(),"error");
            }
        });

    }

}

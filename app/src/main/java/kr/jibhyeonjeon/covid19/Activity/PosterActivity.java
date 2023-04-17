package kr.jibhyeonjeon.covid19.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import kr.jibhyeonjeon.covid19.Common.ButtonChangeActivity;
import kr.jibhyeonjeon.covid19.Poster.Poster;
import kr.jibhyeonjeon.covid19.R;

public class PosterActivity extends Activity {

    Poster cPoster;
    ButtonChangeActivity cButtonChangeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poster_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cButtonChangeActivity = new ButtonChangeActivity(this);
        cPoster = new Poster(this);

    }

    public void OnClick(View view) {
        cButtonChangeActivity.setButtonChangeActivity(view);
    }

}

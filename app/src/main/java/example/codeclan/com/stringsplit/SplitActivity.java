package example.codeclan.com.stringsplit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SplitActivity extends AppCompatActivity {

    EditText wordsEditText;
    Button runButton;
    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split);
        wordsEditText = (EditText) findViewById(R.id.words_edittext);
        runButton = (Button) findViewById(R.id.run_btn);
        countText = (TextView) findViewById(R.id.count_text);
    }

    public void onRunButtonClicked(View button) {
        StringSplitter splitter = new StringSplitter();
        int gotWords = splitter.countWords();
        countText.setText(gotWords);
    }
}
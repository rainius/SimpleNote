package com.example.simplenote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class NoteListActivity extends Activity implements OnClickListener {
	
	private Button mTmpNewButton;
	private Button mTmpReadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        
        mTmpNewButton = (Button) findViewById(R.id.tmp_new);
        mTmpNewButton.setOnClickListener(this);
        mTmpReadButton = (Button) findViewById(R.id.tmp_read);
        mTmpReadButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.tmp_new:
			EditNoteActivity.actionStartEditNoteActivity(this);
			break;
		case R.id.tmp_read:
			startActivity(ReadNoteActivity.class);
			break;
		}
	}
	
	private void startActivity(Class activityClass) {
		Intent intent = new Intent(this, activityClass);
		startActivity(intent);
	}
}

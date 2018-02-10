package com.example.simplenote;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class EditNoteActivity extends Activity {
	
	public static void actionStartEditNoteActivity(Context context) {
		Intent intent = new Intent(context, EditNoteActivity.class);
		context.startActivity(intent);
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
    }

    private void onFinishNote() {
    	Toast.makeText(this, R.string.note_saved,  Toast.LENGTH_SHORT).show();
    	finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_finish_note) {
        	onFinishNote();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.keskin.notepad;
import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;

public class settings extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		SharedPreferences read = getSharedPreferences("theme",MODE_PRIVATE);
		int theme = read.getInt("theme",0);
		if (theme == 0){
			setTheme(R.style.darkdialog);
		}
		if (theme == 1){
			setTheme(R.style.darkdialog);
		}
		if (theme == 2){
			setTheme(R.style.holodarkdialog);
		}
		if (theme == 3){
			setTheme(R.style.holodarkdialog);
		}
		if (theme == 4){
			setTheme(R.style.materialdarkdialog);
		}
		if (theme == 5){
			setTheme(R.style.materialdarkdialog);
		}
		setContentView(R.layout.settings);
	}
	public void dark(View view){
		SharedPreferences.Editor edit = getSharedPreferences("theme",MODE_PRIVATE).edit();
		edit.putInt("theme",1);
		edit.commit();
		reload();
	}
	public void light(View view){
		SharedPreferences.Editor edit = getSharedPreferences("theme",MODE_PRIVATE).edit();
		edit.putInt("theme",0);
		edit.commit();
		reload();
	}
	public void hololight(View view){
		SharedPreferences.Editor edit = getSharedPreferences("theme",MODE_PRIVATE).edit();
		edit.putInt("theme",2);
		edit.commit();
	    reload();
	}
	public void holodark(View view){
		SharedPreferences.Editor edit = getSharedPreferences("theme",MODE_PRIVATE).edit();
		edit.putInt("theme",3);
		edit.commit();
		reload();
	}
	public void materialdark(View view){
		SharedPreferences.Editor edit = getSharedPreferences("theme",MODE_PRIVATE).edit();
		edit.putInt("theme",5);
		edit.commit();
		reload();
	}
	public void materiallight(View view){
		SharedPreferences.Editor edit = getSharedPreferences("theme",MODE_PRIVATE).edit();
		edit.putInt("theme",4);
		edit.commit();
		reload();
	}
	public void reload() {
		Intent intent = getIntent();
		overridePendingTransition(0, 0);
		intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		finish();
		overridePendingTransition(0, 0);
		startActivity(intent);
	}
}

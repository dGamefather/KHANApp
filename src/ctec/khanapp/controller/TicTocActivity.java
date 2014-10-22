package ctec.khanapp.controller;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import android.app.Activity;
import android.os.*;
import android.view.*;
import android.widget.*;

public class TicTocActivity extends Activity
{
	private Button startDoom;
	private TextView randomTimer;
	private TextView appText;
	private ArrayList<Integer> textList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tic_toc);
		
		startDoom = (Button) findViewById(R.id.fuseBob);
		
		randomTimer = (TextView) findViewById(R.id.someTimer);
		randomTimer.setText("10");
		appText = (TextView) findViewById(R.id.someText);
		
		textList = new ArrayList<Integer>();
		
		blankTexting();
		heyListen();
	}
	
	private void blankTexting()
	{
		textList.add(R.string.hello_world);
		textList.add(R.string.goodbye_world);
	}
	
	private void heyListen()
	{
		
	}
	
	public class CounterClass extends CountDownTimer
	{

		public CounterClass(long millisInFuture, long countDownInterval)
		{
			super(millisInFuture, countDownInterval);
			// TODO Auto-generated constructor stub
			String ms = String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(millisInFuture),
					TimeUnit.MILLISECONDS.toSeconds(millisInFuture) - TimeUnit.SECONDS.toMinutes(TimeUnit.MILLISECONDS.toMinutes(millisInFuture)));
			System.out.println(ms);
			randomTimer.setText(ms);
		}

		@Override
		public void onTick(long millisUntilFinished)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFinish()
		{
			// TODO Auto-generated method stub
			appText.setText(R.string.goodbye_world);
			System.exit(0);
		}
				
	}
}

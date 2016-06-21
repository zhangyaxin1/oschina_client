package com.example.day1_1_hellowrold;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
 
/*
 * Activity:活动,可以理解成一个窗口界面
 * onCreate():用于创建activity的界面内容
 */
public class MainActivity extends Activity {
   
	/*
	 *  Bundle:用于存储参数,功能相当于Map
	 *  setContentView():加载界面内容布局文件
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);
	}
}





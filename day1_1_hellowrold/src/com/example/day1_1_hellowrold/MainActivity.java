package com.example.day1_1_hellowrold;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
 
/*
 * Activity:�,��������һ�����ڽ���
 * onCreate():���ڴ���activity�Ľ�������
 */
public class MainActivity extends Activity {
   
	/*
	 *  Bundle:���ڴ洢����,�����൱��Map
	 *  setContentView():���ؽ������ݲ����ļ�
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);
	}
}





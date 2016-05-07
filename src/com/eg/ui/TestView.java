package com.eg.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class TestView extends View {
	
	private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
	
	private int backgroundColor = Color.TRANSPARENT;
	private int tintStartColor = Color.TRANSPARENT;
	private int tintEndColor = Color.argb(0x66, 0xFF, 0xFF, 0xFF);
	private float paddingTopPercent = 0.3f;

	public TestView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Rect rect = canvas.getClipBounds();
		mPaint.setStyle(Paint.Style.FILL);
		mPaint.setShader(null);
		canvas.drawColor(backgroundColor);
		
		// 画椭圆的一部分
		Path path = new Path();
		path.moveTo(rect.right, rect.bottom);
		path.lineTo(rect.left, rect.bottom);
		
		//计算曲线
		float h = rect.height();
		float b = h * (1.0f - paddingTopPercent);
		float w = rect.width();
		float a = w * 0.5f;
		for (float x = -a; x <= a; x+=1) {
			float y = b * (float)Math.sqrt(1.0f - Math.pow(x*(1.0f/a), 2));
			System.out.println("x="+x+" , y="+y);
			path.lineTo(x+a, h - y);
		}
		path.lineTo(rect.right, rect.bottom);
		path.close();
		// 渐变
		LinearGradient linearGradient = new LinearGradient(a, h - b, a, rect.bottom , tintStartColor, tintEndColor, Shader.TileMode.CLAMP);
		mPaint.setShader(linearGradient);	
		canvas.drawPath(path, mPaint);
	}

}

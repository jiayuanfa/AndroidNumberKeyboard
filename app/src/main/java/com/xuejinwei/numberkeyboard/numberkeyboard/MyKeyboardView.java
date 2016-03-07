package com.xuejinwei.numberkeyboard.numberkeyboard;

import android.content.Context;
import android.graphics.Canvas;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

/**
 * Created by xuejinwei on 16/3/5.
 */
public class MyKeyboardView extends KeyboardView {
    Context context;
    private Keyboard     mKeyboardNumber;//数字键盘


    public MyKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.mKeyboardNumber = new Keyboard(context, R.xml.keyboardnumber);
        setKeyboard(mKeyboardNumber);
    }

    public MyKeyboardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Keyboard keyboard = getKeyboard();
//        if (keyboard != null) {
//            List<Keyboard.Key> keys = keyboard.getKeys();
//            for (Keyboard.Key key : keys) {
//                if (key.codes[0] == -3) {
//                    Log.e("KEY", "Drawing key with code " + key.codes[0]);
//                    Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.bg_keyboardview_blue);
//                    dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//                    dr.draw(canvas);
//
//                } else {
//                    Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.bg_keyboardview);
//                    dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//                    dr.draw(canvas);
//                }
//            }
//        }
    }
}

package com.pshycotech.awesomeedittext;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AwesomeEditText extends LinearLayout {

    private Context context;
    private TextInputLayout textInputLayout;
    private TextInputEditText textInputEditText;
    private String hintText;
    private String errorText;
    private String text;

    public AwesomeEditText(Context context) {
        super(context);
        this.context = context;
    }

    public AwesomeEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public AwesomeEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.START);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.awesome_edit_text, this, true);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AwesomeEditText,
                0, 0);

        try {
            text = a.getString(R.styleable.AwesomeEditText_text);
            hintText = a.getString(R.styleable.AwesomeEditText_hintText);
            errorText = a.getString(R.styleable.AwesomeEditText_errorText);
        } finally {
            a.recycle();
        }

        textInputLayout = findViewById(R.id.textInputLayout);
        textInputEditText = findViewById(R.id.textInputEditText);

        textInputEditText.setText(text);
        textInputLayout.setHint(hintText);
        textInputLayout.setError(errorText);
    }

    public void setError(String error) {
        textInputLayout.setError(error);
    }

    public void setErrorEnabled(boolean error) {
        textInputLayout.setErrorEnabled(error);
    }

    public void setHint(String text) {
        textInputLayout.setHint(text);
    }

    public void setKeyListener(KeyListener input) {
        textInputEditText.setKeyListener(input);
    }

    public void addTextChangedListener(TextWatcher watcher) {
        textInputEditText.addTextChangedListener(watcher);
    }

    public void setText(CharSequence text) {
        textInputEditText.setText(text);
    }

    public void setText(String text) {
        textInputEditText.setText(text);
    }

    public void setTextColor(ColorStateList colors) {
        textInputEditText.setTextColor(colors);
    }

    public void setTextColor(int color) {
        textInputEditText.setTextColor(color);
    }

    public Editable getText() {
        return textInputEditText.getText();
    }

    public void setTextSize(float size) {
        textInputEditText.setTextSize(size);
    }

    public void setTextSize(int unit, float size) {
        textInputEditText.setTextSize(unit, size);
    }

    public void setTypeface(Typeface tf, int style) {
        textInputEditText.setTypeface(tf, style);
    }

    public void setTypeface(Typeface tf) {
        textInputEditText.setTypeface(tf);
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        textInputEditText.setOnClickListener(l);
        super.setOnClickListener(l);
    }
}

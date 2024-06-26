package com.trtc.uikit.livekit.liveroom.view.audience.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.trtc.uikit.livekit.R;

public class GiftButton extends FrameLayout {

    public GiftButton(Context context) {
        this(context, null);
    }

    public GiftButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.livekit_gift_extension_view, this);
    }
}

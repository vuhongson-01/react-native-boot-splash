package com.zoontek.rnbootsplash;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;

public class RNBootSplash {

  public static void init(final @DrawableRes int drawableResId,
                          final @AnimRes int animResId, 
                          @NonNull final Activity activity, 
                          Context context, 
                          final @DrawableRes int bgrDrawableResId) {
    RNBootSplashModule.init(drawableResId, animResId, activity, context, bgrDrawableResId);
  }
}

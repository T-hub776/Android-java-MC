package com.custom.launcher;

import android.view.KeyEvent;

public class ControllerMapper {
    // Standard PC LWJGL scan codes mapping
    public static final int PC_KEY_SPACE = 57;
    public static final int PC_KEY_LSHIFT = 42;
    public static final int PC_MOUSE_LEFT = -100;

    public static int getMinecraftKey(int androidKeyCode) {
        switch (androidKeyCode) {
            case KeyEvent.KEYCODE_BUTTON_A:
                return PC_KEY_SPACE;  // Map A Button to Jump
            case KeyEvent.KEYCODE_BUTTON_X:
                return PC_KEY_LSHIFT; // Map X Button to Sneak
            case KeyEvent.KEYCODE_BUTTON_R1:
                return PC_MOUSE_LEFT; // Map Right Bumper to Attack/Break
            default:
                return -1;
        }
    }
}

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://android.com"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#111111">

    <!-- The native rendering window container for Minecraft goes here -->
    <FrameLayout
        android:id="@+id/render_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

    <!-- Overlaid Launch Config Bar -->
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:orientation="vertical">

        <Button
            android:id="@+id/btn_launch"
            android:layout_width="250dp"
            android:layout_height="60dp"
            android:text="LAUNCH MINECRAFT 26.2"
            android:textSize="18sp"
            android:background="#3c8527"
            android:textColor="#FFFFFF" />
    </LinearLayout>

</RelativeLayout>
  

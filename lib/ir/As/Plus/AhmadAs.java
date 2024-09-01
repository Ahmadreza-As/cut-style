package ir.As.Plus;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

public class AhmadAs extends FrameLayout {
    private float cutValue = 20.0f;
    private int frameColor = -65536;

    public AhmadAs(Context context) {
        super(context);
        init();
    }

    public AhmadAs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        updateShape();
    }

    private void updateShape() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().toBuilder().setAllCorners(1, this.cutValue).build());
        materialShapeDrawable.setTint(this.frameColor);
        setBackground(materialShapeDrawable);
        setClipToOutline(true);
    }

    public void setCut(float f) {
        this.cutValue = f;
        updateShape();
    }

    public void setFrameColor(int i) {
        this.frameColor = i;
        updateShape();
    }
}
package cc.stargroup.xiaodai.character;

import android.content.Context;
import android.graphics.Canvas;

/**
 * Created by Foam on 2017/1/10.
 */

public class CharacterFace {

    private CharacterType characterType;
    public CharacterEmotion emotion;
    public CharacterExpression expression;
    private float pupilDilation;
    private float rotation;

    private boolean emoting;
    private boolean expressing;

    private CharacterEye leftEye;
    private CharacterEye rightEye;

    public CharacterFace(Context context, CharacterType characterType) {
        this.characterType = characterType;
        this.leftEye = new CharacterEye(context, true);
        this.rightEye = new CharacterEye(context, false);

        String imageNamed = String.format("Romo_Emotion_%d.png", CharacterEmotion.Happy.getValue());
    }

    public void setRotation(float rotation) {
        boolean shouldAnimate = false;
        if (Math.abs(this.rotation - rotation) > 3) {
            shouldAnimate = true;
        }
        this.rotation = rotation;
    }

    public void lookAtPoint(Point3D point, boolean animated) {

    }

    public void lookAtDefault() {

    }

    public void blink() {

    }

    public void doubleBlink() {

    }

    public void drawSelf(Canvas canvas) {


    }
}
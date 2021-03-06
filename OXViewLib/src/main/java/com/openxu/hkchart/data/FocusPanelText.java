package com.openxu.hkchart.data;


/**
 * Author: openXu
 * Time: 2020/11/11 15:56
 * class: FocusPanelText
 * Description: (共用)焦点文字设置
 */
public class FocusPanelText {
    public boolean show;
    public int textSize;   //设置坐标文字大小
    public int textColor;  //设置坐标文字颜色
    public String text;
    public FocusPanelText(boolean show, int textSize, int textColor, String text) {
        this.show = show;
        this.textSize = textSize;
        this.textColor = textColor;
        this.text = text;
    }
}

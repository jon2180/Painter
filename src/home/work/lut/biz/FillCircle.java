package home.work.lut.biz;

import home.work.lut.entity.Shape;

import java.awt.*;

/**
 * 定义一个fillCircle类，继承Shape类，用于绘制一个填充实心圆
 *
 * @author gm
 */
public class FillCircle extends Shape {
    private static final long serialVersionUID = 1L;

    public void draw(Graphics2D g2d) {
        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(width));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)),
                Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)));
    }
}

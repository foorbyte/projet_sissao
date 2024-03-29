/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//https://stackoverflow.com/questions/26702519/javafx-line-curve-with-arrow-head
//https://www.google.com/search?rls=en&q=javafx+create+arrow&tbm=isch&source=univ&client=safari&sa=X&ved=2ahUKEwi166vmgbfgAhXC8uAKHY0iBJQQsAR6BAgFEAE&biw=1280&bih=737#imgrc=K3G3rjNvWST3lM:
package javafxapplication1.controlleurs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author freexx
 */
public class FXML_SharpeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Group root = new Group();

    // bending curve
    Rectangle srcRect1 = new Rectangle(100,100,50,50);
    Rectangle dstRect1 = new Rectangle(300,300,50,50);
    
    CubicCurve curve1 = new CubicCurve( 125, 150, 125, 225, 325, 225, 325, 300);
    curve1.setStroke(Color.BLACK);
    curve1.setStrokeWidth(1);
    curve1.setFill( null);

    double size=Math.max(curve1.getBoundsInLocal().getWidth(),
                         curve1.getBoundsInLocal().getHeight());
    double scale=size/4d;

    Point2D ori=eval(curve1,0);
    Point2D tan=evalDt(curve1,0).normalize().multiply(scale);
    Path arrowIni=new Path();
    arrowIni.getElements().add(new MoveTo(ori.getX()+0.2*tan.getX()-0.2*tan.getY(),
                                        ori.getY()+0.2*tan.getY()+0.2*tan.getX()));
    arrowIni.getElements().add(new LineTo(ori.getX(), ori.getY()));
    arrowIni.getElements().add(new LineTo(ori.getX()+0.2*tan.getX()+0.2*tan.getY(),
                                        ori.getY()+0.2*tan.getY()-0.2*tan.getX()));

    ori=eval(curve1,1);
    tan=evalDt(curve1,1).normalize().multiply(scale);
    Path arrowEnd=new Path();
    arrowEnd.getElements().add(new MoveTo(ori.getX()-0.2*tan.getX()-0.2*tan.getY(),
                                        ori.getY()-0.2*tan.getY()+0.2*tan.getX()));
    arrowEnd.getElements().add(new LineTo(ori.getX(), ori.getY()));
    arrowEnd.getElements().add(new LineTo(ori.getX()-0.2*tan.getX()+0.2*tan.getY(),
                                        ori.getY()-0.2*tan.getY()-0.2*tan.getX()));

    
    root.getChildren().addAll(srcRect1, dstRect1, curve1, arrowIni, arrowEnd);

//   primaryStage.setScene(new Scene(root, 800, 600));
  //  primaryStage.show();
    }    
    
    /**
 * Evaluate the cubic curve at a parameter 0<=t<=1, returns a Point2D
 * @param c the CubicCurve 
 * @param t param between 0 and 1
 * @return a Point2D 
 */
private Point2D eval(CubicCurve c, float t){
    Point2D p=new Point2D(Math.pow(1-t,3)*c.getStartX()+
            3*t*Math.pow(1-t,2)*c.getControlX1()+
            3*(1-t)*t*t*c.getControlX2()+
            Math.pow(t, 3)*c.getEndX(),
            Math.pow(1-t,3)*c.getStartY()+
            3*t*Math.pow(1-t, 2)*c.getControlY1()+
            3*(1-t)*t*t*c.getControlY2()+
            Math.pow(t, 3)*c.getEndY());
    return p;
}

/**
 * Evaluate the tangent of the cubic curve at a parameter 0<=t<=1, returns a Point2D
 * @param c the CubicCurve 
 * @param t param between 0 and 1
 * @return a Point2D 
 */
private Point2D evalDt(CubicCurve c, float t){
    Point2D p=new Point2D(-3*Math.pow(1-t,2)*c.getStartX()+
            3*(Math.pow(1-t, 2)-2*t*(1-t))*c.getControlX1()+
            3*((1-t)*2*t-t*t)*c.getControlX2()+
            3*Math.pow(t, 2)*c.getEndX(),
            -3*Math.pow(1-t,2)*c.getStartY()+
            3*(Math.pow(1-t, 2)-2*t*(1-t))*c.getControlY1()+
            3*((1-t)*2*t-t*t)*c.getControlY2()+
            3*Math.pow(t, 2)*c.getEndY());
    return p;
}
    
}

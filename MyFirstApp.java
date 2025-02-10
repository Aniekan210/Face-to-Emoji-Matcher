import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class MyFirstApp
{
    public static void main(String[] args)
    {
        System.load("C:\\Users\\virgo\\opencv\\build\\java\\x64\\opencv_java4100.dll");
        Mat mat = Mat.eye(3,3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
    }
}

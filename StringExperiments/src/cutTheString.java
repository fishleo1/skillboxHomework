import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cutTheString {
    public static void main(String[] args) {
        int count = 0;
        String text = "The breakthrough LiDAR Scanner enables capabilities never before possible on any mobile device. The LiDAR Scanner measures the distance to surrounding objects up to 5 meters away, works both indoors and outdoors, and operates at the photon level at nano-second speeds. New depth frameworks in iPadOS combine depth points measured by the LiDAR Scanner, data from both cameras and motion sensors, and is enhanced by computer vision algorithms on the A12Z Bionic for a more detailed understanding of a scene. The tight integration of these elements enables a whole new class of AR experiences on iPad Pro.\n" +
                "Every existing ARKit app automatically gets instant AR placement, improved motion capture and people occlusion. Using the latest update to ARKit with a new Scene Geometry API, developers can harness the power of the new LiDAR Scanner to unleash scenarios never before possible.\n" +
                "The LiDAR Scanner improves the Measure app, making it faster and easier to automatically calculate someone’s height, while helpful vertical and edge guides automatically appear to let users more quickly and accurately measure objects. The Measure app also now comes with Ruler View for more granular measurements and allows users to save a list of all measurements, complete with screenshots for future use.";
        Pattern p = Pattern.compile("\\b[a-zA-Z0-9]+.\\s\\b");
        Matcher m = p.matcher(text);

        while (m.find()){
            count++;
            System.out.println("Word " + count + " " + m.group());
        }
    }
}


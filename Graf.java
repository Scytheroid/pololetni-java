import java.util.*;
import java.io.FileWriter;
import java.io.File;

public class Graf {

    // Rectangle parameters
    final static int MARGIN = 10;                  // Space between edge of a picture and objects in it
    final static int KERNING = 5;                  // Space between columns
    final static int WIDTH = 30;                   // Width of one column
    final static int HEIGHT = 200;                 // Max height of one column
    final static int TOTAL_HEIGHT = HEIGHT + 20;   // Canvas height
    static int TOTAL_WIDTH;                        // Canvas width
    final static String COLOR = "orange";    // Fill color
    final static String STROKE = "black";    // Color on the edge
    final static int STROKE_WIDTH = 2;

    public static void main(String[] args) {
        if (args.length <= 0){
            System.out.println("No input entered");
            System.exit(0);
        }
        TOTAL_WIDTH = (WIDTH + KERNING)*(args.length) - KERNING + 20;

        // Input processing
        int prevSize = 0;
        List<Integer> graphData = new ArrayList<>();
        for (String raw_size : args) {         // Checking if there are any values too big for graph
            int size = Integer.parseInt(raw_size);
            graphData.add(size);
            if (size > prevSize){
                prevSize = size;
            }
        }

        if (prevSize > HEIGHT) {
            double coefficient = HEIGHT / (double) prevSize;
            // Scaling graphData down
            for (int i = 0; i < graphData.size(); i++) {
                graphData.set( i, (int) java.lang.Math.round(graphData.get(i) * coefficient));
            }
        }

        output(graphData);
    }

    public static void output(List<Integer> graphData) {
        System.out.println("<?xml version=\"1.0\"?>\n");
        System.out.printf("<svg xmlns=\"http://www.w3.org/2000/svg\"\n");               // Beginning of svg header
        System.out.printf("\twidth=\"%d\" height=\"%d\"\n", TOTAL_WIDTH, TOTAL_HEIGHT);
        System.out.printf("\tviewBox=\"0 0 %d %d\">\n", TOTAL_WIDTH, TOTAL_HEIGHT);       // Ending of svg header
        for (int i = 0; i < graphData.size(); i++) {
            System.out.printf("\t<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\"\n",
                    MARGIN + i * (WIDTH + KERNING), MARGIN + HEIGHT - graphData.get(i), WIDTH, graphData.get(i));
            System.out.printf("\t\tfill=\"%s\" stroke=\"%s\" stroke-width=\"%d\"/>\n", COLOR, STROKE, STROKE_WIDTH);
        }
        System.out.print("</svg>\n");
    }

}
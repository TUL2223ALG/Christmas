package christmas.s;

import java.util.Scanner;

public class ChristmasTauchmanDenis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velikost: ");
        int scale = sc.nextInt();
        System.out.print("Počet koulí: ");
        int n_spheres = sc.nextInt();
        System.out.print("Distribuce knoflíků: ");
        int knob_dist = sc.nextInt();
        create_head(scale);
        for(int i=0; i<n_spheres; i++) {
            create_sphere(scale, '–', n_spheres-i-1, knob_dist);
        }
    }
    static void create_sphere(int radius, char symbol, int offset, int knob_dist){
        int diameter = radius*2;
        for(int x=0; x<=diameter; x++) {
            if(x<diameter-offset+1)
            {
                for (int y=0; y<=diameter; y++) {
                    double distance = Math.sqrt(Math.pow((x-radius),2)+Math.pow((y-radius),2));
                    if (distance > radius - 0.5 && distance < radius + 0.5) {
                        System.out.print(symbol);
                    } else if (x%knob_dist==0 && y==radius) {
                        System.out.print("#");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    static void create_head(int radius){
        int face_width = radius + 1;
        int face_height = radius - 1;
        int width = radius*2+1;
        double face_offset = Math.ceil((2*radius-face_width)/2);
        for(int i=0; i<width; i++) {
            if (i > face_offset && i < face_offset + face_width + 2) {
                System.out.print("_");
            } else System.out.print(" ");
        }
        System.out.println();
        for(int x=0; x<face_height; x++){
            for(int y=0; y<width; y++) {
                if (y == face_offset + 1 || y == face_offset + face_width + 1) {
                    System.out.print("|");
                }
                else if(x==1 && (y==face_offset+Math.ceil(face_width/2)+1 ||
                        y==face_offset+Math.ceil(face_width/2)+3)){
                    System.out.print("X");
                } else if (x==face_height-1 && (y>=face_offset+Math.ceil(face_width/2)+1 &&
                        y<=face_offset+Math.ceil(face_width/2)+3)) {
                    System.out.print("~");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
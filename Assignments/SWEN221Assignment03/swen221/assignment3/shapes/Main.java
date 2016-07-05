package swen221.assignment3.shapes;


public class Main {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter(
                // shapes
//                "x = [0,0,450,450]\ndraw x #010101\nz=[60,60,130,130]\nfill z #f1d3f3\n" + 
//                "z=[60,260,130,130]\nfill z #2a6f1f\nx = [50,50,150,150]\ny = [150,150,75,75]\n" +
//                "z = x-y\ndraw z #0000aa\nz=[260,60,130,130]\nfill z #7bd9ed\nx = [250,50,75,75]\n" +
//                "y = [300,100,100,100]\nz = x+y\ndraw z #00a000\nx = [50,250,150,150]\ny = [75,250,100,100]\n" +
//                "z = x-y\ndraw z #ffe400\nz=[260,260,130,130]\nfill z #ffe400\nx = [250,250,150,25]\n" +
//                "x = x + [250,300,150,25]\nx = x + [250,350,150,25]\nx = x + [250,250,25,50]\n" + 
//                "x = x + [350,300,25,50]\nx = x + [250,350,25,50]\ndraw x #000000"
                
                // smiley
//                "x = [0,0,500,500]\ndraw x #010101\nx = [100,100,50,50]\nfill x #000000\n" +
//                "x = [350,100,50,50]\nfill x #000000\nx = [350,300,50,50]\nfill x #000000\n" +
//                "x = [100,300,50,50]\nfill x #000000\nx = [150,350,200,50]\nfill x #000000\n" +
//                "x = [225,140,50,100]\nfill x #a00000"
                
                // squares
//                "x = [0,0,500,500]\ndraw x #010101\ntl = [100,100,140,140]\ntr = [260,100,140,140]\n" +
//                "bl = [100,260,140,140]\nbr = [260,260,140,140]\nfill tl #ff0000\nfill tr #00ff00\n" +
//                "fill bl #0000ff\nfill br #000000\nc = [220,220,60,60]\nc = c - (tl+tr+bl+br)\n" +
//                "fill c #a0a0a0"
                
//                "draw ([1,1,1,5] + [1,2,2,4] + [1,3,3,3] + [1,4,4,2] + [1,5,5,1]) #00ff00"
//                "draw ([1,1,5,5] + [3,0,1,7] + [0,3,7,1] + [3,3,1,1] + [0,0,1,1] + [6,0,1,1] + [0,6,1,1] + [6,6,1,1]) #00ff00"
                    "fill (((([2,0,5,9]-([2,2,5,2]-[4,2,1,2]))-([4,0,1,9]&[4,7,1,1]+[4,4,1,1]))+([1,1,1,4]+[7,1,1,4])&[0,0,9,9])-(([0,7,9,1]&[6,0,1,9])+([0,7,9,1]&[2,0,1,9])))-([3,6,1,1]+[0,6,9,1]&[5,5,1,4]) #00ff00"
                );
        System.out.println(interpreter.run().toString());
//        interpreter.run().show();

    }

}
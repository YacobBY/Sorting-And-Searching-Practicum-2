package nl.hva.ict.ss.pathfinding.tileworld;

/**
 * Defines constants for RGB colors to be used in the tile world. The colors are
 * derived from the palette used by the program MS paint.
 *
 * @author Dennis Breuker
 * @author Nico Tromp
 */
public interface RGBColor {

    int RGB_WHITE = 0xffffffff;
    int RGB_YELLOW = 0xffffff00;
    int RGB_BLUE = 0xff0000ff;
    int RGB_GREY = 0xff808080;
    int RGB_BLACK = 0xff000000;
    int RGB_RED = 0xffff0000;
    int RGB_GREEN = 0xff00ff00;
    int RGB_CYAN = 0xff00ffff;
    int RGB_PINK = 0xffffc0cb;
}
//Read entire bottom part before opening paint3d:
//Make maps with Paint3d, you can add all these custom colors in the color pallette with the following codes,
//Then use the paint bucket to make a yellow base layer, make a red and green dot with the PIXEL PEN with a density of 1.
//Black is used to draw walls(unpassable terrain), blue is for water (slower). Other colors do something too check their values.

//    int RGB_WHITE =   ffffff
//    int RGB_YELLOW =  ffff00
//    int RGB_BLUE =    0000ff
//    int RGB_GREY =    808080
//    int RGB_BLACK =   000000
//    int RGB_RED =     ff0000
//    int RGB_GREEN =   00ff00
//    int RGB_CYAN =    00ffff
//    int RGB_PINK =    ffc0cb
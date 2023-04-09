import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

/** Protector de pantalla basado en lineas
 *
 * @author Brandon Paez
 *
 * @version 1.0 09/04/2023
 */

public class Main {

    public static void main(String[] args) {


        //Se declaran las bases para generar la primera linea inicial
        double minimo = -1.0;
        double maximo = 1.0;

        //Rango del dibujo
        double rangoMinimo = -2.0;
        double rangoMaximo = 2.0;

        //Definicion de la escala
        StdDraw.setXscale(rangoMinimo, rangoMaximo);
        StdDraw.setYscale(rangoMinimo, rangoMaximo);

        //Evitar el parpadeo de las lineas al moverse
        StdDraw.enableDoubleBuffering();


        //Generacion de un par ordenado (variables generadas aleatoriamente) para la primera linea
        double x = minimo + (maximo - minimo) * Math.random();
        double y = minimo + (maximo - minimo) * Math.random();
        double x0 = minimo + (maximo - minimo) * Math.random();
        double y0 = minimo + (maximo - minimo) * Math.random();


        // Se declaran las variables que determiann la posicion de la segunda linea

        double x1 = x-0.08;
        double y1 = y-0.08;
        double x2 = x0-0.08;
        double y2 = y0-0.08;

        //Se declaran las variables que determinan la posicion de la tercera linea

        double x3 = x1-0.08;
        double y3 = y1-0.08;
        double x4 = x2-0.08;
        double y4 = y2-0.08;

        //Se declaran las variables que determinan la posicion de la cuarta linea

        double x5 = x3-0.08;
        double y5 = y3-0.08;
        double x6 = x4-0.08;
        double y6 = y4-0.08;

        //Se declaran las variables que determinan la posicion de la quinta linea

        double x7 = x5-0.08;
        double y7 = y5-0.08;
        double x8 = x6-0.08;
        double y8 = y6-0.08;

        //Se declaran las variables que determinan la posicion de la sexta linea

        double x9 = x7-0.08;
        double y9 = y7-0.08;
        double x10 = x8-0.08;
        double y10 = y8-0.08;



        //Se genera aleatoriamente la velocidad/distancia de movimiento de la primera linea

        double vx = 0.002 * Math.random();
        double vy = 0.002 * Math.random();
        double vx0 = 0.002 * Math.random();
        double vy0 = 0.002 * Math.random();

        //Se define la velocidad/distancia de movimiento de la segunda linea

        double vx1 = vx;
        double vy1 = vy;
        double vx2 = vx0;
        double vy2 = vy0;

        //Se define la velocidad/distancia de movimiento de la tercera linea

        double vx3 = vx;
        double vy3 = vy1;
        double vx4 = vx0;
        double vy4 = vy0;

        //Se define la velocidad/distancia de movimiento de la cuarta linea

        double vx5 = vx;
        double vy5 = vy;
        double vx6 = vx0;
        double vy6 = vy0;

        //Se define la velocidad/distancia de movimiento de la quinta linea

        double vx7 = vx;
        double vy7 = vy;
        double vx8 = vx0;
        double vy8 = vy0;

        //Se define la velocidad/distancia de movimiento de la sexta linea

        double vx9 = vx;
        double vy9 = vy;
        double vx10 = vx0;
        double vy10 = vy0;



        //Las lineas se mueven de forma indefinida en este ciclo infinito

        while (true){


            //Colisiones de la primera linea

            if (Math.abs (x + vx) > 2.0) {
                vx = -vx;
            }

            if (Math.abs (y + vy) > 2.0) {
                vy = -vy;
            }

            if (Math.abs (x0 + vx0) > 2.0) {
                vx0 = -vx0;
            }

            if (Math.abs (y0 + vy0) > 2.0) {
                vy0 = -vy0;
            }


            //Colisiones de la segunda linea

            if (Math.abs (x1 + vx1) > 2.0) {
                vx1 = -vx1;
            }

            if (Math.abs (y1 + vy1) > 2.0) {
                vy1 = -vy1;
            }

            if (Math.abs (x2 + vx2) > 2.0) {
                vx2 = -vx2;
            }

            if (Math.abs (y2 + vy2) > 2.0) {
                vy2 = -vy2;
            }


            //Colisiones de la tercera linea

            if (Math.abs (x3 + vx3) > 2.0) {
                vx3 = -vx3;
            }

            if (Math.abs (y3 + vy3) > 2.0) {
                vy3 = -vy3;
            }

            if (Math.abs (x4 + vx4) > 2.0) {
                vx4 = -vx4;
            }

            if (Math.abs (y4 + vy4) > 2.0) {
                vy4 = -vy4;
            }


            //Colisiones de la cuarta linea

            if (Math.abs (x5 + vx5) > 2.0) {
                vx5 = -vx5;
            }

            if (Math.abs (y5 + vy5) > 2.0) {
                vy5 = -vy5;
            }

            if (Math.abs (x6 + vx6) > 2.0) {
                vx6 = -vx6;
            }

            if (Math.abs (y6 + vy6) > 2.0) {
                vy6 = -vy6;
            }


            //Colisiones de la quinta linea

            if (Math.abs (x7 + vx7) > 2.0) {
                vx7 = -vx7;
            }

            if (Math.abs (y7 + vy7) > 2.0) {
                vy7 = -vy7;
            }

            if (Math.abs (x8 + vx8) > 2.0) {
                vx8 = -vx8;
            }

            if (Math.abs (y8 + vy8) > 2.0) {
                vy8 = -vy8;
            }


            //Colisiones de la sexta linea

            if (Math.abs (x9 + vx9) > 2.0) {
                vx9 = -vx9;
            }

            if (Math.abs (y9 + vy9) > 2.0) {
                vy9 = -vy9;
            }

            if (Math.abs (x10 + vx10) > 2.0) {
                vx10 = -vx10;
            }

            if (Math.abs (y10 + vy10) > 2.0) {
                vy10 = -vy10;
            }



            // Se actualiza la posicion de la primera linea

            x += vx;
            y += vy;
            x0 += vx0;
            y0 += vy0;

            // Se actualiza la posicion de la segunda linea

            x1 += vx1;
            y1 += vy1;
            x2 += vx2;
            y2 += vy2;

            // Se actualiza la posicion de la tercera linea

            x3 += vx3;
            y3 += vy3;
            x4 += vx4;
            y4 += vy4;

            // Se actualiza la posicion de la cuarta linea

            x5 += vx5;
            y5 += vy5;
            x6 += vx6;
            y6 += vy6;

            // Se actualiza la posicion de la quinta linea

            x7 += vx7;
            y7 += vy7;
            x8 += vx8;
            y8 += vy8;

            // Se actualiza la posicion de la sexta linea

            x9 += vx9;
            y9 += vy9;
            x10 += vx10;
            y10 += vy10;


            //Se limpia el fondo para que se mantenga actualizado

            StdDraw.clear();


            // Se dibuja la primera linea y se pinta

            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.line(x, y, x0, y0);

            // Se dibuja la segunda linea y se pinta

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(x1, y1, x2, y2);

            //Se dibuja la tercera linea y se pinta

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(x3, y3, x4, y4);

            //Se dibuja la cuarta linea y se pinta

            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(x5, y5, x6, y6);

            //Se dibuja la quinta linea y se pinta

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(x7, y7, x8, y8);

            //Se dibuja la sexta linea y se pinta

            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(x9, y9, x10, y10);


            // Se muestra el lienzo

            StdDraw.show();

        }
    }
}

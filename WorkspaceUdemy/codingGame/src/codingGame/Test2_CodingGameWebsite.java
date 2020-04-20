package codingGame;

import java.util.*;
import java.io.*;
import java.math.*;

public class Test2_CodingGameWebsite {

	public static void main(String[] args) {

		/**
		 * The while loop represents the game. Each iteration represents a turn of the
		 * game where you are given inputs (the heights of the mountains) and where you
		 * have to print an output (the index of the mountain to fire on) The inputs you
		 * are given are automatically updated according to your last actions.
		 **/

	       Scanner in = new Scanner(System.in);

	        // game loop
	        while (true) {
	            int max = 0;
	            int imax = 0;
	            for (int i = 0; i < 8; i++) {
	                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
	                if (mountainH > max) {
	                    max = mountainH;
	                    imax = i;
	                }
	            }

	            System.out.println(imax);
	        }
	    }
	}

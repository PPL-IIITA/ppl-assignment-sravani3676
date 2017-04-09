/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author sravani
 */
public class rand {
     public int getRandomNumberInRange(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
    public float getRandomFNumberInRange(float min, float max) {
		return (float)(Math.random() * ((max - min) + 1)) + min;
	}
}

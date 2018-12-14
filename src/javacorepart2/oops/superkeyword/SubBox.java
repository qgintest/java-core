package javacorepart2.oops.superkeyword;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class SubBox extends Box {

	//super keyword is used to call base/parent class constructor
	//this keyword is used to call current class constructor
	public void calculateVolume(int length, int width, int height){
		double volume = super.calculateArea(length, width) * height;
		System.out.println("Volume: " + volume);
	}
	
}

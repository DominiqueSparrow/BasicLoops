package faceinter;

public class Test {
	public static void main(String args[]) {
		IMakeSound [] noiseMakers = { new Duck(), new ElPolako(), new Gopnik()};
		for (int i = 0;i<noiseMakers.length;i++) {
			makeNoise(noiseMakers[i]);
				
		}
	}

	static void makeNoise(IMakeSound soundmaker) {
		System.out.println(soundmaker.greet());
		System.out.println(soundmaker.shout());
	}
}

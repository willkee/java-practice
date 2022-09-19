package q2;

public class Parachute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pull();
	}
	
	static void pull() throws DeploymentException {
		if (Math.random() < 0.001) {
			throw new DeploymentException();
		}
	}
}
// Custom exception

class DeploymentException extends RuntimeException {
	
}
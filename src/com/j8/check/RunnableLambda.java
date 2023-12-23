package com.j8.check;


	public class RunnableLambda {
		public static void main(String args[]) {
			Thread lambdaThread = new Thread(() -> {
				try {
					String lambda = "Java 8 With Lambda";
					for (int i = 0; i < lambda.length(); i++) {
						System.out.print(lambda.charAt(i));
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		lambdaThread.run();
		}
}
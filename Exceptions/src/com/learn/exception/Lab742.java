package com.learn.exception;

public class Lab742 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");
		JLCResource res1 = null;
		JLCResource res2 = null;
		try {
			res1 = new JLCResource(1);
			res2 = new JLCResource(2);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (res2 != null)
				res2.close();
			if (res1 != null)
				res1.close();
		}

		System.out.println("Main Ends");
	}
}

class JLCResource implements AutoCloseable {
	int id;

	public JLCResource(int id) {
		this.id = id;
	}

	public void close() throws Exception {
		System.out.println("JLCResource Closed: " + id);
	}
}

/*
 * 
 * Main Started JLCResource Closed: 2 JLCResource Closed: 1 Main Ends
 * 
 * 
 * 
 */

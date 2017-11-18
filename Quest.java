package by.http.exception.athometwo;

public class Quest {
	private int qQ;

	public Quest(int q) {
		qQ = 12 / q;// 1
	}

	public int getQQ() {
		return qQ;// 2
	}

	public static void main(String[] args) {
		Quest quest = null;
		try {
			quest = new Quest(0);// 3
		} catch (Exception e) {// 4
		}
		// fails in the next line, but if to make Quest quest = new Quest (1) in line 15, then NPE is not shown
		// or
		// set 1 instead of 0 in line 17: quest = new Quest(1)
		System.out.println(quest.getQQ());// 5
	}
}
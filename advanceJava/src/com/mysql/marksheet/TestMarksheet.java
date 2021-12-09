package com.mysql.marksheet;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testDelete();
		testGet();
		// testMeritList();
		//testSearch();
	}

	private static void testMeritList() throws Exception {
		MarksheetModal m = new MarksheetModal();
		m.getMeritList("rays12");
	}

	private static void testSearch() throws Exception {
		MarksheetModal m = new MarksheetModal();
		m.search();
	}

	private static void testGet() throws Exception {
		MarksheetModal m = new MarksheetModal();
		m.get("rays13");
		
	}

	private static void testDelete() throws Exception {
		MarksheetModal m = new MarksheetModal();
		m.delete("rays13");
	}

	private static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(2);
		bean.setRollNo("rays13");
		bean.setName("dhwani");
		bean.setC(90);
		bean.setP(67);
		bean.setM(78);
		MarksheetModal m = new MarksheetModal();
		m.update(bean);
	}

	public static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(1);
		bean.setRollNo("rays12");
		bean.setName("yashi");
		bean.setC(88);
		bean.setP(99);
		bean.setM(77);
		MarksheetModal m = new MarksheetModal();
		m.add(bean);
	}

}

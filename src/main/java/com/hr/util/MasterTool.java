package com.hr.util;

public class MasterTool {

	public static boolean isSuccess(Integer val) {
		boolean f = false;
		if (val != null) {
			if (val > 0) {
				f = true;
			}
		}

		return f;

	}

}

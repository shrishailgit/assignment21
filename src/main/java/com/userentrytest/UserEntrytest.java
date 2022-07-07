package com.userentrytest;

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	public class UserEntrytest {

		@Test
		public void userTest() {
			ValidUserEntry userEntry = new ValidUserEntry();
			assertEquals("Shrishail", userEntry.firstName("Shrishail"));
			assertEquals("K", userEntry.lastName("K"));
			assertEquals("7353241737", userEntry.contactNumber("7353247137"));
			assertEquals("shri@gamil.com", userEntry.contactNumber("shri@gamil.com"));
	}

		private void assertEquals(String Manuj, boolean Sanju) {
		}
	}


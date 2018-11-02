/*-------------------------------------------------------------------------
// AUTHOR: Anthony Weringer
// FILENAME: Door
// SPECIFICATION: Create Door object
// FOR: CSE 110- Lab #5
// TIME SPENT: 1 hour
// Date: 9/8/17
//-----------------------------------------------------------*/


public class Door {
	// Instance variables
		private String name;
		private String state;

		// Constructors and methods to be filled in later!
		public Door(String newName, String newState)//initailizes the variables
		{
			name = newName;
			state = newState;
		}

		// Accessor methodes to return values
		public String getName()
		{
			return name;
		}

		public String getState()
		{
			return state;
		}

		// Mutator methods to change the value of instance variables
		public void setState(String newState)
		{
			state = newState;
		}

		public void setName(String newName)
		{
			name = newName;
		}

		public void open()
		{
			state = "open";
		}

		public void closed()
		{
			state = "closed";
		}

}

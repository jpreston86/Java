Class Human:
	public void thatsGreat() //changed String to void
	{
//		return "Alright!";
		System.out.println("Alright!");
	} // End thatsGreat
	
	public void thatsOK() //changed String to void
	{
//		return "Oh well...";
		System.out.println("OK");
	} // End thatsOK

Class Student:
	public void expression() //changed String to void
	{
		final double avg;
		avg = calcAvg();
		if (avg >= 75) {
//			return thatsGreat();
			thatsGreat();
		} else {
//			return thatsOK();
			thatsOK();
		}
	} // End expression

Main method:
	public static void main (String args[]) {
		
		Human human1 = new Human();
		human1.thatsGreat();
		human1.thatsOK();
		System.out.println();
		
		Student student1 = new Student(65,75,73);
		Student student2 = new Student(86,90,91);
		
		System.out.println("Student 1: ");
		Student.displayScores();
		System.out.println("\nStudent 2: ");
		Student.displayScores();
		
		System.out.println();
		student1.expression();
	}

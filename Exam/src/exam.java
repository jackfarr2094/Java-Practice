class Exam {
	private int TotalMarks;
		public Exam (int marks) {
			TotalMarks = marks;
			int school;
			int college;
			int uni;
		}
		public void ShowResults (int marks) {
			float per = (float) marks*100/TotalMarks;
					if(per>=60) {
						System.out.println("Total Marks:" + per);}
						else {
							System.out.println("You my friend have failed the exam");
						}
					}
		}
//close off your if from your else statement

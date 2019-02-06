package homework;



	public abstract class StarSystem {

		private String StSysName;
		private int StSysAge;

		public StarSystem() {

		}

		public long getStSysAge() {
			return StSysAge;
		}

		public void setStSysAge(int StSysAge) {
			this.StSysAge = StSysAge;
		}

		public String getSStSysName() {
			return StSysName;
		}

		public void setStSysName(String StSysName) {
			this.StSysName = StSysName;
		}

		public abstract void printAllInf();

		public abstract void printStSysInf();

		
		public void printStarSystemAge() {
			System.out.println("Age: " + StSysAge);
		}

		public void printStarSystemName() {
			System.out.println("Name: " + StSysName);
		}
}

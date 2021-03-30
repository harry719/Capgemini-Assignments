abstract class persistence {
abstract String persist();
}
class Filepersistence extends persistence{
	@Override
	String persist() {
		return "At filePersistence";
	}
}
	class DatabasePersistence extends persistence{
		@Override
		String persist() {
				return "At databasePersistence";
		}
		}

	class main{
		public static void main(String[] args) {
			System.out.println("Persistence assignment:->");
			persistence p;
			p=new Filepersistence();
			p.persist();
			p=new DatabasePersistence();
			p.persist();
		}
	}
	



abstract class shape {
abstract void draw();
}
class rectangle extends shape{
	void draw() {
		System.out.println("rectangle is drawing");
	}
}
class line extends shape{
	void draw() {
		System.out.println("line is drawing");
	}
}
	class cube extends shape{
		void draw() {
			System.out.println("cube is drawing ");
		}
	}

	class main{
		public static void main(String[] args) {
			
			shape s;
			s=new rectangle();
			s.draw();
			s=new cube();
			s.draw();
			s=new line();
			s.draw();
			
		}
		
	}
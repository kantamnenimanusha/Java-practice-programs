package javacore;
 class papa {
}
	class daughter extends papa{
		
	}
	class son extends papa{
		public static void main(String[] args) {

		papa p=new daughter();
		son s=(son)p;
		}
	}




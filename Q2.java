class main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[4];
		for(int i = 0; i < 3; ++i)
			array[i] = sc.nextInt();
		int n = sc.nextInt();
		int diff = Integer.MAX_VALUE;
		String lab = "No Lab";
		for(int i = 0; i < 3; ++i) {
			if(n <= array[i] && array[i] - n < diff) {
				diff = array[i] - n;
				lab =  Integer.toString(i + 1);
			}
		}
		System.out.println("Lab L" + lab + " is the most suitable");
		
	}
}

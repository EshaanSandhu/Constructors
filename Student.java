class Student{
	String names;
	String name;
	Student()
		{
		name =  "Unknown";
		}
	Student(String names)
		{
		name = names;
		}
	public static void main(String args[])
		{
		Student obj1 = new Student();
		obj1.names = "Eshaan";
		System.out.println(obj1.names);
}
}
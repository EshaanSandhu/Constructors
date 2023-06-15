class Student{
	String name;
	Student()
		{
		name =  "Unknown";
		System.out.println("In first:");
		}
	Student(String name)
		{
		this.name = name;
		System.out.println("In second:"+name);
		}
	public static void main(String args[])
		{
		Student obj1 = new Student();
		Student obj2 = new Student("Eshaan");
}
}